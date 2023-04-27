package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJUnit {
    @Test
    public void openNetflixURL(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/gb/");
        driver.close();
    }
    @Test
    public void openNextURL(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");
        driver.close();
    }
    @Test
    public void openDiYURL(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.diy.com/");
        driver.close();
    }
    public void openBnQURL(){

    }
}
