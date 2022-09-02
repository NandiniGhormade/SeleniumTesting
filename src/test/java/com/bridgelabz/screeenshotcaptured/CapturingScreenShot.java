package com.bridgelabz.screeenshotcaptured;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CapturingScreenShot {

    @Test
    public  void capturedScreenshot(){
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Date date = new Date();
        String date1 = date.toString();
        System.out.println(date1);
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);
        driver.get("https://www.whatsapp.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".\\screenshot\\" + date2 + "__actiTIMELoginPage.png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
