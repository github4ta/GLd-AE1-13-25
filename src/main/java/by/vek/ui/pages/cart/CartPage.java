package by.vek.ui.pages.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static by.vek.ui.pages.cart.CartLocators.*;

public class CartPage {

    private static final int WAIT_TIMEOUT = 10;

    private final WebDriver driver;
    private final WebDriverWait wait;

//    public CartPage() {
//    }

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT));
    }

    public String getCartTitle() {
        return getElement(By.xpath(TITLE_CART)).getText();
    }

    public String getTextEmptyBasket() {
        return getElement(By.xpath(TEXT_EMPTY_BASKET)).getText();
    }

    public String getEmptyCartText() {
        return getElement(By.xpath(TITLE_CART_IS_EMPTY)).getText();
    }

    public void clickSelectAllCheckbox() {
        getVisibleElement(By.xpath(CHECKBOX_SELECT_ALL)).click();
    }

    public String getTotalAmountText() {
        return getVisibleElement(By.xpath(TOTAL_PRICE_VALUE)).getText();
    }

    public void clickCheckoutButton() {
        getVisibleElement(By.xpath(BUTTON_PLACE_ORDER)).click();
    }

    private WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    private WebElement getVisibleElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}
