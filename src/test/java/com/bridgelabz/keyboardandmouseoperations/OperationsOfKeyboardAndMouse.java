package com.bridgelabz.keyboardandmouseoperations;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class OperationsOfKeyboardAndMouse {
    @Test
    public void TestingWithSelenium () throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);
        Robot r = new Robot();
        r.mouseMove(300, 500);
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_F);
        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);
        Thread.sleep(5000);
        webdriver.close();
        webdriver.quit();
    }
}
