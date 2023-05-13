package com.homework.lecture17.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndConfirmTab {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
    }
    @Test
    public void testAlertButton() throws InterruptedException {
        driver.findElement(By.cssSelector("#name")).sendKeys("Yash");
        driver.findElement(By.cssSelector("#alertbtn")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
    @Test
    public void testConfirmButton() throws InterruptedException {
        driver.findElement(By.cssSelector("#name")).sendKeys("Yash");
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
