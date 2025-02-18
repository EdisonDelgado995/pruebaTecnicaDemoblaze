package pages.interaciones;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.fluentlenium.core.annotation.Page;
import pages.mapeos.ProductoPage;

public class ProductoInteraction extends PageObject {

    @Page
    ProductoPage productoPage;


    public void anadirCarrito() throws InterruptedException {
        productoPage.getBtnAnadircarrito().waitUntilClickable().click();
        Thread.sleep(2000);
        getDriver().switchTo().alert().accept();
        productoPage.getBtnInicio().waitUntilClickable().click();
    }

}
