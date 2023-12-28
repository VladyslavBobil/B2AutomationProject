package com.loop.test.day3_locators_css_xpath.homework;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_3 {
    /*
    Task 3
================
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement gMail = driver.findElement(By.xpath("//a[text()='Gmail']"));
        gMail.click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test passed ");
        }else{
            System.out.println("test failed");
        }

        driver.navigate().back();
        String expectedTitle_two = "Google";
        String actualTitle_two = driver.getTitle();

        if (expectedTitle_two.contains(actualTitle_two)){
            System.out.println("Test passed");;
        }else {
            System.out.println("Test failed");
        }


        driver.quit();
    }
}
