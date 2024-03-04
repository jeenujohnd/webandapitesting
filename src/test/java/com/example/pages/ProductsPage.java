package com.example.pages;

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
}
