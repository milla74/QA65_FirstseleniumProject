package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }
    // Переход на страницу регистрации
    public void clickOnRegisterLink() {
        click(By.cssSelector("a[href='/register']"));
    }

    // Заполнение формы регистрации
    public void fillRegistrationForm(String gender, String firstName, String lastName, String email, String password) {
        if (gender.equalsIgnoreCase("male")) {
            click(By.id("gender-male"));
        } else {
            click(By.id("gender-female"));
        }
        type(By.id("FirstName"), firstName);
        type(By.id("LastName"), lastName);
        type(By.id("Email"), email);
        type(By.id("Password"), password);
        type(By.id("ConfirmPassword"), password);
    }

    // Клик на кнопку регистрации
    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    // Проверка успешной регистрации (наличие кнопки выхода)
    public boolean isUserLoggedIn() {
        return isElementPresent(By.cssSelector("a.account")); // ссылка с email
    }



    // Проверка, есть ли ссылка на логин
    public boolean isLoginLinkPresent() {
        return isElementPresent(By.cssSelector("a[href='/login']"));
    }


    // Клик на ссылку логина
    public void clickOnLoginLink() {
        click(By.cssSelector("a[href='/login']"));
    }

    // Заполнение формы логина
    public void fillLoginForm(String email, String password) {
        type(By.id("Email"), email);
        type(By.id("Password"), password);
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("input.button-1.login-button"));
        try {
            Thread.sleep(2000); // временно
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    }









