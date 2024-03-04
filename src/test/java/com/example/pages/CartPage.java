package com.example.pages;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

public class CartPage extends PageObject {


    public void addProductToCart() {
        $(By.className("add-to-cart")).click();
    }

    public void productAddedMessage() {
        System.out.println("Printing productAddedMessage:"+ $(By.xpath("//h4[normalize-space()='Added!']")).getText());
        assert ($(By.xpath("//h4[normalize-space()='Added!']")).getText().equalsIgnoreCase("Added!"));
    }

    public void viewCartOption() {
        assert ($(By.xpath("//u[normalize-space()='View Cart']"))
                .getText().equalsIgnoreCase("View Cart"));
    }

    public void clickViewCart() {
        $(By.xpath("//u[normalize-space()='View Cart']")).click();
        assert ($(By.cssSelector("a[href='/product_details/2']"))
                .getText().equalsIgnoreCase("Men Tshirt"));
    }
}
