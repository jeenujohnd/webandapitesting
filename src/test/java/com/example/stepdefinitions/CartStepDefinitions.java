package com.example.stepdefinitions;

import com.example.steps.CartSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CartStepDefinitions {

    @Steps(shared = true)

    CartSteps cartSteps;

    @When("the user adds a product to the cart")
    public void the_user_adds_a_product_to_the_cart(){
        cartSteps.addProductToCart();
    }

    @Then("the user sees the Added message")
    public void the_user_sees_the_Added_message(){
         cartSteps.productAddedMessage();
    }

    @Then("the user sees the View Cart option")
    public void the_user_sees_the_View_Cart_option(){
        cartSteps.viewCartOption();
    }

    @When("the user clicks View Cart link")
    public void the_user_clicks_View_Cart_link(){
        cartSteps.clickViewCart();
    }

    @Then("the user can view the added product in cart")
    public void the_user_can_view_the_added_product_in_cart(){
        cartSteps.viewAddedProduct();
    }
}
