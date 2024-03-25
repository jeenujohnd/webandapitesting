package com.example.stepdefinitions;


import ch.qos.logback.core.util.COWArrayList;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.bytebuddy.agent.VirtualMachine;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.Set;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.setDefaultRequestSpecification;


public class BrandsApiStepDefinitions {

    @Then("the number of brands should be greater than {int}")
    public void the_number_of_brands_should_be_greater_than(Integer int1) {
        restAssuredThat(response -> response.statusCode(200));
        String jsonString = SerenityRest.lastResponse().getBody().asString();
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray brandArray = jsonObject.getJSONArray("brands");
        System.out.println(brandArray.length());
        assert (brandArray.length()>int1);

    }
    @Then("the brands element should have attributes {string} and {string}")
    public void the_brands_element_should_have_attributes(String string, String string2) {
        String jsonString = SerenityRest.lastResponse().body().asString();
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray brandArray = jsonObject.getJSONArray("brands");
        Set<String> attributes = brandArray.getJSONObject(0).keySet();
        System.out.println( attributes.toString());
        assert (attributes.contains(string)&&attributes.contains(string2));
    }

    @When("PUT request to \"([^\"]*)\"$")
    public void put_request_to(String endpoint) {
        SerenityRest.when().put(endpoint);
    }



}
