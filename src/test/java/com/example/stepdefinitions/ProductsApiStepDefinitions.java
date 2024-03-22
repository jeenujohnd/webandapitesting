package com.example.stepdefinitions;

import com.example.apistep.ProductsApiSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ResponseBody;
import net.serenitybdd.annotations.Steps;

import io.restassured.response.Response;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.core.IsEqual.equalTo;


import net.serenitybdd.rest.SerenityRest;
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
        SerenityRest.given().get(endpoint);
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

    @When("POST request to \"([^\"]*)\"$")
    public void post_request_to(String endpoint) {
        response = post(endpoint);
    }

    @Then("the API should have {int} response code")
    public void the_API_should_have_response_code(int code){
        String jsonStringBody=response.body().print();
        JSONObject jsonObject = new JSONObject(jsonStringBody);
        int responseCode=(int)jsonObject.get("responseCode");
        assert(responseCode==code);
    }

    @Then("the response message should be {string}")
    public void the_response_message_should_be(String string) {
        String jsonStringBody = response.body().print();
        JSONObject jsonObject = new JSONObject(jsonStringBody);
        String message = (String) jsonObject.get("message");
        assert(message.equalsIgnoreCase(string));

    }
}
