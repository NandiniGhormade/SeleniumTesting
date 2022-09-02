package com.bridgelabz.onclick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnclickButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.vtiger.com");
        String xp = "//button[.='Sign in']";

        driver.findElement(By.xpath(xp)).click();

        driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
                driver.findElement(By.xpath(xp)).submit();

    }

}
