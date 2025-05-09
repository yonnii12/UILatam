package com.latam.pages;

import com.latam.drivers.DriverFactory;
import com.microsoft.playwright.Page;

public class ResultPage {

    private Page page;

    public ResultPage(Page page) {
        this.page = page;
    }

    public boolean areFlightsDisplayed() {
//[data-testid='date-carousel-wrapper']
//        [data-testid='searchbox-layout-vertical']
        page.waitForSelector("[data-testid='searchbox-layout-vertical']", new Page.WaitForSelectorOptions().setTimeout(10000));
        return page.isVisible("[data-testid='searchbox-layout-vertical']");
    }

    public boolean isErrorMessageDisplayed() {
        return page.isVisible("[data-testid='fsb-origin--text-field__helper-text']");
    }
}