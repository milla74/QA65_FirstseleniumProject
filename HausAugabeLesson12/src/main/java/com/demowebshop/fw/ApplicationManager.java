package com.demowebshop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

    private WebDriver driver;
    private UserHelper userHelper;
    private HomeHelper homeHelper;
    private CartHelper cartHelper;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        userHelper = new UserHelper(driver);
        homeHelper = new HomeHelper(driver);
        cartHelper = new CartHelper(driver);
    }

    public void stop() {
        if (driver != null) driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public UserHelper getUser() {
        return userHelper;
    }

    public HomeHelper getHome() {
        return homeHelper;
    }

    public CartHelper getCart() {
        return cartHelper;
    }
}

