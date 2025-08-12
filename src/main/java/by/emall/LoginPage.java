package by.emall;

public class LoginPage {
    private final String LABEL_PHONE_NUMBER="//label[@class='new-input-phone_label__BGsx4']";

    private final String BUTTON_SUBMIT =
            "//button[@class='btn_btn__jx6SQ btn_btn_colour_black__wifsv " +
                    "btn_btn_size_medium__ugU8B login_button__Ewgfi']";

    private final String pageTitle = "//h1[text()='Вход']";
    private final String EMPTY_TEL_NUMBER_ERROR_MESSAGE = "//div[@class='new-input-phone_message__WsZQD']";

    private final String INPUT_TEL_NUMBER = "//input[@id='tel']";
}
