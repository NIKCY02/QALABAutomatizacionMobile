package com.nttdata.steps;

import com.nttdata.screens.AddProductsScreen;
import com.nttdata.screens.MyCartScreen;
import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;


public class CarritoStep {

    ProductsScreen productsScreen;
    AddProductsScreen addProductsScreen;
    MyCartScreen myCartScreen;

    public void validateTitleDisplayed(){

        Assert.assertTrue(productsScreen.titleVisible());
    }

    public void validateProductDisplayed(){

        Assert.assertTrue(productsScreen.productsVisible());
    }
    public void selectProductyCantidad(int cantidad, String producto){
        productsScreen.clickProduct(producto);
        int valorElemento = addProductsScreen.obtenerCantidad();
        if (valorElemento > cantidad) {
            int diferencia = valorElemento - cantidad;
            for (int i = 0; i<diferencia; i++){
                addProductsScreen.clickSelectorMenos();
            }
        } else if(valorElemento < cantidad){
            int dif = cantidad - valorElemento;
            for (int j = 0; j<dif; j++){
                addProductsScreen.clickSelectorMas();
            }
        }
        addProductsScreen.clickAddCart();
    }

    public void setValidacionCarrito(){
       myCartScreen.setValidacionCarrito();
       int numero = myCartScreen.ObtenerValorTextoTotal();
       int numeroElemento = addProductsScreen.obtenerCantidad();
       if (numeroElemento == numero){
           System.out.println("Los valores son iguales");
       }else {
           System.out.println("La cantidad no es la correcta");
       }
       myCartScreen.limpiar();
    }
}
