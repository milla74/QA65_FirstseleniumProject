package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper {

    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    // public boolean isHomeComponentPresent(){
    //   return isElementPresent(By.cssSelector("div.page.registration-page h1.page-title"));
    // }

    //public void clickOnHomeLink() {
    //  click(By.cssSelector("h1.page-title"));
    // }
//}
    public boolean isHomeComponentPresent() {
        // проверка
        return isElementPresent(By.cssSelector("h1.page-title"));
    }

    public void clickOnHomeLink() {

        click(By.cssSelector("a[href='/']"));
    }
}

