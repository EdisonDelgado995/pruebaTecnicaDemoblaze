package pages.mapeos;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class CarritoPage extends PageObject {

    @FindBy(xpath= "//button[contains(.,'Place Order')]")
    private WebElementFacade btnComprar;

}
