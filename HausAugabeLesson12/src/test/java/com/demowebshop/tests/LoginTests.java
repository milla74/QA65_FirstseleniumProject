package com.demowebshop.tests;

//import com.demowebshop.data.UserData;
import com.demowebshop.data.UserData;
import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogoButton();
        }
    }

    @Test(priority = 1)
    public void loginPositiveTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User()
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD)
                .setConfirmPassword(UserData.ConfirmPassword));

        Assert.assertTrue(app.getUser().isloggoButtonPresent();
    }

    @Test(priority = 2)
    public void loginNegativeWithoutEmailTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User().setPassword(UserData.PASSWORD);
        app.getUser().fillRegisterLoginForm(new User().setConfirmPassword(UserData.ConfirmPassword));
        app.getUser().clickOnLoginButton();

        Assert.assertTrue(app.getUser().isAlertDisplayed());
    }
}



