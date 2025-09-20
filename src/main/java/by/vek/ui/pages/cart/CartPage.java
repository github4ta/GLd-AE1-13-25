package by.vek.ui.pages.cart;

import by.vek.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static by.vek.ui.pages.cart.CartLocators.CHECKBOX_SELECT_ALL;
import static by.vek.ui.pages.cart.CartLocators.TOTAL_PRICE_VALUE;
import static by.vek.ui.pages.cart.CartLocators.BUTTON_PLACE_ORDER;
import static by.vek.ui.pages.cart.CartLocators.TITLE_CART_IS_EMPTY;

public class CartPage {

    private final WebDriver driver = (WebDriver) Driver.getDriver();

    public String getEmptyCartText() {
        try {
            return getElement(By.xpath(TITLE_CART_IS_EMPTY)).getText();
        } catch (NoSuchElementException e) {
            return "";
        }
    }

    public void clickSelectAllCheckbox() {
        getElement(By.xpath(CHECKBOX_SELECT_ALL)).click();
    }

    public String getTotalAmountText() {
        return getElement(By.xpath(TOTAL_PRICE_VALUE)).getText();
    }

    public void clickCheckoutButton() {
        getElement(By.xpath(BUTTON_PLACE_ORDER)).click();
    }

    private WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}
