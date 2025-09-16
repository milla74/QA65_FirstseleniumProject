package com.ait.qa65.ha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementTableWithCssTest() {
        //print number of row
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
        for (WebElement element : rows) {
            System.out.println(element.getText());
             System.out.println("****************************");
           // get row 4
              WebElement row4 = driver.findElement(By.cssSelector("tr:nth-child(4)"));//    //tr[4]-> xpath
              System.out.println(row4.getText());
              System.out.println("****************************");
           // get first item in row
              WebElement item1 = driver.findElement(By.cssSelector("tr:nth-child(7) td:nth-child(1)"));
              System.out.println(item1.getText());
              System.out.println("*****************************");
            //get last element
              WebElement italy = driver.findElement(By.cssSelector("tr:nth-child(9) td:last-child"));
              System.out.println(italy.getText());
              System.out.println("******************************");
        }
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
