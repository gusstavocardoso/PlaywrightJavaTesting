package org.example.pages;

import com.microsoft.playwright.Page;

public class InventoryPage {
    private final Page page;

    public InventoryPage(Page page) {
        this.page = page;
    }

    public void addToCartByName(String itemName) {
        page.click("text=" + itemName);
        page.click("button:has-text('Add to cart')");
    }

    public void goToCart() {
        page.click(".shopping_cart_link");
    }

    public boolean isItemInCart(String itemName) {
        return page.isVisible(String.format("[data-test=inventory-item-name]:has-text('%s')", itemName));
    }
}
