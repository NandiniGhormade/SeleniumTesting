package com.bridgelabz.textusingclearmethod;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Text_usingClearMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://locall.host/3000/login.do");
        driver.findElement(By.id("username")).sendKeys("Nandini");
        Thread.sleep(2000);
        String value = driver.findElement(By.id("username")).getAttribute("value");
        System.out.println("Value present inside the text box is : "+value);
        driver.findElement(By.id("username")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("againEnteredNandini");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a") ;
        driver.findElement(By.id("username")).sendKeys(Keys.DELETE);
        Thread.sleep(2000);
    }
}
