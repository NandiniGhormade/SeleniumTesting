package com.bridgelabz.javaexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterText_intoDisabledTextbox {
    @Test
    public static void enterText_intoDisabledTextbox () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/HP/Disabled.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

//        js.executeScript("document.getElementById('t1').value='admin';");
//        js.executeScript("document.getElementById('t1').value='admin';");
        js.executeScript("document.getElementById(id').value='someValue';");
        Thread.sleep(5000);
        // clear the value in second textbox using javascript
        js.executeScript("document.getElementById('t2').value='';");
//        System.out.println("hello world");
//        // enter "manager" in second textbox using javascript
        js.executeScript("document.getElementById('t2').value='manager';");
//        // change the second text box to button type using Javascript
        js.executeScript("document.getElementById('t2').type='button';");
        driver.close();
    }
}
