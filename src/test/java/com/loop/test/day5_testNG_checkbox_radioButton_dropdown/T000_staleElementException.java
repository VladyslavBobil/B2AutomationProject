package com.loop.test.day5_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T000_staleElementException {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(" http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // click the add button
        WebElement addButton = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));

        addButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete button is displayed");
        } else {
            System.out.println("Detele button is not displayed");
        }

        deleteButton.click();

        /*try {
            deleteButton.isDisplayed();
        } catch(StaleElementReferenceException s) {
            System.out.println("Exception handled");
            System.out.println("Element is not displayed any more");
        }*/
    }
}
