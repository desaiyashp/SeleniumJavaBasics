package com.homework.lecture16.letskodeit.TestCases;

import com.homework.lecture16.letskodeit.PreAndPostCondition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckBox extends PreAndPostCondition {
//    @Before
//    public void setupCheckBox(){
//        ((JavascriptExecutor) driver).executeScript("window.open()");
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        driver.get(url);
//    }
    WebElement bmwElement = driver.findElement(By.id("bmwcheck"));
    WebElement benzElement = driver.findElement((By.cssSelector("input#benzcheck")));
    WebElement hondaElement = driver.findElement(By.xpath("//input[@id=\"hondacheck\"]"));

    @Test
    public void selectBmwCheckBox() throws InterruptedException {
        bmwElement.click();
        boolean ans = bmwElement.isSelected();
        assertTrue(ans);
        boolean ans1 = benzElement.isSelected();
        assertFalse(ans1);
        boolean ans2 = hondaElement.isSelected();
        assertFalse(ans2);
        Thread.sleep(2000);
    }
    @Test
    public void selectBenzCheckBox() throws InterruptedException {
        benzElement.click();
        boolean ans = benzElement.isSelected();
        assertTrue(ans);
        boolean ans1 = bmwElement.isSelected();
        assertFalse(ans1);
        boolean ans2 = hondaElement.isSelected();
        assertFalse(ans2);
        Thread.sleep(2000);
    }
    @Test
    public void selectHondaCheckBox() throws InterruptedException {
        hondaElement.click();
        boolean ans = hondaElement.isSelected();
        assertTrue(ans);
        boolean ans1 = bmwElement.isSelected();
        assertFalse(ans1);
        boolean ans2 = benzElement.isSelected();
        assertFalse(ans2);
        Thread.sleep(2000);
    }
    @Test
    public void selectAllCheckBox() throws InterruptedException {
        benzElement.click();
        bmwElement.click();
        hondaElement.click();
        boolean ans = hondaElement.isSelected();
        assertTrue(ans);
        boolean ans1 = bmwElement.isSelected();
        assertTrue(ans1);
        boolean ans2 = benzElement.isSelected();
        assertTrue(ans2);
        Thread.sleep(2000);
    }
//    @After
//    public void tearDownCheckBox() throws InterruptedException {
//        driver.close();
//        Thread.sleep(2000);
//    }
}
