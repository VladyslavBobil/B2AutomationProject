package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException{
        // setting up the wb driver
        WebDriverManager.chromedriver().setup();
        // create an instance of web-driver
        WebDriver driver = new ChromeDriver();
        // make a pause , calculate 5 sec ==> 5000 millis
        Thread.sleep(50);

        // navigate to web page
        driver.get("https://www.google.com");
        // same as here ^
        //driver.navigate().to("https://www.google.com");

        // maximize the window which is pup up
        driver.manage().window().maximize();
        // full screen method
        //driver.manage().window().fullscreen();
        // minimize
        //driver.manage().window().minimize();
        driver.navigate().to("https://www.etsy.com");
        // navigate back
        driver.navigate().back();
        // navigate forward
        driver.navigate().forward();
        // navigate refresh
        driver.navigate().refresh();
        // driver.quit and .close ---> quite for tab , close --> close the browser
        //driver.quit();
        driver.close();







    }
}
