package by.vek.ui.pages.cart;

public class CartLocators {

    public static final String TITLE_CART_IS_EMPTY = "//div[@data-testid='empty-basket-screen']//h2";
    public static final String CHECKBOX_SELECT_ALL = "//label[.//span[contains(@class,'Text-module__caption')]]//input[@type='checkbox']";
    public static final String TOTAL_PRICE_VALUE = "//div[@data-testid='total-price']";
    public static final String BUTTON_PLACE_ORDER = "//button[@data-testid='basketConfirmation']";
    public static final String TITLE_ITEM_NAME = "//div[contains(@class,'BasketItem_item__')]//a[contains(@class,'BasketItem_title')][1]";
}
