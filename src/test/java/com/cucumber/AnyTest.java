package com.cucumber;

import org.junit.jupiter.api.Test;

public class AnyTest {

    @Test
    public void testLogin() {
        PageObject po = new PageObject();
        po.openSite();
        po.clickLogin();
        po.fillEmail();
        po.clickSubmit();
    }
}
