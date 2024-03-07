package com.example.steps;

import com.example.pages.CartPage;
import com.example.pages.ProductsPage;

public class CartSteps {

    CartPage cartPage;
    ProductsPage productPage;

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
        cartPage.viewAddedProduct();
    }

    public void viewContinueShoppingOption() {
        cartPage.viewContinueShopping();
    }

    public void clickContinueShopping() {
        cartPage.clickContinueShopping();
    }

    public void allProductsPage() {
        productPage.viewProductsPage();
    }

    public void addMoreProductsToCart() {
        cartPage.addMoreProductsToCart();
    }

    public void viewAllAddedProducts() {
        cartPage.viewAllAddedProducts();
    }


    public void viewProductQuantity() {
        cartPage.viewProductQuantity();
    }
}
