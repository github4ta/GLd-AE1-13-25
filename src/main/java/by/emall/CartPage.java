package by.emall;

public class CartPage {
    private final String TITLE_CART="//h1[@class='cart_heading__title__Whukp' and normalize-space(text())='Корзина']";
    private final String SPAN_PRICES_VALUE ="//div[@class='cart_prices__value__3mhYj'][span[1][contains(text(), 'товар')]]/span[2]";

    private final String CHECKBOX_SELECT_ALL =
                "//span[@class='checkbox_checkbox__pseudo__Km_pz checkbox_checkbox__pseudo_checked__CNCMz']";
    private final String CHECKBOX_TITLE_SELECT_ALL =
            "//input[@type='checkbox']/following-sibling::span[contains(text(), 'Выбрать всё')]";

    private final String promotionsButtonEmptyCart = "//div[contains(@class, 'cart-empty__actions')]//a[text()='Акции']";
    private final String totalItemsCount = "//div[contains(@class, 'checkout-total__main-count')]";
    private final String TEXT_CART_TOTAL_SUM = "//div[@class='cart_prices__total__Gtyvn']/span[1]";

    private final String BUTTON_GO_TO_THE_MAIN_PAGE = "//button[@class = 'btn_btn__jx6SQ btn_btn_colour_black__wifsv btn_btn_size_medium__ugU8B btn_btn_type_secondary__F_KB1 empty_button__uixo_']";
    private final String BUTTON_SELECT_METHOD_OF_RECEIPT = "//button[@class = 'btn_btn__jx6SQ btn_btn_colour_primary___02d8 btn_btn_block__RfM75 order-button_button__I6guD']";

    private final String EMPTY_DESCRIPTION = "//span[@class='empty_description__KDhZM']";
    private final String BUTTON_PRIMARY = "//button[@class='btn_btn__jx6SQ btn_btn_colour_primary___02d8 " +
                                           "btn_btn_block__RfM75 order-button_button__I6guD']";

    private final String BUTTON_ADD_ADDRESS = "//button[@class='btn_btn__jx6SQ btn_btn_colour_black__wifsv btn_btn_size_medium__ugU8B btn_btn_type_secondary__F_KB1 btn_btn_block__RfM75']";

    private final String CART_PAGE_AMOUNT_INDEX = "//span[@class='cart_heading__counter__9_OT5']";
}
