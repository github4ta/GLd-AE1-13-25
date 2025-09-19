package by.vek.ui.pages.home;

import by.vek.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    public HomePage() {
    }

    WebDriver driver = Driver.getDriver();

    public HomePage clickAcceptCookie() {
        try{
            driver.findElement(By.xpath(HomeLocator.BUTTON_ACCEPT_COOKIES)).click();
        } catch(Exception e) {
            System.out.println("There wasn't cookie banner. Cookie banner wasn't closed");
        }
        return this;
    }

    public void clickAccount() {
        driver.findElement(By.xpath(HomeLocator.BUTTON_ACCOUNT)).click();
        driver.findElement(By.xpath(HomeLocator.BUTTON_LOGIN)).click();

    }

    public void clickCart() {
        Driver.getDriver().findElement(By.xpath(HomeLocator.BUTTON_CART)).click();
    }

    public void startSearch(String itemToSearch) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement searchInput = Driver.getDriver().findElement(By.xpath(HomeLocator.INPUT_CATALOG_SEARCH));
        searchInput.sendKeys(itemToSearch);
        searchInput.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomeLocator.SEARCH_DROPDOWN)));
        searchInput.click();
        searchInput.sendKeys(Keys.ENTER);
   }
}
