package by.emall;

public class HomePage {
    private final String LINK_VACANCIES="//a[@href='https://jobs.e-dostavka.by/']";
    private final String LINK_TELEGRAM="//a[@href='https://t.me/emall_by']";

    private final String CLASS_FOOTER_LINK = "@class='footer_link__kkAzq'";
    private final String FOOTER_LINK_TEXT_FOR_SUPPLIERS = "contains(text(),'Поставщикам')";

    private final String FOOTER_LINK_FOR_SUPPLIERS =
            "//a[" + CLASS_FOOTER_LINK + " and " + FOOTER_LINK_TEXT_FOR_SUPPLIERS + "]";

    private final String contactsLink = "//a[@title='Контакты']";
    private final String HEADER_LOGIN_LINK="//a[@href='https://emall.by/login?backurl=/']";
    private final String FOOTER_USER_AGREEMENT_LINK="//a[@href='https://api-preprod.emall.by/649008c9c6277_publichnyj-dogovor-emall.pdf']";

    private final String FOOTER_TEXT_ABOUT_SERVICE = "//a[text() = 'О сервисе']";
    private final String FOOTER_TEXT_AGREEMENT_CREDIT_RESOURCES = "//a[text() = 'Соглашение о кредитных ресурсах']";

    private final String ACTION_BUTTON_BADGE = "//a[@class='actions_action__button__ptOha']";
    private final String FOOTER_LINK_INFORMATION_HELP = "//a[@href='https://emall.by/information/help/132']";

    private final String SEARCH_GOODS = "//input[@class='web_search__input__0oHdp']";
    private final String LINK_BECOME_A_SELLER = "//a[@href='https://seller.emall.by/']";
    private final String LINK_TIK_TOK = "//a[@href='https://www.tiktok.com/@emall_by']";

    private final String LINK_VK = "//a[@href='https://vk.com/public210123351']";
    private final String FOOTER_BUSINESS_DELIVERY = "//a[@href='https://business.emall.by/']";
}
