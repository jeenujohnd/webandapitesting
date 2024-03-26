package com.example.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class AuthenticationApiStepDefinitions {

    @When("POST request to {string} with request parameters keys {string},{string} values {string},{string}")
    public void post_request_to_with_request_parameters_keys_values(String endpoint, String key1, String key2, String value1, String value2) {
        SerenityRest.given()
                .contentType("application/x-www-form-urlencoded")
                .formParam(key1,value1)
                .formParam(key2,value2)
                .post(endpoint);
        System.out.println("POST request successfull!!");
    }
}
