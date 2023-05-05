package com.homework.lecture16.letskodeit.TestCases;

import com.homework.lecture16.letskodeit.PreAndPostCondition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnableDisable extends PreAndPostCondition {
    WebElement disableButtonElement = driver.findElement(By.xpath("//input[@id=\"disabled-button\"]"));
    WebElement enableButtonElement = driver.findElement(By.cssSelector("input#enabled-button"));
    WebElement inputElement = driver.findElement(By.id("enabled-example-input"));
    @Test
    public void checkDisable() throws InterruptedException {
        disableButtonElement.click();
        boolean ans1 = inputElement.isEnabled();
        assertFalse(ans1);
    }
    @Test
    public void checkEnable() throws InterruptedException {
        boolean ans = inputElement.isEnabled();
        assertTrue(ans);
        inputElement.sendKeys("This field is Enable.");
        Thread.sleep(3000);
    }
}
