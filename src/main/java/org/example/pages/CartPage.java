package org.example.pages;

import com.microsoft.playwright.Page;

public class CartPage {
    private final Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public void checkout() {
        page.click("button:has-text('Checkout')");
    }
}
