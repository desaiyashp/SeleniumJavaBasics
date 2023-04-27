package com.rw.homework.NopCommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorMyAccountPg extends LocatorLoginPage {
    static Actions actions;
    @Test
    public void addDesktoptoWishList() throws InterruptedException {
        runLoginFeature();
//        chromeDriver.findElement(By.linkText("https://demo.nopcommerce.com/computers")).click();
//        actions = new Actions(chromeDriver);
//        actions.moveToElement(element).perform();
//        Thread.sleep(1000);
        chromeDriver.findElement(By.linkText("/html/body/div[6]/div[2]/ul[2]/li[1]/ul/li[1]/a")).click();
        Thread.sleep(1000);
        chromeDriver.findElement(By.linkText("https://demo.nopcommerce.com/lenovo-ideacentre-600-all-in-one-pc")).click();
        Thread.sleep(1000);
        chromeDriver.findElement(By.xpath("//button[@id=\"add-to-cart-button-3\"]")).click();
    }
}
