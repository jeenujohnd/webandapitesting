package com.example.stepdefinitions;


import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.bytebuddy.agent.VirtualMachine;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONArray;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class BrandsApiStepDefinitions {




    @Then("the number of brands should be greater than {int}")
    public void the_number_of_brands_should_be_greater_than(Integer int1) {
        restAssuredThat(response -> response.statusCode(200));
        String jsonString = SerenityRest.lastResponse().getBody().asString();
//        String jsonString = response.body().print();
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray brandArray = jsonObject.getJSONArray("brands");
        System.out.println(brandArray.length());
        assert (brandArray.length()>int1);

    }
//    @Then("the brand element should have attributes {string} and {string}")
//    public void the_brand_element_should_have_attributes_and(String string, String string2) {
//
//    }



}
