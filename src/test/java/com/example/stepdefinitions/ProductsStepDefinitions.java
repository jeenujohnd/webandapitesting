package com.example.stepdefinitions;

import com.example.steps.ProductsSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ProductsStepDefinitions {

    @Steps(shared = true)
    ProductsSteps productsSteps;

    @When("the user clicks products link")
    public void the_user_clicks_products_link(){
        productsSteps.openProductsPage();
    }

    @Then("the user is able to view all the products")
    public void the_user_is_able_to_view_all_the_products(){

        productsSteps.viewProductsPage();
    }

    @When("the user clicks view product link")
    public void the_user_clicks_view_product_link(){
        productsSteps.clickViewProductLink();
    }

    @Then("the user is navigated to the product details page")
    public void the_user_is_navigated_to_the_product_details_page(){
        productsSteps.viewProductDetailsPage();
    }

    @When("the user searches in Search Product field for {string}")
    public void the_user_searches_in_Search_Product_field_for(String productName){
        productsSteps.searchProduct(productName);
    }

    @Then("the user is able to see the respective product")
    public void the_user_is_able_to_see_the_respective_product(){
        productsSteps.viewSearchedProduct();
    }

}
