package com.homework.lecture16.letskodeit.TestCases;

import com.homework.lecture16.letskodeit.PreAndPostCondition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class MultipleSelection extends PreAndPostCondition {
    WebElement appleElement = driver.findElement(By.xpath("//select[@id=\"multiple-select-example\"]"));
    Select select;
    Actions actions;

    @Test
    public void selectMultipleOptions() throws InterruptedException {
        select = new Select(appleElement);
        actions = new Actions(driver);
        select.selectByVisibleText("Peach");
//        Thread.sleep(3000);
        actions.keyDown(Keys.valueOf("CONTROL"));
        select.selectByValue("apple");
//        Thread.sleep(3000);
        select.selectByIndex(1);
        actions.keyUp(Keys.valueOf("CONTROL"));
//        Thread.sleep(3000);
        boolean ans1 = driver.findElement(By.xpath("//select/option[@value=\"peach\"]")).isSelected();
        assertTrue(ans1);
        boolean ans2 = driver.findElement(By.xpath("//option[@value=\"orange\"]")).isSelected();
        assertTrue(ans2);
    }
}
