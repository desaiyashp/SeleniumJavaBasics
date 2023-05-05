package com.homework.lecture16.letskodeit.TestCases;

import com.homework.lecture16.letskodeit.PreAndPostCondition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class RadioButtonClicks extends PreAndPostCondition {
    WebElement element1 = driver.findElement(By.cssSelector("input#hondaradio"));

    @Test
    public void selectHondaRadioButton() throws InterruptedException {
//        clicking Honda radio button
        element1.click();
        boolean ans = element1.isSelected();
        boolean ans1 = driver.findElement(By.cssSelector("input#bmwradio")).isSelected();
        boolean ans2 = driver.findElement(By.cssSelector("input#benzradio")).isSelected();
        Thread.sleep(2000);
        assertTrue(ans);
        assertFalse(ans1);
        assertEquals(false,ans2);
    }
    @Test
    public void selectBmwRadioButton() throws InterruptedException {
//        clicking BMW radio button
        WebElement bmwRadioElement = driver.findElement(By.cssSelector("input#bmwradio"));
        bmwRadioElement.click();
        boolean ans1 = bmwRadioElement.isSelected();
        assertEquals(true, ans1);
        Thread.sleep(2000);
    }
    @Test
    public void selectBenzRadioButton() throws InterruptedException {
//        clicking Benz Radio button
        WebElement benzRadioElement = driver.findElement(By.cssSelector("input#benzradio"));
        benzRadioElement.click();
        boolean ans2 = benzRadioElement.isSelected();
        assertTrue(ans2);
        Thread.sleep(2000);
    }
}
