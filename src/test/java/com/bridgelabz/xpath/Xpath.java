package com.bridgelabz.xpath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
     @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://locall.host/8000/login.do");


        String xp = "//input[@class='textField'][ @id = 'username']";
        Thread.sleep(2000);

        driver.findElement(By.xpath(xp)).sendKeys("admin");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        Thread.sleep(2000);

        WebElement clock = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));

        String widthValue = clock.getAttribute("width");

        System.out.println("the width is :"+widthValue);

        System.out.println("the height of the clock element is : "+ clock.getAttribute("height"));

        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
