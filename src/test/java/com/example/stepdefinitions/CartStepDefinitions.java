package com.example.stepdefinitions;

import com.example.steps.CartSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.By;

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
        cartSteps.addMoreProductsToCart();
    }

    @Then("the user should see all the products added")
    public void the_user_should_see_all_the_products_added(){
        cartSteps.viewAllAddedProducts();
    }

    @Then("the user should see the correct quantity in the cart")
    public void the_user_should_see_the_correct_quantity_in_the_cart(){
        cartSteps.viewProductQuantity();
    }

    @Then("the user sees the Proceed to checkout option")
    public void the_user_sees_the_Proceed_to_checkout_option(){
        cartSteps.viewProceedToCheckoutOption();
    }

    @When("the user clicks the Proceed to checkout link")
    public void the_user_clicks_the_Proceed_to_checkout_link(){
        cartSteps.clickProceedToCheckout();
    }

    @Then("the user sees the delivery address")
    public void the_user_sees_the_delivery_address(){
        cartSteps.viewDeliveryAddress();
    }

    @Then("the user sees the billing address")
    public void the_user_sees_the_billing_address(){
        cartSteps.viewBillingAddress();
    }

    @Then("the user sees the Review order section")
    public void the_user_sees_the_Review_order_section(){
        cartSteps.viewReviewOrder();
    }

    @Then("the user sees the total amount")
    public void the_user_sees_the_total_amount(){
        cartSteps.viewTotalAmount();
    }

    @Then("the user provides comments")
    public void the_user_provides_comments(){
        cartSteps.inputComments();
    }

    @Then("the user sees the Place order option")
    public void the_user_sees_the_Place_order_option(){
        cartSteps.placeOrderEnabled();
    }

    @When("the user clicks the Place order button")
    public void the_user_clicks_the_Place_order_button(){
        cartSteps.clickPlaceOrder();
    }

    @Then("the user is redirected to payment page")
    public void the_user_is_redirected_to_payment_page(){
        cartSteps.paymentPage();
    }

    @Then("the user provides card name {string}")
    public void the_user_provides_card_name(String cardName){
        cartSteps.inputCardName(cardName);
    }

    @Then("the user provides card number {int}")
    public void the_user_provides_card_number(Integer cardNumber){
        cartSteps.inputCardNumber(cardNumber);
    }

    @Then("the user provides CVV {int}")
    public void the_user_provides_CVV(Integer cvv){
        cartSteps.inputCVV(cvv);
    }

    @Then("the user provides Expiration month {int}")
    public void the_user_provides_Expiration_month(Integer expirationMonth){
        cartSteps.inputExpirationMonth(expirationMonth);
    }

    @Then("the user provides Expiration year {int}")
    public void the_user_provides_Expiration_year(Integer expirationYear){
        cartSteps.inputExpirationYear(expirationYear);
    }

    @When("the user clicks pay and confirm order link")
    public void the_user_clicks_pay_and_confirm_order_link(){
        cartSteps.clickPayAndConfirmOrder();
    }

    @Then("the user sees order placed message")
    public void the_user_sees_order_placed_message(){
        cartSteps.viewOrderPlacedMessage();
    }

    @When("the user clicks the continue button")
    public void the_user_clicks_the_continue_button(){
        cartSteps.clickContinue();
    }

}
