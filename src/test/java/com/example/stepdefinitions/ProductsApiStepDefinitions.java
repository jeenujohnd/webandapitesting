package com.example.stepdefinitions;

import com.example.apistep.ProductsApiSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import io.restassured.response.Response;

import static net.serenitybdd.rest.SerenityRest.*;


import org.json.JSONArray;
import org.json.JSONObject;

public class ProductsApiStepDefinitions {

    private Response response;
    @Steps
    ProductsApiSteps productsApiSteps;

    @Given("the base URL \"([^\"]*)\"$")
    public void the_base_url(String baseUrl) {
        //productsApiSteps.isAppRunning();
        rest().baseUri(baseUrl);
    }

    @When("GET request to \"([^\"]*)\"$")
    public void get_request_to(String endpoint) {
        response = get(endpoint);
    }

    @Then("the API should return {int} status code")
    public void the_api_should_return_status_code(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the size of the {string} element have more than {int} times")
    public void the_size_of_the_element_have_more_than_times(String string, Integer int1) {
        String jsonString= response.body().print();
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray productArray = jsonObject.getJSONArray(string);
        assert(productArray.length() > int1);
    }
}
