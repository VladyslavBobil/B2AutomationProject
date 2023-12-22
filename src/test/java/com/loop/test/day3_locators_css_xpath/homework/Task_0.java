package com.loop.test.day3_locators_css_xpath.homework;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_0 {
    /*
1. go to https://loopcamp.vercel.app/forgot-password.html
2. locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
3. use css
4. verify those elements are displayed
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/forgot-password.html");

        //Forgot Password

        WebElement forgotPassword = driver.findElement(By.xpath("//div[@class='example']"));
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());

        // Email

        WebElement email = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']"));
        System.out.println("email.isDisplayed() = " + email.isDisplayed());

        //email input

        WebElement emailInput = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());

        //Retrieve Password

        WebElement retrievePassword = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());

        //powered

        WebElement powered = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println("powered.isDisplayed() = " + powered.isDisplayed());


    }
}
