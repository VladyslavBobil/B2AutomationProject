package com.loop.test.day4_xpath_find_element;

import com.loop.test.utillities.DocuportConstants;
import com.loop.test.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T000_xpath_getText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://beta.docuport.app");
        WebElement forgotPassword = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgotPassword.click();
        String actualURLForResetPassword = driver.getCurrentUrl();

        if (actualURLForResetPassword.contains(DocuportConstants.RESET_PASSWORD_URL)){
            System.out.println("Test pass : => Actual url : " + actualURLForResetPassword + " contains expected url : " + DocuportConstants.RESET_PASSWORD_URL);
        } else {
            System.out.println("Test failed : => Actual url : " + actualURLForResetPassword + " DOES NOT contains expected url : " + DocuportConstants.RESET_PASSWORD_URL);
        }

        WebElement validateMassage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String actualValidateMassage =  validateMassage.getText();
        System.out.println(actualValidateMassage);

        if (actualValidateMassage.contains(DocuportConstants.RESET_PASSWORD_MASSAGE)){
            System.out.println("Test pass : => Actual  massage : " + actualURLForResetPassword + " contains expected massage : " + DocuportConstants.RESET_PASSWORD_URL);
        }else{
            System.out.println("Test failed : => Actual massage : " + actualURLForResetPassword + " DOES NOT contains expected massage : " + DocuportConstants.RESET_PASSWORD_URL);
        }

        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id,'input')]"));
        emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

        WebElement cancelButton = driver.findElement(By.xpath("//span[normalize-space() = 'Cancel']"));
        WebElement sendButton = driver.findElement(By.xpath("//span[normalize-space() = 'Send']"));

        if(cancelButton.isDisplayed()){
            System.out.println("TEST PASS => Cancel button is displayed");
        } else {
            System.err.println("TEST FAILED => Cancel button is NOT displayed");
        }

        // 8. validate send button is displayed
        if(sendButton.isDisplayed()){
            System.out.println("TEST PASS => Send button is displayed");
        } else {
            System.err.println("TEST FAILED => Send button is NOT displayed");
        }

        sendButton.click();

        Thread.sleep(3000);

        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

        Thread.sleep(10000);


      /*  try{
            System.out.println(successMessage.getText());
        } catch (StaleElementReferenceException e){
            System.out.println("Element is not there anymore");
            //e.printStackTrace();
        }*/
    }
}
