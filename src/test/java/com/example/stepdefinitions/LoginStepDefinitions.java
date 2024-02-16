package com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import com.example.steps.LoginSteps;

public class LoginStepDefinitions {

    @Steps(shared =  true)
    LoginSteps loginsteps;

    @Given("the user opens the website")
    public void the_user_opens_the_website(){
        loginsteps.openLoginPage();
    }

    @When("the user provides credentials {string} and {string}")
    public void the_user_provides_credentials(String userName, String password){
        loginsteps.loginAsUser(userName, password);
    }

    @Then("the user should be able to see the homepage")
    public void the_user_see_the_homepage(){

    }
}
