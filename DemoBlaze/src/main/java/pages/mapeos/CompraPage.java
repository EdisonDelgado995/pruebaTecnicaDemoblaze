package pages.mapeos;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Getter
public class CompraPage extends PageObject {

    @FindBy(id= "name")
    private WebElementFacade txtNombre;

    @FindBy(id= "country")
    private WebElementFacade txtPais;

    @FindBy(id= "city")
    private WebElementFacade txtCiudad;

    @FindBy(id= "card")
    private WebElementFacade txtTarjeta;

    @FindBy(id= "month")
    private WebElementFacade txtMes;

    @FindBy(id= "year")
    private WebElementFacade txtAnio;

    @FindBy(xpath= "//button[contains(@onclick,'purchaseOrder()')]")
    private WebElementFacade btnConfirmar;

    @FindBy(xpath= "//h2[contains(.,'Thank you for your purchase!')]")
    private WebElementFacade txtMensajeConfirmacion;

    @FindBy(xpath= "//p[contains(@class,'lead text-muted ')]")
    private WebElementFacade txtMonto;



    public String obtenerConfirmacion(){
        return txtMensajeConfirmacion.getText();
    }

}
