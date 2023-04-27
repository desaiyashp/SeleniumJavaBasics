package com.rw.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class OpenURLusingJUnit {
    static WebDriver chromeDriver;
    static ArrayList tabs;
    @Before
    public void openWebBrowser() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }
    @Test
    public void openNextURL(){
        chromeDriver.get("https://www.next.co.uk/");
    }
    /*@Before
    public void openNewTab(){
        ((JavascriptExecutor)chromeDriver).executeScript("window.open()");
        tabs = new ArrayList<String>(chromeDriver.getWindowHandles());
        chromeDriver.switchTo().window(tabs.get(1));
    }*/
    @Test
    public void openAmazonURL(){
        chromeDriver.get("https://www.amazon.co.uk/");
    }
    @Test
    public void openDiyURL(){
        chromeDriver.get("https://www.diy.com/");
    }
    @Test
    public void openArgosURL(){
        chromeDriver.get("https://www.argos.co.uk/");
        }
    @Test
    public void openJohnLewisURL(){
        chromeDriver.get("https://www.johnlewis.com/");
    }
    @After
    public void tearDownWindows() throws InterruptedException {
        Thread.sleep(1000);
        chromeDriver.quit();
    }
}
