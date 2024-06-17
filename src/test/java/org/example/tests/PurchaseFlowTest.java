package org.example.tests;

import org.example.pages.*;
import org.example.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;

public class PurchaseFlowTest extends TestBase {
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private OverviewPage overviewPage;

    @BeforeClass
    public void setupPages() {
        loginPage = new LoginPage(page);
        inventoryPage = new InventoryPage(page);
        cartPage = new CartPage(page);
        checkoutPage = new CheckoutPage(page);
        overviewPage = new OverviewPage(page);
    }

    @Test
    public void testPurchaseFlow() {
        loginPage.navigate();
        loginPage.login(System.getProperty("SAUCEDEMO_USERNAME"), System.getProperty("SAUCEDEMO_PASSWORD"));
        Assert.assertFalse(loginPage.isLoginErrorVisible(), "Login failed!");

        inventoryPage.addToCartByName("Sauce Labs Backpack");
        Assert.assertTrue(inventoryPage.isItemInCart("Sauce Labs Backpack"), "Sauce Labs Backpack");

        inventoryPage.goToCart();
        cartPage.checkout();
        checkoutPage.fillCheckoutInformation("John", "Doe", "12345");
        overviewPage.finishCheckout();

        Assert.assertTrue(page.isVisible("text=Thank you for your order!"), "Checkout: Complete!");
    }
}
