package com.loop.test.day4_xpath_find_element;

import com.loop.test.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_css_isDisplayed {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        WebElement forgetDriverHeading = driver.findElement(By.cssSelector("div[class = 'example'] >h2"));

        if (forgetDriverHeading.isDisplayed()){
            System.out.println("Forget password heading is displayed: ");
        }else {
            System.out.println("Forget password is not displayed : ");
        }




    }
}
