package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartHelper extends BaseHelper {

    public CartHelper(WebDriver driver) {
        super(driver);
    }

    public void addBookToCart(String bookName) {
        click(By.xpath("//a[text()='" + bookName + "']/../..//input[@value='Add to cart']"));
    }

    public boolean isBookInCart(String bookName) {
        return isElementPresent(By.xpath("//td[@class='product']/a[text()='" + bookName + "']"));
    }

    public void openCart() {
        click(By.cssSelector(".ico-cart"));
    }

    // <-- добавляем этот метод
    public void removeBookFromCart(String bookName) {
        // Отмечаем чекбокс удаления книги
        click(By.xpath("//td[@class='product']/a[text()='" + bookName + "']/../..//input[@name='removefromcart']"));
        // Обновляем корзину
        click(By.name("updatecart"));
    }
}


