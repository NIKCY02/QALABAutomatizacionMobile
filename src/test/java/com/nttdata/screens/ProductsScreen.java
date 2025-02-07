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
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement productBackpack;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement productBike;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement productBolt;
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
                break;
            case "Sauce Labs Bike Light":
                productBike.click();
                break;
            case "Sauce Labs Bolt-T-Shirt":
                productBolt.click();
                break;
            default:
                System.out.println("Producto no contemplado");
                throw new RuntimeException("El test se detuvo porque el producto no está contemplado");
        }
    }

    /*public void clickMenu(){
        menu.click();
    }

    public void clickCatalog(){
        catalog.click();
    }*/

}
