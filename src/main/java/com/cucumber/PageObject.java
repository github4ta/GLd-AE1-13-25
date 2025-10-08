package com.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PageObject {

    @Given("User opens site")
    public void openSite() {
        System.out.println("Open Site");
    }

    @Given("User clicks button Login")
    public void clickLogin() {
        System.out.println("Click Login");
    }

    @When("User fills Email {email}")
    public void fillEmail(String email) {
        System.out.printf("Fill Email - \n", email);
    }

    @When("User clicks button Submit")
    public void clickSubmit() {
        System.out.println("Click Submit");
    }
}
