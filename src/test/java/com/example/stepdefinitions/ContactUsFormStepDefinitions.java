package com.example.stepdefinitions;

import com.example.steps.ContactUsFormSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Shared;
import net.serenitybdd.annotations.Steps;

public class ContactUsFormStepDefinitions {

    @Steps(shared = true)
    ContactUsFormSteps contactUsSteps;

    @When("the user clicks the Contact us link")
    public void the_user_clicks_the_Contact_us_link(){
        contactUsSteps.clickContactUsLink();
    }

    @Then("the user should be able to view and submit the Contact us form")
    public void the_user_should_be_able_to_view_and_submit_the_Contact_us_form(){
        contactUsSteps.submitContactUsForm();
    }
}
