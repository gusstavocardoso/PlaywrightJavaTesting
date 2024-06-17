package org.example.pages;

import com.microsoft.playwright.Page;

public class CheckoutPage {
    private final Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    public void fillCheckoutInformation(String firstName, String lastName, String postalCode) {
        page.fill("#first-name", firstName);
        page.fill("#last-name", lastName);
        page.fill("#postal-code", postalCode);
        page.click("input:has-text('Continue')");
    }
}
