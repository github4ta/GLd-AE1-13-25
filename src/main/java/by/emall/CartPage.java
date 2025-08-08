package by.emall;

public class CartPage {
    private static final String CHECKBOX_SELECT_ALL =
            "//span[@class='checkbox_checkbox__pseudo__Km_pz checkbox_checkbox__pseudo_checked__CNCMz']" +
                    "/following-sibling::span[contains(text(), 'Выбрать всё')]";
    private static final String CHECKBOX_LABEL_SELECT_ALL =
            "//input[@type='checkbox']/following-sibling::span[contains(text(), 'Выбрать всё')]";
}
