package com.latam.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private Page page;

    // Locators corregidos
    private String btnSoloIda = "[data-testid='fsb-one-way']";
    private String btnIdaVuelta = "[data-testid='fsb-round-trip']";

    private String btnBogota = "text=Bogotá, BOG - Colombia";
    private String btnMadrid = "text=Madrid, MAD - España";

    private String btnDesde = "[data-testid='fsb-origin--text-field']";
    private String btnHacia = "[data-testid='fsb-destination--text-field']";

    private String btn29Mayo = "[data-testid='date-2025-05-29']";
    private String btn31Mayo = "[data-testid='date-2025-05-31']";

    private String cdrFechaIda = "[data-testid='fsb-departure--text-field']";
    private String cdrFechaVuelta = "[data-testid='fsb-return--text-field']";

    private String btnBuscarVuelos = "[data-testid='fsb-search-flights--button']";


    public HomePage(Page page) {
        this.page = page;
    }

    // Métodos
    public void goToHomePage() {
        page.navigate("https://www.latamairlines.com/co/es");
    }

    public void selecIda() {
        page.click(btnSoloIda);
    }

    public void selecIdaVuelta() {
        page.click(btnIdaVuelta);
    }

    public void ingresarOrigen(String origen) {
        page.fill(btnDesde, origen);
        page.click(btnBogota);
    }

    public void ingresarDestino(String destino) {
        page.fill(btnHacia, destino);
        page.click(btnMadrid);
    }

    public void ingresarFechaIda() {
        page.click(cdrFechaIda);
        page.click(btn29Mayo);
    }

    public void ingresarFechaVuelta() {
        page.click(cdrFechaVuelta);
        page.click(btn31Mayo);
    }

    public void clickBuscarVuelos() {
        page.click(btnBuscarVuelos);
    }
}
