package com.homework.lecture17.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class SwitchToIFrame {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
    }
@Test
    public void switchToIFrame() throws InterruptedException {
//        WebElement iFrame = driver.findElement(By.id("courses-iframe"));
//        String mainWinHandle = driver.getWindowHandle();
//        System.out.println(mainWinHandle);
        driver.switchTo().frame("courses-iframe");
//        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//input[@id=\"search\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        element.sendKeys("Python");
//        Thread.sleep(3000);
        element.sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
    driver.switchTo().defaultContent();
    WebElement element1 = driver.findElement(By.id("bmwcheck"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
    element1.click();
    boolean ans = element1.isSelected();
    assertTrue(ans);
    Thread.sleep(3000);
    }
    public void switchToIFrame2 (){
        driver.switchTo().frame(0);


    }
    @After
    public void tearDown(){
        driver.close();
    }

}
