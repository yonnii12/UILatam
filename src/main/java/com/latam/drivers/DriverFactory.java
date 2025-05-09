package com.latam.drivers;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;

public class DriverFactory {
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    public static void initBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); // headless=true para ocultarlo
        context = browser.newContext();
        page = context.newPage();
    }

    public static Page getPage() {
        return page;
    }

    public static void closeBrowser() {
        if (playwright != null) {
            playwright.close();
        }
    }

}
