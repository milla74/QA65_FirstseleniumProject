package com.demowebshop.tests;

import com.demowebshop.data.ContactData;
import com.demowebshop.data.UserData;
import com.demowebshop.models.Contact;
import com.demowebshop.models.User;
import com.demowebshop.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddContactTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnLogoButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User().setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {
        app.getContact().clickOnAddLink();
        app.getContact().fillContactForm(new Contact()
                        .setGender(ContactData.GENDER)
                .setFirsName(ContactData.FIRSTNAME)
                .setLastName(ContactData.LASTNAME)
                .setEmail(ContactData.EMAIL)
                        .setConfirmPassword(ContactData.PASSWORD)
                                .setConfirmPassword(ContactData.CONFIRMPASSWORD)
        app.getContact().clickOnLogoButton();
        Assert.assertTrue(app.getContact().iscontactadded("Viktor"));
    }

    @Test(dataProvider = "addNewContact", dataProviderClass = DataProviders.class)
    public void addContactPositiveFromDataProviderTest(String name, String lastName, String email) {

        app.getContact().clickOnAddLink();
        app.getContact().fillContactForm(new Contact()
                        .setGender(gender)
                        .setFirsName(firstname)
                .setLastName(lastName)
                .setEmail(email)
                        .setPassword(password)
                                .setConfirmPassword(confirmpassword)
        app.getContact().clickOnLogoButton();
        Assert.assertTrue(app.getContact().isContactAdded("Viktor"));
    }

    @AfterMethod
    public void postCondition() {
        app.getContact().deleteContact();
    }

    @Test(dataProvider = "addNewContactWithCsv", dataProviderClass = DataProviders.class)
    public void addContactPositiveFromDataProviderWithCsvFileTest(Contact contact) {
        app.getContact().clickOnAddLink();
        app.getContact().fillContactForm(contact);
        app.getContact().clickOnLogoButton();
        Assert.assertTrue(app.getContact().isContactAdded(contact.getFirstName()));
    }
}