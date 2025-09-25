package com.demowebshop.fw;

import com.demowebshop.models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactHelper extends BaseHelper {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    // public void clickOnSaveButton() {click(By.cssSelector(".add_main__1tbl_ button"));
    public void clickOnLogoButton() {
        click(By.cssSelector(".ico-register"));
    }

    public void fillContactForm(Contact contact) {
        // выбор пола
        if (contact.getGender().equalsIgnoreCase("male")) {
            click(By.id("gender-male"));
        } else if (user.getGender().equalsIgnoreCase("female")) {
            click(By.id("gender-female"));

            // заполнение текстовых полей
            type(By.cssSelector("FirstName"), contact.getFirstName());
            type(By.cssSelector("LastName"), contact.getLastName());
            type(By.cssSelector("Email"), contact.getEmail());
            type(By.id("Password"), contact.getPassword());
            type(By.id("ConfirmPassword"), contact.getConfirmPassword());

        }

        public void clickOnAddLink () {
            click(By.id("register-button"));
        }
    }
}





