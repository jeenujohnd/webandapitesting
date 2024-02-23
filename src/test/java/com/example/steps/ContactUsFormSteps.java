package com.example.steps;

import com.example.pages.ContactUsFormPage;

public class ContactUsFormSteps {

    ContactUsFormPage contactUsPage;
    public void clickContactUsLink() {
        contactUsPage.clickContactUslink();
    }

    public void submitContactUsForm() {
        contactUsPage.submitContactUsForm();
    }
}
