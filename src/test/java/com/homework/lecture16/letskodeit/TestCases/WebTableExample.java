package com.homework.lecture16.letskodeit.TestCases;

import com.homework.lecture16.letskodeit.PreAndPostCondition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebTableExample {

    //    List<WebElement> listOfCourse;
    int rowNum;
    int colNum;

    public void getTableValue() {
//        parent class data copied
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.letskodeit.com/practice");
//        new class started
        WebElement tableElement = driver.findElement(By.xpath("//table/tbody/tr[" + rowNum + "]/td[" + colNum + "]"));
        String tableText = tableElement.getText();
        System.out.println(tableText);
    }

    public void makeTable(int rowNum, int colNum) {
        rowNum = this.rowNum;
        colNum = this.colNum;
        WebTableExample ob1 = new WebTableExample();
        ob1.getTableValue();
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.letskodeit.com/practice");
//        WebTableExample obJ = new WebTableExample();
        for (int rowNum = 2; rowNum <= 4; rowNum++) {
            for (int colNum = 1; colNum <= 3; colNum++) {
                WebElement tableElement = driver.findElement(By.xpath("//table/tbody/tr[" + rowNum + "]/td[" + colNum + "]"));
                String tableText = tableElement.getText();
                System.out.print(tableText);
            }
            System.out.println();
        }
//        obJ.makeTable(3,2);


    }
}
