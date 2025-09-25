package com.demowebshop.tests;
import com.demowebshop.data.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {




    @Test
    public void loginPositiveTest() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(UserData.EMAIL, UserData.PASSWORD);
        app.getUser().clickOnLoginButton();

        Assert.assertTrue(app.getUser().isUserLoggedIn());
        ;//"Пользователь не залогинился"
    }

   // @Test
  //  public void loginNegativeWithoutEmailTest() {
    //    app.getUser().clickOnLoginLink();
      //  app.getUser().fillLoginForm("", UserData.PASSWORD); // пустой email
      //  app.getUser().clickOnLoginButton();


   // }

}

