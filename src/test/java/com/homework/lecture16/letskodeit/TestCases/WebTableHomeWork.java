package com.homework.lecture16.letskodeit.TestCases;

import com.homework.lecture16.letskodeit.PreAndPostCondition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableHomeWork extends PreAndPostCondition {
    int rowNum, colNum;
    WebElement element;

    @Test
    public void printTable(){
        for (int i = 2; i<=4; i++){
            for (int j = 1; j<=3; j++){
                rowNum = i;
                colNum = j;
                element = driver.findElement(By.xpath("//table/tbody/tr["+rowNum+"]/td["+colNum+"]"));
                String tableContent = element.getText();
                System.out.print(tableContent+" ");
            }
            System.out.println();
        }
    }
}
