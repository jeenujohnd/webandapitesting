package com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.rest.SerenityRest.*;


import net.serenitybdd.rest.SerenityRest;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProductsApiStepDefinitions {

    @Given("the base URL \"([^\"]*)\"$")
    public void the_base_url(String baseUrl) {
        SerenityRest.setDefaultBasePath(baseUrl);
    }

    @When("GET request to \"([^\"]*)\"$")
    public void get_request_to(String endpoint) {
        SerenityRest.when().get(endpoint);


    }

    @Then("the API should return {int} status code")
    public void the_api_should_return_status_code(int statusCode) {
        restAssuredThat(response->response.statusCode(statusCode));


    }

    @Then("the size of the {string} element have more than {int} times")
    public void the_size_of_the_element_have_more_than_times(String string, Integer int1) {
        String jsonString= SerenityRest.lastResponse().getBody().asString();
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray productArray = jsonObject.getJSONArray(string);
        assert(productArray.length() > int1);
    }

    @When("POST request to \"([^\"]*)\"$")
    public void post_request_to(String endpoint) {
       SerenityRest.when().post(endpoint);
    }

    @Then("the API should have {int} response code")
    public void the_API_should_have_response_code(int code){
        String jsonStringBody = SerenityRest.lastResponse().body().asString();
        JSONObject jsonObject = new JSONObject(jsonStringBody);
        int responseCode=(int)jsonObject.get("responseCode");
        assert(responseCode==code);

    }

    @Then("the response message should be {string}")
    public void the_response_message_should_be(String string) {
        String jsonStringBody =SerenityRest.lastResponse().body().asString();
        JSONObject jsonObject = new JSONObject(jsonStringBody);
        String message = (String) jsonObject.get("message");
        assert(message.equalsIgnoreCase(string));

    }

    @When("POST request to {string} with request parameter key {string} and value {string}")
    public void post_request_to_with_request_parameter_key_and_value(String endpoint, String key, String value) {
        SerenityRest.given()
                .contentType("application/x-www-form-urlencoded")
                .formParam(key, value)
                .post(endpoint);
    }
    @Then("the products element should include value {string} in the key {string}")
    public void the_products_element_should_include_value_in_the_attribute(String key, String value) {
        String jsonString = SerenityRest.lastResponse().body().asString();
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray productsArray =jsonObject.getJSONArray("products");
        for(int i=0;i<productsArray.length();i++)
        {
            JSONObject product =productsArray.getJSONObject(i);
            assert(product.keys().toString().contains(key)&&
                   String.valueOf(product.get(key)).contains(value));
        }

    }
}
