package com.homework.lecture16.nopcomm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UseChromeBrowser {
    public static WebDriver driver;
    public String url = "https://demo.nopcommerce.com/";
    public String fName = "abcd";
    public String lName = "wxyz";
    public String emailAddress = "abcd@wxyz.com";
    public String companyName = "ABC Corporation";
    public String password = "abcd@123";

    @BeforeClass
    public static void setUpChrome(){
//        Setting up Chrome driver using WebDriverManager
        WebDriverManager.chromedriver().setup();
//        Launching Google Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void tearDownChrome() throws InterruptedException {
//        closing whole Google Chrome browser
        Thread.sleep(3000);
        driver.quit();
    }
}
