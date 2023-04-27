package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenURL {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

//        WebDriverManager.edgedriver().setup();
//        WebDriver driver1 = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.close();
    }

}
