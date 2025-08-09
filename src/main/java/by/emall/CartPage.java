package by.emall;

public class CartPage {
    private final String TITLE_CART="//h1[@class='cart_heading__title__Whukp']/text()";
    private final String PRICE_FOR_ITEMS ="//div[@class='cart_prices__value__3mhYj'][span[1][contains(text(), 'товар')]]/span[2]";

    private final String CHECKBOX_SELECT_ALL =
            "//span[@class='checkbox_checkbox__pseudo__Km_pz checkbox_checkbox__pseudo_checked__CNCMz']" +
                    "/following-sibling::span[contains(text(), 'Выбрать всё')]";
    private final String CHECKBOX_LABEL_SELECT_ALL =
            "//input[@type='checkbox']/following-sibling::span[contains(text(), 'Выбрать всё')]";

    private final String promotionsButtonEmptyCart = "//div[contains(@class, 'cart-empty__actions')]//a[text()='Акции']";
    private final String totalItemsCount = "//div[contains(@class, 'checkout-total__main-count')]";
    private final String TOTAL_SUM_TITLE = "//div[@class='cart_prices__total__Gtyvn']/span[1]";
}
