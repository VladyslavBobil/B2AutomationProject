package com.loop.test.day4_xpath_find_element;

import com.loop.test.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T1_findElements{
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.nba.com");

        List<WebElement> nbaLinks = driver.findElements(By.xpath("//a"));
        System.out.println("nbaLinkXpath.size() = " + nbaLinks.size());

        for (WebElement nbaLink : nbaLinks) {
            if(!nbaLink.getText().equals("")) {
                System.out.println("nbaLink = " + nbaLink.getText());
                System.out.println("nbaLink = " + nbaLink.getAttribute("href"));
            }
        }

        for (int i = 0; i < nbaLinks.size(); i++) {
            if(!nbaLinks.get(i).getText().equals("")){
                System.out.println("nba link = " + nbaLinks.get(i).getText());
                System.out.println("nba link = " + nbaLinks.get(i).getAttribute("href"));
            }
        }
    }
}
