package com.rw.homework.NopCommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLoginPage {
    static WebDriver chromeDriver;
    @Test
    public void runLoginFeature() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demo.nopcommerce.com/");
        chromeDriver.findElement(By.className("ico-login")).click();
        chromeDriver.findElement(By.name("Email")).sendKeys("abcd@wxyz.com");
        chromeDriver.findElement(By.id("Password")).sendKeys("abcd1234");
        Thread.sleep(2000);
        chromeDriver.findElement(By.className("login-button")).click();

    }
}
