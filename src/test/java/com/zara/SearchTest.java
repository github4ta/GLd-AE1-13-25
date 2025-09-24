package com.zara;

import com.zara.driver.Driver;
import com.zara.pages.HomePage;
import com.zara.pages.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchTest {
    @BeforeEach
    public void openSite() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.clickButtonAcceptCookies();
        homePage.clickButtonCloseLocation();

        homePage.clickSearchButton();
    }

    @Test
    public void test() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysInputSearch("qwertyu");

        Assertions.assertEquals("НИЧЕГО НЕ НАЙДЕНО", searchPage.getNotFoundText());
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
