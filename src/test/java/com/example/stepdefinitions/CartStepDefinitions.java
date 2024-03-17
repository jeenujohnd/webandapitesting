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

    @When("the user clicks the cross button next to products displayed")
    public void the_user_clicks_the_cross_button_next_to_products_displayed(){
        cartSteps.clickDeleteProducts();
    }

    @Then("Cart is empty message should be displayed")
    public void Cart_is_empty_message_should_be_displayed(){
        cartSteps.cartEmptyMessage();
    }

    @When("the user clicks HERE link")
    public void the_user_clicks_HERE_link(){
        cartSteps.clickBuyProducts();
    }

   @Then("the user sees category section in the left side bar")
    public void the_user_sees_category_section_in_the_left_side_bar(){
        cartSteps.viewCategory();
   }

   @Then("the user sees various categories")
    public void the_user_sees_various_categories(){
        cartSteps.viewCategoryList();
   }

   @When("the user expands a category")
    public void the_user_expands_a_category(){
        cartSteps.clickCategory();
   }

   @Then("the user sees the sub category")
    public void the_user_sees_the_sub_category(){
        cartSteps.viewSubCategoryList();
   }

   @When("the user clicks a sub category")
    public void the_user_clicks_a_sub_category(){
        cartSteps.clickSubCategory();
   }

   @Then("the user sees the sub category page with the corresponding title")
    public void the_user_sees_the_sub_category_page_with_the_corresponding_title(){
        cartSteps.viewSubCategoryPage();
   }

   @When("the user clicks another category")
    public void the_user_clicks_another_category(){
        cartSteps.clickAnotherCategory();
   }

   @Then("the user sees the corresponding sub category")
    public void the_user_sees_the_corresponding_sub_category(){
        cartSteps.viewAnotherSubCategoryList();
   }

   @When("the user clicks another sub category")
    public void the_user_clicks_another_sub_category(){
        cartSteps.clickAnotherSubCategory();
   }

   @Then("the user sees the other sub category page with the corresponding title")
    public void the_user_sees_the_other_sub_category_page_with_the_corresponding_title(){
        cartSteps.viewAnotherSubCategoryPage();
   }

   @Then("the user sees brands section in the left side bar")
    public void the_user_sees_brands_section_in_the_left_side_bar(){
        cartSteps.viewBrands();
   }

   @Then("the user sees various brands")
    public void the_user_sees_various_brands(){
        cartSteps.viewBrandsList();
   }

   @When("the user clicks a brand")
    public void the_user_clicks_a_brand(){
        cartSteps.clickBrand();
   }

   @Then("the user sees the brand page with the corresponding page title")
    public void the_user_sees_the_brand_page_with_the_corresponding_page_title(){
        cartSteps.viewBrandPage();
   }

   @Then("the user sees same count of products displayed")
    public void the_user_sees_same_count_of_products_displayed(){
        cartSteps.countBrandProduct();
   }

   @When("the user views a product")
    public void the_user_views_a_product(){
        cartSteps.viewsBrandProduct();
   }

   @Then("the user sees the brand of the product as same")
    public void the_user_sees_the_brand_of_the_product_as_same(){
        cartSteps.checkBrand();
   }

    @When("the user scrolls down to the bottom of the page")
    public void the_user_scrolls_down_to_the_bottom_of_the_page() {
        cartSteps.scrollDownToRecommendedItems();
    }
    @Then("the user sees the RECOMMENDED ITEMS section")
    public void the_user_sees_the_recommended_items_section() {
        cartSteps.viewRecommendedItems();
    }

    @Then("the user's delivery address appears")
    public void the_user_s_delivery_address_appears(){
        cartSteps.checkDeliveryAddress();
    }

    @Then("the user scrolls down to the subscription section")
    public void the_user_scrolls_down_to_the_subscription_section() {
        cartSteps.scrollDownToSubscription();
    }
    @Then("the user scrolls up back")
    public void the_user_scrolls_up_back() {
        cartSteps.scrollUpback();

    }

    @Then("the user sees the Checkout message")
    public void the_user_sees_the_checkout_message() {
        cartSteps.viewCheckoutMessage();
    }
    @Then("the user sees the Register login option")
    public void the_user_sees_the_register_login_option() {
        cartSteps.viewRegisterLogin();
    }
    @When("the user clicks the Register login link")
    public void the_user_clicks_the_register_login_link() {
        cartSteps.clickRegisterLogin();
    }
    @Then("the user is redirected to the login page")
    public void the_user_is_redirected_to_the_login_page() {
        cartSteps.viewLogin();
    }
    @When("the user scrolls down to place order")
    public void the_user_scrolls_down_to_place_order() {
        cartSteps.scrollDownToPlaceOrder();
    }
    @Then("the user sees the Download invoice option")
    public void the_user_sees_the_download_invoice_option() {
        cartSteps.viewDownloadInvoice();
    }
    @When("the user clicks the Download invoice link")
    public void the_user_clicks_the_download_invoice_link() {
        cartSteps.clickDownloadInvoice();
    }
    @Then("the user is able to access the downloaded invoice")
    public void the_user_is_able_to_access_the_downloaded_invoice() {
       cartSteps.viewInvoice();
    }



}
