package com.rw.homework.NopCommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRegiPg {
    @Test
    public void openNopCommerce() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        chromeDriver.findElement(By.className("ico-register")).click();
        chromeDriver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
        chromeDriver.findElement(By.name("FirstName")).sendKeys("abcd");
        chromeDriver.findElement(By.id("LastName")).sendKeys("wxyz");
        chromeDriver.findElement(By.name("DateOfBirthDay")).click();

//        chromeDriver.findElement(By.id("Email")).sendKeys("abcd@wxyz.com");
//        Thread.sleep(1000);
//        chromeDriver.findElement(By.id("Password")).sendKeys("abcd1234");
//        chromeDriver.findElement(By.id("ConfirmPassword")).sendKeys("abcd1234");
//        Thread.sleep(1000);
//        chromeDriver.findElement(By.id("register-button")).click();
//        Thread.sleep(2000);
//        chromeDriver.close();
    }
}