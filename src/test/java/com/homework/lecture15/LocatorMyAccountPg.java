package com.homework.lecture15;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocatorMyAccountPg extends LocatorLoginPage {
    Actions actions;
    @Test
    public void addDesktoptoWishList() throws InterruptedException {
//        runLoginFeature();
        driver.get("https://demo.nopcommerce.com/");
        actions = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Computers"));
        actions.moveToElement(element).perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("/html/body/div[6]/div[2]/ul[2]/li[1]/ul/li[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("https://demo.nopcommerce.com/lenovo-ideacentre-600-all-in-one-pc")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-3\"]")).click();
    }
}
