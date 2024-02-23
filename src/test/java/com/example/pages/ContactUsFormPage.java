package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

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
        $(By.cssSelector("input[name='submit']")).click();
    }
}
