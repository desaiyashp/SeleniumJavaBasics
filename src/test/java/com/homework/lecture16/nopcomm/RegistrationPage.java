package com.homework.lecture16.nopcomm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends UseChromeBrowser {

        @Test
    public void registerUser() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.cssSelector("input#gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys(fName);
        driver.findElement(By.id("LastName")).sendKeys(lName);
        WebElement dateElement = driver.findElement(By.name("DateOfBirthDay"));
        Select selectDate = new Select(dateElement);
        selectDate.selectByValue("1");
        WebElement monthElement = driver.findElement(By.name("DateOfBirthMonth"));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByIndex(6);
        WebElement yearElement = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        Select selectYear = new Select(yearElement);
        selectYear.selectByValue("2000");
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(emailAddress);
        driver.findElement(By.id("Company")).sendKeys(companyName);
        WebElement newsletterElement = driver.findElement(By.id("Newsletter"));
        boolean checkNewsLetter = newsletterElement.isSelected();   // checking newsletter box
        if (checkNewsLetter == true){
            newsletterElement.click();    // uncheck newsletter box
        }
        driver.findElement(By.cssSelector("input#Password")).sendKeys(password);
        driver.findElement(By.cssSelector("input[name=\"ConfirmPassword\"]")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[name=\"register-button\"]")).click();
    }
}
