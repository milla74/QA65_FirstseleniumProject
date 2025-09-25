package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeHelper extends BaseHelper {

    public HomeHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnHomeLink() {
        click(By.cssSelector("a[href='/']"));
    }

    public boolean isHomeComponentPresent() {
        // Проверяем, что на главной странице есть блок с контентом
        return isElementPresent(By.cssSelector("div.master-wrapper-content"));
    }

    public void openBooksPage() {
        click(By.cssSelector("a[href='/books']"));
    }

    public boolean isBooksPageOpened() {
        return driver.getCurrentUrl().contains("/books");
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}


