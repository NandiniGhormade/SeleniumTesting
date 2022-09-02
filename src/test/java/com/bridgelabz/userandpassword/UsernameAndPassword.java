package com.bridgelabz.userandpassword;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class UsernameAndPassword {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));

        int username_Ycordinate = unTB.getLocation().getY();
        System.out.println(username_Ycordinate);
        WebElement pwdTB = driver.findElement(By.name("pass"));

        int password_Ycordinate = pwdTB.getLocation().getY();
        System.out.println(password_Ycordinate);


        if (username_Ycordinate==password_Ycordinate) {
            System.out.println("Both username and password fields are displayed in the same row");
        }else{
            System.out.println("username and password fields are NOT aligned in the same row");
        }
    }

}
