package pages.mapeos;

import lombok.Getter;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.demoblaze.com/")

@Getter
public class InicioPage extends PageObject {

    public void generarXpathDinamico(String nombreObjeto){
        String nombreObjeto1 = nombreObjeto;
        String xpathDinamico = String.format("//a[contains(text(), '%s')]",
        nombreObjeto);
        WebElementFacade xpathElemento = findBy(xpathDinamico);
        xpathElemento.click();
    }

    @FindBy(xpath= "//a[@class='nav-link'][contains(.,'Cart')]")
    private WebElementFacade btnCarrito;


}

