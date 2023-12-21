package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class T2_window extends TestBase {
    @Test
    public void windowHanleTest() {
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> windowHandles = driver.getWindowHandles();

//        for (String window : windowHandles) {
//            driver.switchTo().window(window);
//            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//            if (driver.getCurrentUrl().toLowerCase().contains("etsy")) {
//                break;
//            }
//        }
        //BrowserUtils.switchWindowAndValidate(driver,"facebook.com","facebook");
        BrowserUtils.switchToWindow(driver , "Facebook");
    }
}
