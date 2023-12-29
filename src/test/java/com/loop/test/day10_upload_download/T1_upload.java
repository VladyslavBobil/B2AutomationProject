package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_upload {
@Test
    public void uploadFile () throws InterruptedException {

    Driver.getDriver().get(ConfigurationReader.getProperty("guru.url"));
    WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
    String path = "/Users/vladyslavbobil/Desktop/File_01";
    chooseFile.sendKeys(path);
    WebElement accept = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
    accept.click();
    WebElement submit = Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']"));
    submit.click();
    Thread.sleep(3000);
    WebElement succesMassage = Driver.getDriver().findElement(By.id("res"));
    String expectedMassage = "1 file\n" +
            "has been successfully uploaded.";

    Assert.assertEquals(succesMassage.getText() , expectedMassage);





}


}
    /*
    1. Go to “http://demo.guru99.com/test/upload”
    2. Upload file into Choose File
    3. Click terms of service check box
    4. Click Submit File button
    5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
     */