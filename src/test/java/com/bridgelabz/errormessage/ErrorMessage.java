package com.bridgelabz.errormessage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ErrorMessage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://locall.host/3000/login.do");
//click on Login button
        driver.findElement(By.xpath("//div[.='Login ']")).click();
//find the error message element
        WebElement errMsg =
                driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
// get the text of the error message
        String errtext = errMsg.getText();
//print the error message
        System.out.println("error message is :"+errtext);
//get the value of color and store in a variable
        String c = errMsg.getCssValue("color");
//convert the color from string type to hexa form
        String ColorasHex = Color.fromString(c).asHex();
        System.out.println("hexadecimal format : "+ColorasHex);
//        if(ColorasHex.equals(“#ce0100”)),
//        System.out.println(“Error message is in red color”);
//    }else{
//        System.out.println(“Error message is in red color”);
//    }
    //get the size of the font of error message
    String fontSize = errMsg.getCssValue("font-size");

    //get the weight of the font of error message
    String fontWeight = errMsg.getCssValue("font-weight");
System.out.println("Size of the font is :" + fontSize);
System.out.println("Weight of the font is :" + fontWeight);
driver.close();
}

}
