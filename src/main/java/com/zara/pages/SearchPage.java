package com.zara.pages;

import com.zara.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    private static String INPUT_SEARCH = "//input[@id='search-home-form-combo-input']";
    private static String NOT_FOUND_TEXT = "//div[@class='zds-empty-state__title']//span";
    private static String PRODUCT_TITLE = "//div[@class='product-grid-product-info__main-info']//h3";

    public static void sendKeysInputSearch(String searchText) {
        Driver.getDriver().findElement(By.xpath(INPUT_SEARCH)).sendKeys(searchText);
    }

    public static String getNotFoundText() {
        return Driver.getDriver().findElement(By.xpath(NOT_FOUND_TEXT)).getText();
    }

    public static List<String> getProductTitles() {
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(PRODUCT_TITLE));
        List<String> titles = new ArrayList<>();
        for (WebElement product : list) {
            titles.add(product.getText());
        }
        return titles;
    }
}
