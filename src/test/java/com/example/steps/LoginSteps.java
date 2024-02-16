package com.example.steps;

import com.example.pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    public void openLoginPage(){
        loginPage.setDefaultBaseUrl("https://www.automationexercise.com/");
        loginPage.open();
        loginPage.getDriver().manage().window().maximize();
    }

    public void loginAsUser(String username, String password){
        loginPage.doLogin(username, password);
    }

}
