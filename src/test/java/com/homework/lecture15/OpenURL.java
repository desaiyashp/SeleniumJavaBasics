package com.homework.lecture15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;

public class OpenURL {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.diy.com/");
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.argos.co.uk/?clickOrigin=header:cat:argos+logo");
        Thread.sleep(3000);
        driver.quit();

//        System.setProperty("webdriver.edge.driver", "C:\\Users\\Administrator\\Desktop\\edgedriver_win64");
//        WebDriverManager.edgedriver().setup();
//        WebDriver edgeDriver = new EdgeDriver();
//        edgeDriver.manage().window().maximize();
//        edgeDriver.get("https://www.next.co.uk/");
//        Thread.sleep(3000);
//        edgeDriver.close();
    }
}

