package com.bridgelabz.scrollupanddownforspecificelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDownForSpecificElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
//click on the close icon of the yellow color background pop up
        driver.findElement(By.id("close")).click();
// find the Applitools element on the webpage
        WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
// get the X-coordinate and store in a variable
        int x = ele.getLocation().getX();

// get the Y-coordinate and store in a variable
        int y = ele.getLocation().getY();
        JavascriptExecutor js = (JavascriptExecutor) driver;
//Scroll to Applitools element’s x and y coordinate
        js.executeScript("window.scrollBy("+x+", "+y+")");
        Thread.sleep(3000);
    }}

