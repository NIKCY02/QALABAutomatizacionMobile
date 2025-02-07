package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class AddProductsScreen extends PageObject {
    @AndroidFindBy(accessibility = "Decrease item quantity")
    private WebElement selectormenos;
    @AndroidFindBy(accessibility = "Increase item quantity")
    private WebElement selectormas;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement Cantidad;
    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement AddCart;

    public void clickSelectorMenos(){
        selectormenos.click();
    }
    public void clickSelectorMas(){
        selectormas.click();
    }
    public void obtenerCantidad(){
        Cantidad.getText();
    }
    public void clickAddCart(){
        AddCart.click();
    }
}
