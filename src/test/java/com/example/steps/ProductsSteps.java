package com.example.steps;

import com.example.pages.ProductsPage;

public class ProductsSteps {

    ProductsPage productsPage;
    public void openProductsPage() {
        productsPage.openProductsPage();
    }

    public void viewProductsPage() {
        productsPage.viewProductsPage();
    }

    public void clickViewProductLink(){
        productsPage.clickViewProductLink();
    }

    public void viewProductDetailsPage() {
        productsPage.viewProductDetailsPage();
    }

    public void searchProduct(String productName) {
        productsPage.searchProduct(productName);
    }

    public void viewSearchedProduct() {
        productsPage.viewSearchedProduct();
    }
}
