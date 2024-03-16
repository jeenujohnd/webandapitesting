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

    public void viewSearchedProductsPage() {
        productsPage.viewSearchedProductsPage();
    }

    public void viewSearchedProducts() {
        productsPage.viewSearchedProducts();
    }

    public void cLickCartLink() {
        productsPage.cLickCartLink();
    }

    public void viewWriteReviewTitle() {
        productsPage.viewWriteReviewTitle();
    }


    public void inputName(String name) {
        productsPage.inputName(name);
    }

    public void inputEmail(String email) {
        productsPage.inputEmail(email);
    }

    public void inputReview(String review) {
        productsPage.inputReview(review);
    }

    public void clickSubmit() {
        productsPage.clickSubmit();
    }
}
