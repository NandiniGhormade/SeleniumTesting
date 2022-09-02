package com.bridgelabz.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Loctors {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/admin/Desktop/UN.html");
        WebElement unTB = driver.findElement(By.id("user"));
        unTB.clear();
        unTB.sendKeys("nandini2831@gmail.com");
        WebElement passTB = driver.findElement(By.name("n1"));
        passTB.clear();
        Thread.sleep(2000);
        passTB.sendKeys("Nandini@123");
        driver.findElement(By.linkText("Click ActiTIME link")).click();
        Thread.sleep(2000);
    }}


