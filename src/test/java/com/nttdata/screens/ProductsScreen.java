package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsScreen extends PageObject {
    @AndroidFindBy(accessibility = "App logo and name")
    private WebElement title;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement products;
    @AndroidFindBy(accessibility = "Sauce Labs Backpack")
    private WebElement productBackpack;
    @AndroidFindBy(accessibility = "Sauce Labs Bike Light")
    private WebElement productBike;
    @AndroidFindBy(accessibility = "Sauce Labs Bolt T-Shirt")
    private WebElement productBolt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement validacionCarrito;
    @AndroidFindBy (accessibility = "View menu")
    private WebElement menu;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Catalog\"]")
    private WebElement catalog;

    public boolean titleVisible(){
        return title.isDisplayed();
    }
    public boolean productsVisible(){
        waitFor(ExpectedConditions.visibilityOf(products));
        return products.isDisplayed();
    }

    public void clickProduct(String producto){
        switch (producto){
            case "Sauce Labs Backpack":
                productBackpack.click();

        }
        /*if(productBackpack.isSelected()){
            System.out.println("Selecciono el producto Sauce Labs Backpack");
        } else if(productBike.isSelected()){
            System.out.println("Selecciono producto Bike");
        } else if(productBolt.isSelected()){
            System.out.println("Selecciono producto Bolt");
        } else {
            menu.click();
            catalog.click();
            System.out.println("Seleccione otro producto");
        }*/
    }

    public boolean setValidacionCarrito() {
        waitFor(ExpectedConditions.visibilityOf(validacionCarrito));
        return validacionCarrito.isDisplayed();
    }

    /*public void clickMenu(){
        menu.click();
    }

    public void clickCatalog(){
        catalog.click();
    }*/

}
