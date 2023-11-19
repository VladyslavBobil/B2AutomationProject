package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utillities.LoopCampConstants;
import com.loop.test.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();

        if(actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual header: \"" + actualHeaderForForm + "\" = Test PASSED");
        } else {
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual header: \"" + actualHeaderForForm);
            System.err.println("TEST FAILED");
        }

        WebElement userNamePLaceHolder = driver.findElement(By.name("username"));
        String actualPlaceHolderForUsername = userNamePLaceHolder.getAttribute("placeholder");

        if(actualPlaceHolderForUsername.equals(LoopCampConstants.EXPECTED_PLACE_HOLDER_USERNAME)){
            System.out.println("Expected placeholder for username: \"" + LoopCampConstants.EXPECTED_PLACE_HOLDER_USERNAME + "\", matches actual placeholder: \"" + actualPlaceHolderForUsername + "\" = Test PASSED");
        } else {
            System.out.println("Expected placeholder for username: \"" + LoopCampConstants.EXPECTED_PLACE_HOLDER_USERNAME + "\", DOES NOT match aplaceholder: \"" + actualPlaceHolderForUsername);
            System.err.println("TEST FAILED");
        }




    }
}
