package com.loop.test.day9_config_driver.homework;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class Task_1 {
    /*
    Practice Task
============

how to do tasks
1. Group lead creates a user story for each task
2. Group lead will create just 1 Test plan for whole sprint
3. Every member of the group will create his/her own test execution - just one for whole sprint and will use it
4. Every member of the group will create his/her test for each task

==================

task1
============
1. go to url: https://loopcamp.vercel.app/registration_form.html
2. fill the form
3. use faker
     */
    @Test
    public void registrationForm (){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        Faker faker = new Faker();
        String fakerName = faker.name().firstName();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys(fakerName);

        String fakerLastName = faker.name().lastName();
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(fakerLastName);

        String fakerUsername = faker.name().username();
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(fakerName + fakerLastName);

        String fakerEmail = fakerName.toLowerCase() + fakerLastName.toLowerCase() + "@gmail.com";
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(fakerEmail);

        String fakerPassword = faker.bothify("????????");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(fakerPassword);

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.bothify("###-###-####"));

        WebElement gender = driver.findElement(By.xpath("//input[@value='male']"));
        gender.click();

        WebElement birthDay = driver.findElement(By.xpath("//input[@name = 'birthday']"));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String fakerBirthDay = sdf.format(faker.date().birthday());
        birthDay.sendKeys(fakerBirthDay);

        Select selectDepartment = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        selectDepartment.selectByIndex(faker.number().numberBetween(1,9));

        Select jobTitle = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

        String [] language = {"cplusplus","java","javascript"};
        String languageChose = language[faker.number().numberBetween(0,2)];
        WebElement languageChoser = driver.findElement(By.xpath("//input[@value='" + languageChose + "']"));
        languageChoser.click();

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();


    }
}
