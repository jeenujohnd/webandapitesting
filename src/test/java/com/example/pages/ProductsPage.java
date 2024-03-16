package com.example.pages;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ProductsPage extends PageObject {

    public void openProductsPage() {
        $(By.cssSelector("a[href='/products']")).click();

    }

    public void viewProductsPage() {
        System.out.println("viewProductsPage: "
                +$(By.xpath("//h2[normalize-space()='All Products']")).getText());
        assert ($(By.xpath("//h2[normalize-space()='All Products']"))
                .getText().equalsIgnoreCase("ALL PRODUCTS"));

    }

    public void clickViewProductLink() {
        $(By.cssSelector("a[href='/product_details/1']")).click();
    }

    public void viewProductDetailsPage() {
        assert ($(By.cssSelector("div[class='product-information'] h2")).getText()
                .equalsIgnoreCase("Blue Top"));
        System.out.println("viewProductDetailsPage: "
                +$(By.xpath("//p[normalize-space()='Category: Women > Tops']")).getText());
        assert ($(By.xpath("//p[normalize-space()='Category: Women > Tops']")).getText()
                .equalsIgnoreCase("Category: Women > Tops"));
        assert ($(By.xpath("//span[normalize-space()='Rs. 500']"))).getText()
                .equalsIgnoreCase("Rs. 500");

    }

    public void searchProduct(String productName) {
        $(By.id("search_product")).sendKeys(productName);
        $(By.id("submit_search")).click();
    }

    public void viewSearchedProduct() {
        System.out.println("viewSearchedProduct: "+
                $(By.cssSelector("div[class='productinfo text-center'] p"))
                        .getText());
        assert($(By.cssSelector("div[class='productinfo text-center'] p"))
                .getText().equalsIgnoreCase("Winter Top"));
        System.out.println("Product searched successfully.");
    }


    public void viewSearchedProductsPage() {
        assert ($(By.className("text-center")).getText()
                .trim().equalsIgnoreCase("SEARCHED PRODUCTS"));
    }

    public void viewSearchedProducts() {
        ListOfWebElementFacades searchedProductsList =
                findAll(By.xpath("//div[@class='features_items']"));
        System.out.println(searchedProductsList.size());
        for (int i=0;i<searchedProductsList.size();i++)
        {
            System.out.println(searchedProductsList.get(i).getText());
        }
    }

    public void cLickCartLink() {
        $(By.xpath("//ul//li//a[normalize-space()='Cart']")).click();
    }

    public void viewWriteReviewTitle() {
        assert($(By.cssSelector("a[href='#reviews']")).getText().trim()
                .equalsIgnoreCase("WRITE YOUR REVIEW"));
    }

    public void inputName(String name) {
        $(By.id("name")).sendKeys(name);
    }

    public void inputEmail(String email) {
        $(By.id("email")).sendKeys(email);
    }

    public void inputReview(String review) {
        $(By.id("review")).sendKeys(review);
    }

    public void clickSubmit() {
        $(By.id("button-review")).click();
    }
}
