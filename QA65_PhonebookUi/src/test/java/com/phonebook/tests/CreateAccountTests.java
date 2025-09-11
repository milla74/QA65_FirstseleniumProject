package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {

        //       int i = (int)((System.currentTimeMillis()/1000)%3600);
        clickOnLoginLink();
        fillRegisterLoginForm(new User().setEmail("test258phone$@gmail.com").setPassword("Nastya12#!"));
        clickOnRegistretionButton();
        Assert.assertTrue(isSignOutButtonPresent());//css div:nth-child(1) button
    }


    @Test()
    public void existetUserRegistrationNegative() {
        clickOnLoginLink();
        fillRegisterLoginForm(new User().setEmail("test258phone$@gmail.com").setPassword("Nastya12#!"));
        clickOnRegistretionButton();
        Assert.assertTrue(isAlertDisplayed());
    }

}
