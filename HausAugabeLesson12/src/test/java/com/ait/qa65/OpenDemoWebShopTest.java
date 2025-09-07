package com.ait.qa65;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenDemoWebShopTest {
    WebDriver driver;

        // Можно добавить дополнительные проверки — например, assert по заголовку страницы.
     //   driver.quit();

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }


    @Test
public void openHomePage() {
        System.out.println("Demowebshop!");

}
@AfterMethod(enabled = false)
    public void teardown(){
        driver.quit();
}
}
