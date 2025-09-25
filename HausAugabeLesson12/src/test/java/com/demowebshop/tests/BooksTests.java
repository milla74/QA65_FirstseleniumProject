package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTests extends TestBase {

    @Test
    public void booksPageShouldBeAccessible() {
        Assert.assertTrue(app.getHome().isBooksPageOpened(), "Books page is not opened");
    }

    @Test
    public void booksPageTitleShouldContainBooks() {
        String title = app.getHome().getPageTitle();
        Assert.assertTrue(title.toLowerCase().contains("books"), "Page title does not contain 'Books'");
    }
}
