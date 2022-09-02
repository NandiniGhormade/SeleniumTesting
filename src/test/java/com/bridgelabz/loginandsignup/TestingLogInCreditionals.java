package com.bridgelabz.loginandsignup;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingLogInCreditionals {
    @Test
    public void testingSignUpCreditionals () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\SeleiumDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Nandini");
        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("Ghormade");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("nandini2831@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nandini2831@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("Nandini@1234");
        Thread.sleep(2000);

        Select selectDay = new Select( driver.findElement(By.name("birthday_day")));
        selectDay.selectByVisibleText("28");
        Thread.sleep(2000);

        Select selectMonth = new Select( driver.findElement(By.name("birthday_month")));
        selectMonth.selectByVisibleText("july");
        Thread.sleep(2000);

        Select selectYear = new Select( driver.findElement(By.name("birthday_year")));
        selectYear.selectByVisibleText("1996");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.close();

    }
    @Test
    public void testingLogInCreditionals() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("email")).sendKeys("nandini2831@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Nandini@1234");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
    }

}
