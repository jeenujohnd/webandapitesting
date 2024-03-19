package com.example.apistep;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;

public class ProductsApiSteps {

    private static final String HOMEPAGE = "https://www.automationexercise.com/";
    private static final String PRODUCT_LIST="https://automationexercise.com/api/productsList";
    public void isAppRunning() {
        int statusCode = RestAssured.get(HOMEPAGE).statusCode();
        assert(statusCode==200);
    }
    public void checkAllProductList() {
        SerenityRest.given().get(PRODUCT_LIST);
    }
}
