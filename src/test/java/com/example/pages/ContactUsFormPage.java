package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ContactUsFormPage extends PageObject {
    public void clickContactUslink() {

        $(By.cssSelector("a[href='/contact_us']")).click();



    }

    public void submitContactUsForm() {
        $(By.cssSelector("input[name='name']")).sendKeys("Kevin");
        $(By.cssSelector("input[name='email']")).sendKeys("Kevin@gg.com");
        $(By.cssSelector("input[name='subject']")).sendKeys("Enquiry");
        $(By.id("message")).sendKeys("Information on orders.");
        $(By.cssSelector("input[name='upload_file']"))
                .sendKeys("/Users/dennisthomas/Documents/Jeenu/Evening Prayer.docx");
        getJavascriptExecutorFacade().executeScript("window.scrollTo(0, 100);");
        $(By.cssSelector("input[name='submit']")).click();
        getDriver().switchTo().alert().accept();
        assert ($(By.cssSelector("div[class='status alert alert-success']")).getText().trim()
                .equalsIgnoreCase("Success! Your details have been submitted successfully."));
    }
}
