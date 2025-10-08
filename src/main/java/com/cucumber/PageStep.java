package com.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class PageStep {

    @Given("User opens site")
    public void openSite() {
        System.out.println("Open Site");
    }

    @Given("User clicks button Login")
    public void clickLogin() {
        System.out.println("Click Login");
    }

    @When("User fills Email {string}")
    public void fillEmail(String email) {
        System.out.printf("Fill Email - \n", email);
    }

    @When("User clicks button Submit")
    public void clickSubmit() {
        System.out.println("Click Submit");
    }

    @Then("User logins into site")
    public void checkUserLoginsIntoSite() {
        Assertions.assertEquals("Welcome User", getAuthorizedUserPageTitleText());
    }

    @Then("User sees error email message")
    public void checkUserSeesErrorEmailMessage() {
        Assertions.assertEquals("Email is not valid", getErrorText());
    }

    private String getAuthorizedUserPageTitleText() {
        return "Welcome User";
    }

    private String getErrorText() {
        return "Email is empty";
    }
}
