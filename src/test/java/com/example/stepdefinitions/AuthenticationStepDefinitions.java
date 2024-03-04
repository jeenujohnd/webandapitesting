package com.example.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import com.example.steps.AuthenticationSteps;

public class AuthenticationStepDefinitions {

    @Steps(shared =  true)
    AuthenticationSteps loginsteps;

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
         loginsteps.isLoggedIn();
    }

    @Then("the user should be unable to login")
    public void the_user_should_be_unable_to_login(){
        //loginsteps.isLoggedOut();
        loginsteps.isHavingLoginError();
    }

    @When("the user clicks the logout button")
    public void  the_user_clicks_the_logout_button(){
        loginsteps.userLogout();
    }

    @Then("the user should be logged out")
    public void the_user_should_be_logged_out(){
        loginsteps.isLoggedOut();
    }

    @When("the user provides sign up credentials as {string} and {string}")
    public void the_user_provides_sign_up_credentials(String userName,String email){
        loginsteps.existingEmail(userName,email);
    }

    @Then("the user is unable to sign up")
    public void the_user_is_unable_to_sign_up(){
        loginsteps.isNotSignedUp();
    }

    @After
    public void cleanup(){
        loginsteps.cleanup();
    }


}
