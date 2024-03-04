package com.example.steps;

import com.example.pages.CartPage;

public class CartSteps {

    CartPage cartPage;

    public void addProductToCart(){
        cartPage.addProductToCart();
    }

    public void productAddedMessage() {
        cartPage.productAddedMessage();
    }

    public void viewCartOption() {
        cartPage.viewCartOption();
    }

    public void clickViewCart() {
        cartPage.clickViewCart();
    }

    public void viewAddedProduct() {
    }
}
