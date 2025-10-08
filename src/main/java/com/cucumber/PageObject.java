package com.cucumber;

public class PageObject {

    public void openSite() {
        System.out.println("Open Site");
    }

    public void clickLogin() {
        System.out.println("Click Login");
    }

    public void fillEmail(String email) {
        System.out.printf("Fill Email - \n", email);
    }

    public void clickSubmit() {
        System.out.println("Click Submit");
    }
}
