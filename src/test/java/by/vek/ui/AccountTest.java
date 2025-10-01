package by.vek.ui;

import by.vek.ui.pages.header.Header;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest extends BaseTest {
    Header header;

    @BeforeEach
    public void prepareAccountPanel() {
        homePage.clickAccountButton();
        header = new Header(driver);
    }

    @Test
    @DisplayName("Панель аккаунта отображается после клика")
    public void testDisplayAccountPanelAfterClick() {
        assertTrue(header.isAccountPanelVisible());
        logger.info("Проверка отображения панели аккаунта");
    }

    @Test
    @DisplayName("Кнопка 'Войти' отображается и содержит правильный текст")
    public void shouldDisplayLoginButtonWithCorrectText() {
        assertAll(
                () -> assertTrue(header.isLoginButtonVisible(), "Кнопка 'Войти' должна быть видимой"),
                () -> assertEquals("Войти", header.getLoginButtonText()));
        logger.info("Проверка отображения и текста кнопки 'Войти'");
    }
}
