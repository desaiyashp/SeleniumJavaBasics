package com.homework.lecture16.nopcomm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage extends UseMsEdgeBrowser {
//    Login setup
    @Before
    public void login() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.cssSelector("input.email")).sendKeys(emailAddress);
        driver.findElement(By.cssSelector("input#Password")).sendKeys(password);
        WebElement rememberMeElement = driver.findElement(By.id("RememberMe"));
        boolean checkRememberMe = rememberMeElement.isSelected();   // validating Remember Me check box
        if (checkRememberMe == true){
            rememberMeElement.click();           // uncheck remember me
        }
        driver.findElement(By.className("login-button")).click();
    }
//    Accounts Page
    @Test
    public void selectProductCategory(){
        Actions actions = new Actions(driver);             // For keyboard and mouse acitons
        WebElement computerCategoryElement = driver.findElement(By.linkText("Computers"));       // locating element
        actions.moveToElement(computerCategoryElement).perform();               // mouse hover
        driver.findElement(By.linkText("Notebooks")).click();        // locating and selecting element in drop down
    }
}
