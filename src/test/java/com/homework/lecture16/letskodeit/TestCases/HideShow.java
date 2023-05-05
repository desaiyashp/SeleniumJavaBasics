package com.homework.lecture16.letskodeit.TestCases;

import com.homework.lecture16.letskodeit.PreAndPostCondition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import java.util.logging.StreamHandler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HideShow extends PreAndPostCondition {
    WebElement hideButtonElement = driver.findElement(By.cssSelector("input#hide-textbox"));
    WebElement showButtonElement = driver.findElement(By.id("show-textbox"));
    WebElement inputBoxElement = driver.findElement(By.id("show-textbox"));

    @Test
    public void checkHideButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        hideButtonElement.click();                 // Hiding the input text
        Thread.sleep(3000);
        boolean ans = inputBoxElement.isDisplayed();                // display method giving incorrect result
        assertTrue(ans);
    }
    @Test
    public void checkShowButton() throws InterruptedException {
        boolean ans = inputBoxElement.isDisplayed();
        if (ans == true) {
            Thread.sleep(2000);
            hideButtonElement.click();
            Thread.sleep(2000);
        } else {
            showButtonElement.click();
            inputBoxElement.sendKeys("This field is Enable now.");
        }
    }
}
