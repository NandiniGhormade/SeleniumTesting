package com.bridgelabz.javaexecutorforscroll;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScrollUpAndDown {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
//typecasting driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
//scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) {
//scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }}}

