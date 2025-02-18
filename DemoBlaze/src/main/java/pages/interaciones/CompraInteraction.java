package pages.interaciones;

import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import pages.mapeos.CarritoPage;
import pages.mapeos.CompraPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CompraInteraction extends PageObject {

    @Page
    CompraPage compraPage;

    public void diligenciarFormulario(){
        compraPage.getTxtNombre().waitUntilVisible().type("Edison");
        compraPage.getTxtPais().waitUntilVisible().type("Colombia");
        compraPage.getTxtCiudad().waitUntilVisible().type("Medellín");
        compraPage.getTxtAnio().waitUntilVisible().type("2025");
        compraPage.getTxtMes().waitUntilVisible().type("02");
        compraPage.getTxtTarjeta().waitUntilVisible().type("55889944");
        compraPage.getTxtNombre().waitUntilVisible().type("Edison");
        compraPage.getTxtNombre().waitUntilVisible().type("Edison");
        compraPage.getBtnConfirmar().waitUntilClickable().click();

    }

    public void validarMensaje(){
        String mensaje = compraPage.obtenerConfirmacion();
        assertThat(mensaje, equalTo("Thank you for your purchase!"));
    }

}
