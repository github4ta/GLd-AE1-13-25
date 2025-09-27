package by.vek.ui.pages;

import by.vek.ui.driver.Driver;

public class BasePage {

    private final String BASE_URL = "https://www.21vek.by/";

    protected void openSite() {
        Driver.getDriver().get(BASE_URL);
    }
}
