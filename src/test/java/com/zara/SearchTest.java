package com.zara;

import com.zara.driver.Driver;
import com.zara.pages.HomePage;
import com.zara.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.clickButtonAcceptCookies();
        homePage.clickButtonCloseLocation();

        homePage.clickSearchButton();

        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysInputSearch("qwertyu");

        Assertions.assertEquals("НИЧЕГО НЕ НАЙДЕНО", searchPage.getNotFoundText());

        Driver.quit();
    }
}
