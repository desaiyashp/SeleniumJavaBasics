package com.homework.lecture17;

import javafx.animation.KeyValue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class YoutubeVideo extends OpenChromeBrowser {
    @Test
    public void playVideo() throws InterruptedException {
        driver.get("https://www.youtube.com/");
        driver.findElement(By.cssSelector("input#search")).sendKeys("Hindi song", Keys.valueOf("ENTER"));
        Thread.sleep(3000);
    }
}
