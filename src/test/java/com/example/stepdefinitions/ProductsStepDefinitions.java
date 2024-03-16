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

    @Then("the user is navigated to Searched products page")
    public void the_user_is_navigated_to_Searched_products_page(){
        productsSteps.viewSearchedProductsPage();
    }

    @When("the user clicks Cart link")
    public void the_user_clicks_Cart_link(){
        productsSteps.cLickCartLink();
    }

    @Then("the user sees all products corresponding to the search")
    public void the_user_sees_all_products_corresponding_to_the_search(){
        productsSteps.viewSearchedProducts();
    }

    @Then("the user sees write your review section")
    public void the_user_sees_write_your_review_section()
    {
        productsSteps.viewWriteReviewTitle();
    }

    @When("the user provides name {string}")
    public void the_user_provides_name(String name){
        productsSteps.inputName(name);
    }

    @When("the user provides email {string}")
    public void the_user_provides_email(String email){
        productsSteps.inputEmail(email);
    }

    @When("the user provides review {string}")
    public void the_user_provides_review(String review){
        productsSteps.inputReview(review);
    }

    @When("the user clicks the submit button")
    public void the_user_clicks_the_submit_button(){
        productsSteps.clickSubmit();
    }

}
