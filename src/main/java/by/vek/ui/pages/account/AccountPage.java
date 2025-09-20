package by.vek.ui.pages.account;

import by.vek.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    org.openqa.selenium.WebDriver driver;

    public AccountPage() {
        driver = (WebDriver) Driver.getDriver();
    }

    public String getTitleLoginFormText() {
        return driver.findElement(By.xpath(AccountLocator.TITLE_LOGIN_FORM)).getText();
    }

    public void clickRadioButtonEmail() {
        driver.findElement(By.xpath(AccountLocator.RADIO_BUTTON_EMAIL)).click();
    }

    public void clickRadioButtonPhoneNumber() {
        driver.findElement(By.xpath(AccountLocator.RADIO_BUTTON_PASSWORD)).click();
    }

    public void sendInputLoginEmail(String email) {
        driver.findElement(By.xpath(AccountLocator.INPUT_LOGIN_EMAIL)).sendKeys(email);
    }

    public void sendInputLoginPassword(String password) {
        driver.findElement(By.xpath(AccountLocator.INPUT_LOGIN_PASSWORD)).sendKeys(password);
    }

    public void clickButtonContinue() {
        driver.findElement(By.xpath(AccountLocator.BUTTON_CONTINUE)).click();
    }

    public void clickButtonRegistration() {
        driver.findElement(By.xpath(AccountLocator.BUTTON_REGISTRATION)).click();
    }

    public void clickButtonForgetPassword() {
        driver.findElement(By.xpath(AccountLocator.BUTTON_FORGET_PASSWORD)).click();
    }
}
