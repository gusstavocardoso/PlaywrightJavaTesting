package org.example.pages;

import com.microsoft.playwright.Page;

public class OverviewPage {
    private final Page page;

    public OverviewPage(Page page) {
        this.page = page;
    }

    public void finishCheckout() {
        page.click("button:has-text('Finish')");
    }
}
