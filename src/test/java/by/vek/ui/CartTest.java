package by.vek.ui;

import by.vek.logger.BaseLogger;
import by.vek.ui.driver.Driver;
import by.vek.ui.pages.cart.CartPage;
import by.vek.ui.pages.home.HomePage;
import org.junit.jupiter.api.*;

public class CartTest extends BaseLogger {
    @BeforeEach
    public void openCartPage() {
        HomePage homePage = new HomePage();
        homePage.openHomePage()
                .clickAcceptCookie()
                .clickCart();
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }

    @Test
    @DisplayName("\"Корзина\" title is displayed")
    public void test1() {
        CartPage cartPage = new CartPage(Driver.getDriver());
        Assertions.assertEquals("Корзина", cartPage.getCartTitle());
        logger.info("Running SearchTest, test1: \"Корзина\" title is displayed");
    }

    @Test
    @DisplayName("\"Вы можете выбрать товары в каталоге или воспользоваться поиском.\" title is displayed")
    public void test2() {
        CartPage cartPage = new CartPage(Driver.getDriver());
        Assertions.assertEquals("Вы можете выбрать товары в каталоге или воспользоваться поиском.", cartPage.getTextEmptyBasket());
        logger.info("Running SearchTest, test2: \"Вы можете выбрать товары в каталоге или воспользоваться поиском.\" title is displayed\"");
    }

    @Test
    @DisplayName("The address in the address bar matches https://www.21vek.by/order/.")
    public void test3() {
        CartPage cartPage = new CartPage(Driver.getDriver());
        Assertions.assertEquals("https://www.21vek.by/order/", cartPage.getCurrentURL());
        logger.info("Running SearchTest, test3: The address in the address bar matches https://www.21vek.by/order/");
    }
}
