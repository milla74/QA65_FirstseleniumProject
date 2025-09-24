package com.demowebshop.tests;

import com.demowebshop.data.UserData;
import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogoButton();
        }
    }

    SoftAssert softAssert = new SoftAssert();

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {
//        int i = (int)((System.currentTimeMillis()/1000)%3600);
        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User()
                        .setGender(UserData.GENDER)
                        .setFirstName(UserData.FIRSTNAME)
                        .setLastName(UserData.LASTNAME)
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD)
                .setConfirmPassword(UserData.CONFIRMPASSWORD));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isloggoButtonPresent());//css div:nth-child(1) button
    }


    @Test()
    public void existetUserRegistrationNegative() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User()
                .setGender(UserData.GENDER)
                .setFirstName(UserData.FIRSTNAME)
                .setLastName(UserData.LASTNAME)
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD)
                .setConfirmPassword(UserData.CONFIRMPASSWORD));

        app.getUser().clickOnRegistrationButton();
        softAssert.assertTrue(app.getUser().isAlertDisplayed());
        softAssert.assertTrue(app.getUser().isErrorMessagePresent());
        softAssert.assertAll();
    }

}
