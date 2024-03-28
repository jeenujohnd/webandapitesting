package com.example.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    @When("DELETE request to {string}")
    public void DELETE_request_to(String endpoint){
        SerenityRest.when().delete(endpoint);
    }

    @When("POST request to {string} with request parameters")
    public void post_request_to_with_request_parameters(String endpoint,DataTable dataTable) {
        // Extracting parameters from DataTable and converting it into a Map
        Map<String, String> formParams = new HashMap<>();
        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String, String> row : data) {
            formParams.putAll(row);
        }

        SerenityRest.given()
                .contentType("application/x-www-form-urlencoded")
                .formParams(formParams)
                .post(endpoint);
    }

    @When("DELETE request to {string} with request parameters keys {string},{string} values {string}, {string}")
    public void delete_request_to_with_request_parameters_keys_values(String endpoint, String email, String password, String emailID, String pwdVal) {
       SerenityRest.given()
               .contentType("application/x-www-form-urlencoded")
               .formParams(email,emailID)
               .formParams(password,pwdVal)
               .delete(endpoint);
    }

    @When("PUT request to {string} with request parameters")
    public void put_request_to_with_request_parameters(String endpoint, DataTable dataTable) {

        Map<String, String> formParams = new HashMap<>();
        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String, String> row : data) {
            formParams.putAll(row);
        }

        SerenityRest.given()
                .contentType("application/x-www-form-urlencoded")
                .formParams(formParams)
                .put(endpoint);
    }

    @When("GET request to {string} with request parameter key {string} and value {string}")
    public void get_request_to_with_request_parameter_key_and_value(String endpoint, String email, String emailID) {
        SerenityRest.given()
                .queryParam(email,emailID )
                .contentType(ContentType.URLENC)
                .get(endpoint);

    }

    @Then("the response should be the user details")
    public void the_response_should_be_the_user_details() {
        String jsonString =SerenityRest.lastResponse().body().asString();
        JSONObject jsonObject = new JSONObject(jsonString);
        System.out.println(jsonObject.get("user").toString());
    }

}
