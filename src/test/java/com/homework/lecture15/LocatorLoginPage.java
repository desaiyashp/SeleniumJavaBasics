package com.homework.lecture15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLoginPage {
    WebDriver driver;
    @Test
    public void runLoginFeature() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.name("Email")).sendKeys("abcd@wxyz.com");
        driver.findElement(By.id("Password")).sendKeys("abcd1234");
        Thread.sleep(2000);
        driver.findElement(By.className("login-button")).click();

    }
}
