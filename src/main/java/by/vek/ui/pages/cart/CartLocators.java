package by.vek.ui.pages.cart;

public class CartLocators {

    public static final String TITLE_CART_IS_EMPTY = "//div[@data-testid='empty-basket-screen']//h2";
    public static final String CHECKBOX_SELECT_ALL = "//label[.//span[contains(@class,'Text-module__caption')]]//input[@type='checkbox']";
    public static final String TOTAL_PRICE_VALUE = "//div[@data-testid='total-price']";
    public static final String BUTTON_PLACE_ORDER = "//button[@data-testid='basketConfirmation']";
    public static final String TITLE_ITEM_NAME = "//div[contains(@class,'BasketItem_item__')]//a[contains(@class,'BasketItem_title')][1]";
    public static final String TITLE_CART = "//button[@data-testid='basket-tab']//span[@class='Tabs-module__tabTitleWrapper']";
    public static final String TEXT_EMPTY_BASKET = "//p[@class='EmptyBasket_emptyText__6mjgy Text-module__text Text-module__caption']";
    public static final String CART_URL = "https://www.21vek.by/order/";
}
