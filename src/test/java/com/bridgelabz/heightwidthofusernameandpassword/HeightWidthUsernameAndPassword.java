package com.bridgelabz.heightwidthofusernameandpassword;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;



public class HeightWidthUsernameAndPassword {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://locall.host/3000/");
//find the username field
        WebElement unTB = driver.findElement(By.id("username"));
//store the height of username
        int username_height = unTB.getSize().getHeight();
//store the width of username
        int username_width = unTB.getSize().getWidth();
        System.out.println(username_height);
        System.out.println(username_width);
//find the password field
        WebElement pwdTB = driver.findElement(By.name("pwd"));
//store the height of password
        int password_height = pwdTB.getSize().getHeight();
//store the width of password
        int password_width = pwdTB.getSize().getWidth();

        System.out.println(password_height);
        System.out.println(password_width);
//check the height and width of username and password fields are same

        if (username_height==password_height && username_width==password_width) {
//            System.out.println("Username and password fields are aligned”);
        }else{
            System.out.println("Username and password fields are NOT aligned");
        }

    }

}
