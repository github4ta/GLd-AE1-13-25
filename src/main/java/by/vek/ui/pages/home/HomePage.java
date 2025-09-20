package by.vek.ui.pages.home;

import by.vek.ui.driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HomePage {

    public HomePage() {
    }

    WebDriver driver = Driver.getDriver();
    private static final Logger logger = LogManager.getLogger();

    public HomePage clickAcceptCookie() {
        try {
            driver.findElement(By.xpath(HomeLocator.BUTTON_ACCEPT_COOKIES)).click();
        } catch (TimeoutException | NoSuchElementException e) {
            logger.info("There wasn't cookie banner. Cookie banner wasn't closed");
        }
        return this;
    }

    public void clickAccount() {
        driver.findElement(By.xpath(HomeLocator.BUTTON_ACCOUNT)).click();
        driver.findElement(By.xpath(HomeLocator.BUTTON_LOGIN)).click();

    }

    public void clickCart() {
        driver.findElement(By.xpath(HomeLocator.BUTTON_CART)).click();
    }

    public void startSearch(String itemToSearch) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement searchInput = driver.findElement(By.xpath(HomeLocator.INPUT_CATALOG_SEARCH));
        searchInput.click();
        searchInput.sendKeys(itemToSearch);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomeLocator.SEARCH_DROPDOWN)));
        searchInput.sendKeys(Keys.ENTER);
    }
}
