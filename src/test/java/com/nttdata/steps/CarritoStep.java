package com.nttdata.steps;

import com.nttdata.screens.AddProductsScreen;
import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;


public class CarritoStep {

    ProductsScreen productsScreen;
    AddProductsScreen addProductsScreen;

    public void validateTitleDisplayed(){

        Assert.assertTrue(productsScreen.titleVisible());
    }

    public void validateProductDisplayed(){

        Assert.assertTrue(productsScreen.productsVisible());
    }
    public void selectProductyCantidad(int cantidad, String producto){
        productsScreen.clickProduct();
        for (int i = 1; i < cantidad; i++) {
            addProductsScreen.clickSelectorMas();
        }
        addProductsScreen.clickAddCart();
    }

    public void setValidacionCarrito(){
       // addProductsScreen.
    }
}
