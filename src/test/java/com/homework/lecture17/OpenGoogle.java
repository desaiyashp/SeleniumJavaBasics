package com.homework.lecture17;

import org.junit.Test;
import org.openqa.selenium.By;

public class OpenGoogle extends OpenIncognitoChromeBrowser {
    @Test
    public void openGoogleSearchEngine() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("button#W0wltc")).click();
        Thread.sleep(3000);
    }
}
