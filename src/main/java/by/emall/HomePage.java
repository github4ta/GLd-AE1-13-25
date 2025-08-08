package by.emall;

public class HomePage {
    private final String LINK_FOOTER_VACANCIES="//a[@href='https://jobs.e-dostavka.by/']";
    private final String LINK_FOOTER_TELEGRAM="//a[@href='https://t.me/emall_by']";
    private static final String CLASS_FOOTER_LINK = "@class='footer_link__kkAzq'";
    private static final String FOOTER_LINK_TEXT_FOR_SUPPLIERS = "contains(text(),'Поставщикам')";

    private static final String FOOTER_LINK_FOR_SUPPLIERS =
            "//a[" + CLASS_FOOTER_LINK + " and " + FOOTER_LINK_TEXT_FOR_SUPPLIERS + "]";
}
