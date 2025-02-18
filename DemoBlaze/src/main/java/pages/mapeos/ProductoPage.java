package pages.mapeos;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class ProductoPage extends PageObject {

    @FindBy(xpath= "//a[contains(.,'Add to cart')]")
    private WebElementFacade btnAnadircarrito;


    @FindBy(xpath= "//a[@class='nav-link'][contains(.,'Home (current)')]")
    private WebElementFacade btnInicio;
}
