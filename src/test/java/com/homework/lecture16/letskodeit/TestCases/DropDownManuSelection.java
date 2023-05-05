package com.homework.lecture16.letskodeit.TestCases;

import com.homework.lecture16.letskodeit.PreAndPostCondition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownManuSelection extends PreAndPostCondition {
    WebElement carElement = driver.findElement(By.cssSelector("select#carselect"));
    @Test
    public void selectCar() throws InterruptedException {
     Select selectCar = new Select(carElement);
     selectCar.selectByIndex(1);
     Thread.sleep(3000);
     selectCar.selectByValue("honda");
     Thread.sleep(3000);
     selectCar.selectByVisibleText("BMW");
     Thread.sleep(3000);
    }
}
