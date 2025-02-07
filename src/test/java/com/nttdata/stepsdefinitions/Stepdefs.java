package com.nttdata.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import com.nttdata.steps.CarritoStep;


public class Stepdefs {
    @Steps
    CarritoStep carritoStep;

    @Given("estoy en la aplicación Sauce Labs")
    public void estoyEnLaAplicaciónSauceLabs() {
        carritoStep.validateTitleDisplayed();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        carritoStep.validateProductDisplayed();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidad,String producto) {
        carritoStep.selectProductyCantidad(unidad,producto);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
       // carritoStep;
    }
}
