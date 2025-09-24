package com.zara.pages;

import com.zara.driver.Driver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private static final String BUTTON_SEARCH = "//a[@data-qa-id='header-search-text-link']";

    public void clickSearchButton() {
        Driver.getDriver().findElement(By.xpath(BUTTON_SEARCH)).click();
    }
}
