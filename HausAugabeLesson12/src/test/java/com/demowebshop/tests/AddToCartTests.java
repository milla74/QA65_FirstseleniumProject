package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        // Логинимся перед тестом
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm("testuser@mail.com", "Password123!");
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addBookToCartTest() {
        app.getHome().openBooksPage();
        Assert.assertTrue(app.getHome().isBooksPageOpened(), "Страница Books не открыта");

        app.getCart().addBookToCart("Computing and Internet");
        app.getCart().openCart();

        Assert.assertTrue(app.getCart().isBookInCart("Computing and Internet"), "Книга не добавлена в корзину");
    }
}



