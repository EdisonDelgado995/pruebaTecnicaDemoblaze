package definitions;

import Steps.CompraDemoBlazeStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.webdriver.WebdriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class compraDemoBlazeDefinition {

    @Steps
    CompraDemoBlazeStep compraDemoBlazeStep;

    @Dado("que se tiene el catalogo de Demoblaze")
    public void iniciarCatalogo() {
       compraDemoBlazeStep.accederCatalogo();

    }
    @Cuando("se agrega el producto de tipo {string} de referencia {string}")
    public void agregarProducto(String tipo, String referencia) throws InterruptedException {
        compraDemoBlazeStep.seleccionarArticulo(tipo, referencia);

    }
    @Cuando("se confirma la compra de los productos")
    public void confirmarCompra() {
        compraDemoBlazeStep.generarCompra();
        compraDemoBlazeStep.diligenciarFormularioCliente();
    }
    @Entonces("se recibe confirmacion de la compra")
    public void validarCompra() {
        compraDemoBlazeStep.validarCompra();

    }



}

