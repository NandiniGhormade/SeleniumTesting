package com.bridgelabz.textusingsendkey;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_usingSendkeyMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://locall.host/3000/login.do");
        driver.findElement(By.id("username")).sendKeys("ajit");
        Thread.sleep(2000);

        String value = driver.findElement(By.id("username")).getAttribute("value");
        System.out.println("Value present inside the text box is : "+value);
        driver.findElement(By.id("username")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("againEnteredAjit");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        Thread.sleep(2000);
    }
}
