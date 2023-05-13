package com.homework.lecture17.hw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NewWindowInEdge {
    WebDriver driver;
    String url = "https://www.letskodeit.com/practice";
    @Before
    public void setUp(){
        System.setProperty("webdriver.edge.driver", "C:\\Windows\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void openNewWindow() throws InterruptedException {
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        driver.findElement(By.cssSelector("#opentab")).click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles){
            if (!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                driver.findElement(By.xpath("//input[@name=\"course\"]")).sendKeys("Python", Keys.ENTER);
                Thread.sleep(3000);
                driver.close();
            }
        }

        driver.switchTo().window(parentWindowHandle);
        driver.findElement(By.cssSelector("#bmwradio")).click();
        Thread.sleep(3000);
    }


    @After
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
