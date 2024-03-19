package com.example.stepdefinitions;

import com.example.apistep.ProductsApiSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ProductsApiStepDefinitions {

    @Steps
    ProductsApiSteps productsApiSteps;

    @Given("the application is running")
    public void the_application_is_running() {
        productsApiSteps.isAppRunning();
    }

    @When("the user checks all products list")
    public void the_user_checks_all_products_list() {
        productsApiSteps.checkAllProductList();
    }

    @Then("the API should return complete details of all the products")
    public void the_api_should_return_complete_details_of_all_the_products() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
