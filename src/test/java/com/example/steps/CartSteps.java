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

    public void viewProceedToCheckoutOption() {
        cartPage.viewProceedToCheckoutOption();
    }

    public void clickProceedToCheckout() {
        cartPage.clickProceedToCheckout();
    }

    public void viewDeliveryAddress() {
        cartPage.viewDeliveryAddress();
    }

    public void viewBillingAddress() {
        cartPage.viewBillingAddress();
    }

    public void viewReviewOrder() {
        cartPage.viewReviewOrder();
    }

    public void viewTotalAmount() {
        cartPage.viewTotalAmount();
    }


    public void inputComments() {
        cartPage.inputComments();
    }

    public void placeOrderEnabled() {
        cartPage.placeOrderEnabled();
    }

    public void clickPlaceOrder() {
        cartPage.clickPlaceOrder();
    }

    public void paymentPage() {
        cartPage.paymentPage();
    }

    public void inputCardName(String cardName) {
        cartPage.inputCardName(cardName);
    }

    public void inputCardNumber(Integer cardNumber) {
        cartPage.inputCardNumber(cardNumber);
    }

    public void inputCVV(Integer cvv) {
        cartPage.inputCVV(cvv);
    }

    public void inputExpirationMonth(Integer expirationMonth) {
        cartPage.inputExpirationMonth(expirationMonth);
    }

    public void inputExpirationYear(Integer expirationYear) {
        cartPage.inputExpirationYear(expirationYear);
    }

    public void clickPayAndConfirmOrder() {
        cartPage.clickPayAndConfirmOrder();
    }

    public void viewOrderPlacedMessage() {
        cartPage.viewOrderPlacedMessage();
    }

    public void clickContinue() {
        cartPage.clickContinue();
    }

    public void clickDeleteProducts() {
        cartPage.clickDeleteProducts();
    }

    public void cartEmptyMessage() {
        cartPage.cartEmptyMessage();
    }

//    public void clickBuyProducts() {
//        cartPage.clickBuyProducts();
//    }

    public void viewCategory() {
        cartPage.viewCategory();
    }

    public void viewCategoryList() {
        cartPage.viewCategoryList();
    }

    public void clickCategory() {
        cartPage.clickCategory();
    }

    public void viewSubCategoryList() {
        cartPage.viewSubCategoryList();
    }

    public void clickSubCategory() {
        cartPage.clickSubCategory();
    }

    public void viewSubCategoryPage() {
        cartPage.viewSubCategoryPage();
    }

    public void clickAnotherCategory() {
        cartPage.clickAnotherCategory();
    }


    public void viewAnotherSubCategoryList() {
        cartPage.viewAnotherSubCategoryList();
    }

    public void clickAnotherSubCategory() {
        cartPage.clickAnotherSubCategory();
    }

    public void viewAnotherSubCategoryPage() {
        cartPage.viewAnotherSubCategoryPage();
    }

    public void viewBrands() {
        cartPage.viewBrands();
    }

    public void viewBrandsList() {
        cartPage.viewBrandsList();
    }

    public void clickBrand() {
        cartPage.clickBrand();
    }

    public void viewBrandPage() {
        cartPage.viewBrandPage();
    }

    public void countBrandProduct() {
        cartPage.countBrandProduct();
    }

    public void viewsBrandProduct() {
        cartPage.viewsBrandProduct();
    }

    public void checkBrand() {
        cartPage.checkBrand();
    }
}
