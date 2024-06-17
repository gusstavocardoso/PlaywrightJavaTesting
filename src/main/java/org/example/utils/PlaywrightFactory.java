package org.example.utils;

import com.microsoft.playwright.*;
import io.github.cdimascio.dotenv.Dotenv;

public class PlaywrightFactory {
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    static {
        Dotenv dotenv = Dotenv.load();
        System.setProperty("SAUCEDEMO_USERNAME", dotenv.get("SAUCEDEMO_USERNAME"));
        System.setProperty("SAUCEDEMO_PASSWORD", dotenv.get("SAUCEDEMO_PASSWORD"));
    }

    public static Page getPage() {
        if (playwright == null) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            context = browser.newContext();
            page = context.newPage();
        }
        return page;
    }

    public static void close() {
        if (playwright != null) {
            playwright.close();
        }
    }
}
