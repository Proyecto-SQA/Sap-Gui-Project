package tasks;

import co.sqasa.kraken.sap.SapGui;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import pages.OrdenDeCompraPages;

public class IniciarSesion implements Task{

	public static IniciarSesion enSap() {
		return Instrumented.instanceOf(IniciarSesion.class).withProperties();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_MANDANTE, "800");
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_USUARIO, "usuario38");
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_CONTRASENA, "986689");
		SapGui.esperarSegundos(5);		
	}
}