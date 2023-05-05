package com.homework.lecture16.nopcomm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class UseMsEdgeBrowser {
    public static WebDriver driver;
    public String url = "https://demo.nopcommerce.com/";
    public String fName = "abcd";
    public String lName = "wxyz";
    public String emailAddress = "abcd@wxyz.com";
    public String companyName = "ABC Corporation";
    public String password = "abcd@123";
    @BeforeClass
    public static void setUpEdge(){
//        Setting up Edge driver manually (using Key and Value pair)
        System.setProperty("webdriver.edge.driver","C:\\Windows\\msedgedriver.exe");
//        Launching MS-Edge
        driver = new EdgeDriver();
        driver.manage().window().maximize();                               // without maximize window does not work in Edge
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void tearDownEdge(){
//        Closing whole Edge Browser
//        driver.quit();
    }
}
