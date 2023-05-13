package com.homework.lecture17.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class NewWindowInChrome {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.letskodeit.com/practice");
    }
    @Test
    public void openNewWindow() throws InterruptedException {

//        Actions actions = new Actions(driver);
//        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");
//        actions.keyDown("CONTROL").sendKeys('t').keyUp("CONTROL").perform();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getWindowHandles());
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
    }
@After
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
