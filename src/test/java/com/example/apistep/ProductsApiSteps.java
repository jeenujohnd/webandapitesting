package com.example.apistep;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;

public class ProductsApiSteps {

    private static final String HOMEPAGE = "https://www.automationexercise.com/";

    public void isAppRunning() {
        int statusCode = RestAssured.get(HOMEPAGE).statusCode();
        assert(statusCode==200);
    }
}
