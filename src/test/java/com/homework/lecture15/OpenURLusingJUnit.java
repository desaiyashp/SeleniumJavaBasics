package com.homework.lecture15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class OpenURLusingJUnit {
    WebDriver driver;
    ArrayList tabs;
    @Before
    public void openWebBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openNextURL(){
        driver.get("https://www.next.co.uk/");
    }
//    @Before
//    public void openNewTab(){
//        ((JavascriptExecutor) driver).executeScript("window.open()");
//        tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//    }
    @Test
    public void openAmazonURL(){
        driver.get("https://www.amazon.co.uk/");
    }
    @Test
    public void openDiyURL(){
        driver.get("https://www.diy.com/");
    }
    @Test
    public void openArgosURL(){
        driver.get("https://www.argos.co.uk/");
        }
    @Test
    public void openJohnLewisURL(){
        driver.get("https://www.johnlewis.com/");
    }
    @After
    public void tearDownWindows() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
