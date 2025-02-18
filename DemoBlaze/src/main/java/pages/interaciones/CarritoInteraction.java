package pages.interaciones;

import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import pages.mapeos.CarritoPage;
import pages.mapeos.InicioPage;

public class CarritoInteraction extends PageObject {

    @Page
    CarritoPage carritoPage;

    @Page
    InicioPage inicioPage;

    public void obtenerCarrito(){
        inicioPage.getBtnCarrito().waitUntilClickable().click();
    }

    public void comprar(){
        carritoPage.getBtnComprar().waitUntilClickable().click();
    }
}
