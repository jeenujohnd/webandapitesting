package com.example.steps;

import com.example.pages.AuthenticationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.Set;
import java.util.Iterator;

public class AuthenticationSteps {
    AuthenticationPage loginPage;

    public void openLoginPage() {

        loginPage.openUrl("https://www.google.com/");

//        loginPage.open();
        loginPage.getDriver().manage().window().maximize();
        while (loginPage.getDriver().getWindowHandles().size()!=2)
        {
            //
        }
        Set<String> handles = loginPage.getDriver().getWindowHandles();
        Iterator<String> windowIterator = handles.iterator();
        String parentID = windowIterator.next();
        String childID = windowIterator.next();
        loginPage.getDriver().switchTo().window(childID);
        loginPage.getDriver().close();
        loginPage.getDriver().switchTo().window(parentID);
        loginPage.openUrl("https://www.automationexercise.com/");
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

    public void existingEmail(String userName,String email) {
        loginPage.doSignUp(userName,email);
    }

    public void isNotSignedUp() {
        loginPage.isNotSignedUp();
    }

    public void isHavingLoginError() {
        loginPage.isHavingLoginError();
    }


    public void cleanup() {
        loginPage.getDriver().close();
        loginPage.getDriver().quit();
    }


}
