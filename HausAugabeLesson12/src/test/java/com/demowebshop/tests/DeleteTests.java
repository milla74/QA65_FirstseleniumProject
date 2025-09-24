package com.demowebshop.tests;

import com.demowebshop.data.ContactData;
import com.demowebshop.data.UserData;
import com.demowebshop.models.Contact;
import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogoButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User()
                        .setGender(UserData.GENDER)
                        .setFirstName(UserData.FIRSTNAME)
                        .setLastName(UserData.LASTNAME)
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD)
                .setConfirmPassword(UserData.ConfirmPassword));
        app.getUser().clickOnLoginButton();
        app.getContact().clickOnAddLink();
        app.getContact().fillContactForm(new Contact()
                .setGender(UserData.GENDER)
                .setFirsName(UserData.FIRSTNAME)
                .setLastName(UserData.LASTNAME)
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD)
                .setConfirmPassword(UserData.CONFIRMPASSWORD));
        app.getContact().clickOnLogoButton();
    }

    @Test
    public void deleteContactTest(){
        int sizeBefore = app.getContact().sizeOfContacts();
        app.getContact().deletecontact();
        app.getContact().pause(1000);
        int sizeAfter = app.getContact().sizeOfContacts();
        Assert.assertEquals(sizeAfter, sizeBefore -1);
    }

}

