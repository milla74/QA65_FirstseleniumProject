package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegistrationForm("female", "Milla", "Born", "milla" + System.currentTimeMillis() + "@mail.com", "Milla123!");
        app.getUser().clickOnRegisterButton();

        Assert.assertTrue(app.getUser().isUserLoggedIn(), "Регистрация не прошла успешно");
    }
}


