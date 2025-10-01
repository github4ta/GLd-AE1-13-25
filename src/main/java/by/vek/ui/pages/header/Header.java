package by.vek.ui.pages.header;

import by.vek.ui.pages.BasePage;
import by.vek.ui.pages.home.HomeLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Header extends BasePage {

    private static final int WAIT_TIMEOUT = 5;

    private final WebDriver driver;
    private final WebDriverWait wait;

    public Header(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT));
    }

    public boolean isAccountPanelVisible() {
        return getVisibleElement(By.xpath(HeaderLocators.ACCOUNT_PANEL))
                .isDisplayed();
    }

    public boolean isLoginButtonVisible() {
        return getVisibleElement(By.xpath(HomeLocator.BUTTON_LOGIN))
                .isDisplayed();
    }

    public String getLoginButtonText() {
        return getElement(By.xpath(HomeLocator.BUTTON_LOGIN))
                .getText();
    }

    private WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    private WebElement getVisibleElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
