package by.vek.ui.pages.account;

public class AccountLocator {
    public static final String TITLE_LOGIN_FORM = "//div[@class='LoginForm_title__OAEXy Text-module__text Text-module__large Text-module__bold']";
    public static final String RADIO_BUTTON_EMAIL = "//span[text()='Электронной почте']/preceding-sibling::input";
    public static final String RADIO_BUTTON_PASSWORD = "//span[text()='Номеру телефона']/preceding-sibling::input";
    public static final String INPUT_LOGIN_EMAIL = "//label[@class='form-input is-required is-email check-email']/input[@type='email']";
    public static final String INPUT_LOGIN_PASSWORD = "//input[@name='password']";
    public static final String BUTTON_CONTINUE = "//button[@class='Button-module__button EmailLoginForm_baseActionButton__5cptH Button-module__blue-primary']";
    public static final String BUTTON_REGISTRATION = "//button[@class='LinkButton-module__wrapper LinkButton-module__body LinkButton-module__regular LinkButton-module__blue']";
    public static final String BUTTON_FORGET_PASSWORD = "//button[@class='LinkButton-module__wrapper LinkButton-module__small LinkButton-module__regular LinkButton-module__blue']";
    public static final String TITLE_TEXT_RESET_PASSWORD = "//h5[@class='Form-module__formTitle']";
    public static final String BUTTON_BACK = "//button[@data-testid='modalBack']";
    public static final String BUTTON_CLOSE = "//button[@data-testid='modalClose']";
    public static final String LABEL_TEXT_RESET_PASSWORD_EMAIL = "//div//label[@for='reset-password-email']";
    public static final String BUTTON_MODULE_SAND = "//button[@class='Button-module__button Button-module__blue-primary']";
}
