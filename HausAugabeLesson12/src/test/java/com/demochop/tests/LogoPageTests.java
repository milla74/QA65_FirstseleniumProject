package com.demochop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
//рефакторинг. в ручную.

public class LogoPageTests {

        WebDriver driver;
        @BeforeMethod
        public void setUp(){
           driver = new ChromeDriver();
           driver.get("https://demowebshop.tricentis.com/");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
        @Test
        public void isLogoComponentPresentTest(){
           // driver.findElement(By.cssSelector("div:nth-child(1)>div>div>a"));
           // System.out.println("Logo Component" + isLogoComponentPresent());
            Assert.assertTrue(isLogoComponentPresent());

        }
        public boolean isLogoComponentPresent(){
            return driver.findElements(By.cssSelector("div:nth-child(1)>div>div>a")).size()>0;
        }
        public boolean isElementPresent(By locator){
            return driver.findElements(locator).size()>0;
        }
        @AfterMethod(enabled = false)
        public void tearDown(){
            driver.quit();
        }


    }


