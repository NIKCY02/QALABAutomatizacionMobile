package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class MyCartScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement validacionCarrito;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemsTV\"]")
    private WebElement validacionTotal;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Removes product from cart\"]")
    private WebElement limpiar;

    public void setValidacionCarrito() {
        validacionCarrito.click();
    }
    public int ObtenerValorTextoTotal(){
        return Integer.parseInt(validacionTotal.getText().split(" ")[0]);
    }
    public void limpiar(){
        limpiar.click();
    }
}
