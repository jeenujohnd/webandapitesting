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

    @Then("the user sees the Continue Shopping option")
    public void the_user_sees_the_Continue_Shopping_option(){
        cartSteps.viewContinueShoppingOption();
    }

    @When("the user clicks the Continue Shopping link")
    public void the_user_clicks_the_Continue_Shopping_link(){
        cartSteps.clickContinueShopping();
    }

    @Then("the user is redirected to All Products page")
    public void the_user_is_redirected_to_All_Products_page(){
        cartSteps.allProductsPage();
    }

    @When("the user adds another product to the cart")
    public void the_user_adds_another_product_to_the_cart(){
        cartSteps.addProductToCart();
    }

    @Then("the user should see all the products added")
    public void the_user_should_see_all_the_products_added(){
        cartSteps.viewAllAddedProducts();
    }
}
