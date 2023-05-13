package com.homework.lecture17;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {
    static WebDriver driver;
    @Before
    public static void setUp(){
        System.setProperty("webdriver.edge.driver", "C:\\Windows\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @After
    public static void tearDown(){
        driver.close();
    }
}
