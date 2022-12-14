package com.bridgelabz.title;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://locall.host/3000/");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        Thread.sleep(3000);
        String expectedTitle = "Enter Time";
        String actualTitle = driver.getTitle();
//If actual title contains "Enter Time" text then home page is displayed.
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Home page is displayed");
        } else{
            System.out.println("Home page is NOT displayed");

        }
    }
}
