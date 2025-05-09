package stepdefinitions;

import com.latam.drivers.DriverFactory;
import com.latam.pages.HomePage;
import com.latam.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class BusquedaVueloIda {
    HomePage homePage = new HomePage(DriverFactory.getPage());
    ResultPage resultPage = new ResultPage(DriverFactory.getPage());

    @Given("Que nos encontramos en la pagina principal de LATAM")
    public void que_nos_encontramos_en_la_pagina_principal_de_latam() {
        homePage.goToHomePage();
    }

    @When("Cuando seleccionamos un vuelo de ida")
    public void cuando_seleccionamos_un_vuelo_de_ida() {
        homePage.selecIda();
    }

    @When("Cuando seleccionamos un vuelo de ida y vuelta")
    public void cuando_seleccionamos_un_vuelo_de_ida_y_vuelta() {
        homePage.selecIdaVuelta();
    }

    @And("Ingresamos los campos requeridos para vuelo de ida")
    public void ingresamos_los_campos_requeridos_para_vuelo_de_ida() {
        homePage.ingresarOrigen("Bogotá");
        homePage.ingresarDestino("Madrid");
        homePage.ingresarFechaIda();
    }

    @And("Ingresamos los campos requeridos para vuelo de ida y vuelta")
    public void ingresamos_los_campos_requeridos_para_vuelo_de_ida_y_vuelta() {
        homePage.ingresarOrigen("Bogotá");
        homePage.ingresarDestino("Madrid");
        homePage.ingresarFechaIda();
        homePage.ingresarFechaVuelta();
    }

    @And("No ingresamos los campos requeridos")
    public void no_ingresamos_los_campos_requeridos() {
        homePage.selecIdaVuelta();
    }

    @And("Damos click en buscar vuelos")
    public void damos_click_en_buscar_vuelos() {
        homePage.clickBuscarVuelos();
    }


    @Then("El sistema nos debera mostrar los vuelos disponibles")
    public void el_sistema_nos_debera_mostrar_los_vuelos_disponibles() {
        assertTrue(resultPage.areFlightsDisplayed(), "Vuelos NO encontrados.");
    }

    @Then("El sistema nos debera alertar que faltan campos por diligenciar")
    public void el_sistema_nos_debera_alertar_que_faltan_campos_por_diligenciar() {
        assertTrue(resultPage.isErrorMessageDisplayed(), "No se mostró mensaje de error.");
    }
}
