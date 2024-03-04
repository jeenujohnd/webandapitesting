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

//        System.out.println("Printing=================");
//        System.out.println(loginPage.getDriver().getWindowHandle());
//        String currentHandle = loginPage.getDriver().getWindowHandle();
//        for (String handle : loginPage.getDriver().getWindowHandles()) {
//          if (!handle.equals(currentHandle)) {
//                System.out.println(handle);
//                loginPage.getDriver().switchTo().window(handle);
//                //break;
//            }

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

//    public void openSignUpPage() {
//        loginPage.setDefaultBaseUrl("https://www.automationexercise.com/");
//        loginPage.open();
//        System.out.println(loginPage.getDriver().getWindowHandle());
//        // Switch back to the main tab if needed
//       // loginPage.getDriver().switchTo().window(loginPage.getDriver().getWindowHandles().iterator().next());
//    }

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
