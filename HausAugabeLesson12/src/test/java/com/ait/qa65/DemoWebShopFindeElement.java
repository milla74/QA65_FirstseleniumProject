package com.ait.qa65;


    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


    public class DemoWebShopFindeElement {
        WebDriver driver;

        @BeforeMethod
        public void setUP() {
            driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void sampleElementBySimpleLocators() {
            driver.findElement(By.linkText("Register"));
            driver.findElement(By.linkText("Log in"));
            driver.findElement(By.partialLinkText("Shopping cart"));
            driver.findElement(By.partialLinkText("Wishlist"));
            driver.findElement(By.linkText("Books"));
            driver.findElement(By.linkText("Computers"));
            driver.findElement(By.linkText("Electronics"));
            driver.findElement(By.linkText("Apparel & Shoes"));
            driver.findElement(By.linkText("Digital downloads"));
            driver.findElement(By.linkText("Jewelry"));
            driver.findElement(By.linkText("Gift Cards"));
        }

        @Test
        public void findElementByCssSelectorTest() {
            driver.findElement(By.cssSelector("a.ico-register"));
            driver.findElement(By.cssSelector("a.ico-login"));
            driver.findElement(By.cssSelector("a[href='/cart']"));
            driver.findElement(By.cssSelector("a[href='/wishlist']"));
            driver.findElement(By.cssSelector("ul.top-menu a[href='/books']"));
            driver.findElement(By.cssSelector("ul.top-menu a[href='/computers']"));
            driver.findElement(By.cssSelector("ul.top-menu a[href='/electronics']"));
            driver.findElement(By.cssSelector("ul.top-menu a[href='/apparel-shoes']"));
            driver.findElement(By.cssSelector("ul.top-menu a[href='/digital-downloads']"));
            driver.findElement(By.cssSelector("ul.top-menu a[href='/jewelry']"));
            driver.findElement(By.cssSelector("ul.top-menu a[href='/gift-cards']"));
        }

        @Test
        public void findElementByXpath() {
            driver.findElement(By.xpath("//a[normalize-space()='Register']"));
            driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
            driver.findElement(By.xpath("//a[contains(text(),'Shopping cart')]"));
            driver.findElement(By.xpath("//a[contains(text(),'Wishlist')]"));
            driver.findElement(By.xpath("//ul[@class='top-menu']//a[text()='Computers']"));
            driver.findElement(By.xpath("//ul[@class='top-menu']//a[text()='Electronics']"));
            driver.findElement(By.xpath("//ul[@class='top-menu']//a[text()='Apparel & Shoes']"));
            driver.findElement(By.xpath("//ul[@class='top-menu']//a[text()='Digital downloads']"));
            driver.findElement(By.xpath("//ul[@class='top-menu']//a[text()='Jewelry']"));
            driver.findElement(By.xpath("//ul[@class='top-menu']//a[text()='Gift Cards']"));
            driver.findElement(By.xpath("//ul[@class='top-menu']//a[text()='Books']"));
        }


    }





