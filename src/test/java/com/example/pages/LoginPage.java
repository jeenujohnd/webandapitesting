package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {

    public void doLogin(String username, String password) {

        $(By.xpath("//i[@class='fa fa-lock']")).click();
        $(By.cssSelector("input[data-qa='login-email']")).sendKeys(username);
        $(By.cssSelector("input[data-qa='login-password']")).sendKeys(password);
        $(By.cssSelector("button[data-qa='login-button']")).click();


    }
}
