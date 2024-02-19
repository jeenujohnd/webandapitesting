package com.example.steps;

import com.example.pages.AuthenticationPage;

public class AuthenticationSteps {
    AuthenticationPage loginPage;

    public void openLoginPage(){
        loginPage.setDefaultBaseUrl("https://www.automationexercise.com/");
        loginPage.open();
        loginPage.getDriver().manage().window().maximize();
    }

    public void loginAsUser(String username, String password){
        loginPage.doLogin(username, password);
    }

    public void isLoggedIn() {
        loginPage.isLoggedIn();
    }

    public void isLoggedOut() {
        loginPage.isLoggedOut();
    }

    public void userLogout(){
        loginPage.doLogout();
    }


    public void cleanup() {
        loginPage.getDriver().close();
        loginPage.getDriver().quit();
    }
}
