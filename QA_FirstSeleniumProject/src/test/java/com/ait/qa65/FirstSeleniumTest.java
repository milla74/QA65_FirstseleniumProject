package com.ait.qa65;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
WebDriver driver;
    //before - setUP
    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
       // driver.get("https://www.google.com"); //можно заходить без логтнаБкак инкогнито

        //maximize browser to window
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");

        //wait for all elements on the site
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https:www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        // driver.get("https://www.google.com"); //можно заходить без логтнаБкак инкогнито
    }
    //test - ронятное название.пример :открыть браузер.
    @Test
    public void openGoogleTest(){
        System.out.println("Google!!!");
    }
    //after  - tearDown
    @AfterMethod(enabled = true)   //команда,что бы не так быстро менялись страницы
    public void tearDown(){
       // driver.quit();//закрывает таблицы - all Tabs and browser
        driver.close();//закрывает только текущую вкладку.
    }
}
