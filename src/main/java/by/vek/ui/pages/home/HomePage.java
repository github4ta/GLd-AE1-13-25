package by.vek.ui.pages.home;

import by.vek.ui.driver.Driver;
import by.vek.ui.pages.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage() {
    }

    WebDriver driver = Driver.getDriver();
    private static final Logger LOGGER = LogManager.getLogger();

    public HomePage openHomePage() {
        openSite();
        return this;
    }

    public HomePage clickAcceptCookie() {
        try {
            driver.findElement(By.xpath(HomeLocator.BUTTON_ACCEPT_COOKIES)).click();
        } catch (TimeoutException | NoSuchElementException e) {
            LOGGER.info("There wasn't cookie banner. Cookie banner wasn't closed");
        }
        return this;
    }

    public void clickAccount() {
        driver.findElement(By.xpath(HomeLocator.BUTTON_ACCOUNT)).click();
        driver.findElement(By.xpath(HomeLocator.BUTTON_LOGIN)).click();

    }

    public void clickAccountButton() {
        driver.findElement(By.xpath(HomeLocator.BUTTON_ACCOUNT)).click();
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
