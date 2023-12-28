package com.loop.test.day3_locators_css_xpath.homework;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
task 1
1. login to docuport application
2. logout from docuport application
3. Validate successful login
4. Validate successful logout
 */
public class Task_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");

        WebElement loginEmail = driver.findElement(By.xpath("//input[@type='text']"));
        loginEmail.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(DocuportConstants.PASSWORD);

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

        Thread.sleep(3000);

        WebElement secondButton = driver.findElement(By.xpath("//button[@type='submit']"));
        secondButton.click();

        WebElement batch = driver.findElement(By.xpath("//span[@class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']"));
        batch.click();

        WebElement logOut = driver.findElement(By.xpath("//div[@class='v-list-item v-list-item--link theme--light'][3]"));;
        logOut.click();


    }
}
