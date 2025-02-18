package Steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import pages.interaciones.CarritoInteraction;
import pages.interaciones.CompraInteraction;
import pages.interaciones.InicioInteraction;
import pages.interaciones.ProductoInteraction;

import static org.openqa.selenium.devtools.v123.fedcm.FedCm.openUrl;


public class CompraDemoBlazeStep {

    CarritoInteraction carritoInteraction;
    ProductoInteraction productoInteraction;
    InicioInteraction inicioInteraction;

    CompraInteraction compraInteraction;

    public void accederCatalogo(){
        inicioInteraction.abrirCatalogo();
    }

    @Step
    public void seleccionarArticulo(String tipoArticulo, String referencia) throws InterruptedException {
        inicioInteraction.abrirPagina();
        inicioInteraction.seleccionarElementoGenerico(tipoArticulo, referencia);
        productoInteraction.anadirCarrito();

    }
    @Step
    public void generarCompra(){
        carritoInteraction.obtenerCarrito();
        carritoInteraction.comprar();
    }

    public void diligenciarFormularioCliente(){

        compraInteraction.diligenciarFormulario();
    }

    @Step
    public void validarCompra(){
        compraInteraction.validarMensaje();
    }


}
