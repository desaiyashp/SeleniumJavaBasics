package com.homework.lecture15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRegiPg {
    @Test
    public void openNopCommerce() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
        driver.findElement(By.name("FirstName")).sendKeys("abcd");
        driver.findElement(By.id("LastName")).sendKeys("wxyz");
        driver.findElement(By.name("DateOfBirthDay")).click();
        driver.findElement(By.id("Email")).sendKeys("abcd@wxyz.com");
//        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("abcd1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd1234");
        Thread.sleep(3000);
        driver.findElement(By.className("register-next-step-button")).click();
//        Thread.sleep(2000);
        driver.close();
    }
}