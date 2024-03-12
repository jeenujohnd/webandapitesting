package com.example.pages;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class CartPage extends PageObject {

    public void addProductToCart() {
        $(By.xpath("(//a[contains(text(),'Add to cart')])[1]")).click();
    }

    public void addMoreProductsToCart() {
        $(By.xpath("(//a[contains(text(),'Add to cart')])[3]")).click();
        }

//        List<WebElementFacade> multipleProducts = findAll(By.xpath("//a[@data-product-id]"));
//        $(By.xpath("//a[@data-product-id]"));

//        for(int i=1;i<=5;i++)
//        {
//            System.out.println(multipleProducts.get(i).getText());
//            multipleProducts.get(i).click();
//            cartPage.clickContinueShopping();
//
//        }


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
    }

    public void viewAddedProduct() {
        String text1 = $(By.cssSelector("a[href='/product_details/1']")).getText();
        System.out.println(text1);
        $(By.cssSelector("a[href='/products']")).click();
        String text2 = $(By.xpath("(//p[contains(text(),'Blue Top')])[1]")).getText();
        assert (text1.equalsIgnoreCase(text2));
        System.out.println(text2);
    }

    public void viewContinueShopping() {
        assert ($(By.className("btn-success"))
                .getText().equalsIgnoreCase("Continue Shopping"));
    }

    public void clickContinueShopping() {
        $(By.className("btn-success")).click();
    }


    public void viewAllAddedProducts() {

        List<WebElementFacade> productsAdded = findAll(By.xpath("//td[@class='cart_description']"));
        System.out.println(productsAdded.size());
        for(int i=0;i<productsAdded.size();i++)
        {
            System.out.println(productsAdded.get(i).getText());
        }

    }

    public void viewProductQuantity() {
        assert ($(By.className("disabled")).getText().equalsIgnoreCase("1"));
    }
}

