package com.bridgelabz.url;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class URL {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://locall.host/3000/");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        Thread.sleep(3000);
        String expectedUrl = "submit";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Home page is displayed");
        } else{
            System.out.println("Home page is NOT displayed");
        }
    }
}
