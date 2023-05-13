package com.homework.lecture17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenIncognitoChromeBrowser {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities c = DesiredCapabilities.chrome();
        c.setCapability(ChromeOptions.CAPABILITY,options);
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
