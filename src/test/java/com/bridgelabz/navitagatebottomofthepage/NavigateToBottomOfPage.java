package com.bridgelabz.navitagatebottomofthepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBottomOfPage {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://seleniumhq.org/download");
        driver.findElement(By.id("close")).click();
//select an element which is present at the bottom of the page
        WebElement element = driver.findElement(By.id("footerLogo"));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(3000);
        element.click();
    }}

