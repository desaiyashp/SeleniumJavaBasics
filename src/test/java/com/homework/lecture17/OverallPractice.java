package com.homework.lecture17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class OverallPractice {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver=new ChromeDriver(options);
        driver.get("https://www.letskodeit.com/practice");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void openYouTubeVideo(){
        driver.findElement(By.xpath("//button[@aria-label=\"Reject the use of cookies and other data for the purposes described\"]")).click();
//        driver.switchTo().frame("passive_signin");
        WebElement element = driver.findElement(By.cssSelector("input#search"));
        element.sendKeys("Latest Hindi Songs", Keys.ENTER);

    }


    @After
    public void tearDown(){
//        driver.manage().deleteAllCookies();
//        driver.close();
    }
}
