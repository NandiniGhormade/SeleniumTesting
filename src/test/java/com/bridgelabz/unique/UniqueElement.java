package com.bridgelabz.unique;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class UniqueElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://locall.host/3000/");
        driver.findElement(By.id("username")).sendKeys("admin");

        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        Thread.sleep(3000);
        WebElement logoutBtn = driver.findElement(By.xpath("//a[.='Logout']"));
        if (logoutBtn.isDisplayed()) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is NOT displayed");
        }
    }

}
