package com.loop.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    /**
     * @param browserType
     * @return the browser
     * @autor nsh
     */
    public static WebDriver getDriver ( String browserType){
        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver();
            return new ChromeDriver();
        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver();
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver();
            return new SafariDriver();
        }else {
            System.out.println("Driver is null");
            return null;
        }
    }
}
