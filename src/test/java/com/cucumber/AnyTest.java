package com.cucumber;

import org.junit.jupiter.api.Test;

public class AnyTest {

    @Test
    public void testLogin() {
        PageStep po = new PageStep();
        po.openSite();
        po.clickLogin();
        po.fillEmail("test@test.com");
        po.clickSubmit();
    }
}
