package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AuthenticationPage extends PageObject {

    public void doLogin(String username, String password) {

        $(By.xpath("//i[@class='fa fa-lock']")).click();
        $(By.cssSelector("input[data-qa='login-email']")).sendKeys(username);
        $(By.cssSelector("input[data-qa='login-password']")).sendKeys(password);
        $(By.cssSelector("button[data-qa='login-button']")).click();

    }

    public void isLoggedIn() {
        assert ($(By.cssSelector("a[href='/logout']")).getText().equalsIgnoreCase("Logout"));
    }

    public void isLoggedOut() {
        assert ($(By.xpath("//a[@href='/login']")).getText()
                .equalsIgnoreCase("Signup / Login"));
    }

    public void doLogout(){
        $(By.cssSelector("a[href='/logout']")).click();
    }

    public void doSignUp(String userName,String email){
        $(By.cssSelector("a[href='/login']")).click();
        $(By.cssSelector("input[data-qa='signup-name']")).sendKeys(userName);
        $(By.cssSelector("input[data-qa='signup-email']")).sendKeys(email);
        $(By.cssSelector("button[data-qa='signup-button']")).click();
    }


    public void isNotSignedUp() {
        assert ($(By.cssSelector("p[style='color: red;']")).getText()
                .equalsIgnoreCase("Email Address already exist!"));
    }

    public void isHavingLoginError() {
        assert ($(By.cssSelector("p[style='color: red;']")).getText()
                .equalsIgnoreCase("Your email or password is incorrect!"));
    }
}
