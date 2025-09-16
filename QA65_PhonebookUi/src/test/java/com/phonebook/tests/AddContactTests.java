package com.phonebook.tests;

import com.phonebook.models.Contact;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{
    //login
    @BeforeMethod
    public void precondition(){
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }

    app.getUser().clickOnLoginLink();
    app.getUser().fillRegisterLoginForm(new User()
            .setEmail("test258phone$@gmail.com")
            .setPassword("Nastya12#!"));
    app.getUser().clickOnLoginButton();
}
    @Test
    public void addContactPositiveTest(){

                app.getContact().clickOnAddLink();
        app.getContact().fillContactForm(new Contact()
                        .setName("Viktor")
                        .setLastName("Buch")
                      .setPhone("0123456789")
                      .setEmail("Viktor@mail.com")
                        .setAddress("Ulmenstr.,35")
                         .setDescription("QA"));
        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactAdded("Viktor"));   ///написать имя правильно
    }

    @AfterMethod

    public void postCondition(){

        app.getContact().deleteContact();
    }

}



