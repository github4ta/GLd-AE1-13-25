package by.vek.ui;

import by.vek.logger.BaseLogger;
import by.vek.ui.driver.Driver;
import by.vek.ui.pages.home.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest extends BaseLogger {

    protected WebDriver driver = Driver.getDriver();
    protected HomePage homePage;

    @BeforeEach
    public void prepareHomePage() {
        homePage = new HomePage();
        homePage.openHomePage()
                .clickAcceptCookie();
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
