package pages.interaciones;


import lombok.Getter;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.actions.Open;
import org.fluentlenium.core.annotation.Page;
import pages.mapeos.InicioPage;

public class InicioInteraction extends PageObject {
    @Getter

    @Page
    InicioPage inicioPage;

    public void abrirCatalogo(){

        inicioPage.openUrl(updateUrlWithBaseUrlIfDefined("https://www.demoblaze.com/"));
    }

    @Step
    public void seleccionarElementoGenerico(String tipo, String referencia){

        inicioPage.generarXpathDinamico(tipo);
        inicioPage.generarXpathDinamico(referencia);
    }

    public void abrirPagina(){
        Open.url("https://www.demoblaze.com/");
    }


}
