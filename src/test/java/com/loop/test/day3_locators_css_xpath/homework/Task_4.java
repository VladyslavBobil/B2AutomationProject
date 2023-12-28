package com.loop.test.day3_locators_css_xpath.homework;

import com.loop.test.utilities.WebDriverFactory;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_4 {
    /*
    Task 4
================
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”

     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        WebElement searchBar = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBar.sendKeys("wooden spoon");

        WebElement searchButton = driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']"));;
        searchButton.click();

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (expectedTitle.toLowerCase().contains(actualTitle.toLowerCase())){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        driver.quit();
    }
}
