package com.zara.pages;

import com.zara.driver.Driver;
import org.openqa.selenium.By;

public class BasePage {
    private final String URL = "https://www.zara.com/by/ru/";
    private final String BUTTON_ACCEPT_COOKIES = "//button[@id='onetrust-accept-btn-handler']";
    private final String BUTTON_CLOSE_LOCATION = "//button[@class='zds-dialog-icon-button zds-dialog-close-button']";
    private final String BUTTON_ACCEPT_LOCATION = "//button[@data-qa-action='stay-in-store']";

    public void openSite() {
        Driver.getDriver().get(URL);
    }

    public void clickButtonAcceptCookies() {
        try {
            Driver.getDriver().findElement(By.xpath(BUTTON_ACCEPT_COOKIES)).click();
        } catch (Exception e) {

        }
    }

    public void clickButtonCloseLocation() {
        try {
            Driver.getDriver().findElement(By.xpath(BUTTON_CLOSE_LOCATION)).click();
        } catch (Exception e) {

        }
    }
}
