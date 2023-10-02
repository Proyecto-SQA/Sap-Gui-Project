package tasks;

import co.sqasa.kraken.robot.RobotSQA;
import co.sqasa.kraken.sap.SapGui;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import pages.OrdenDeCompraPages;

public class BuscarModulo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_MODULO, "ME21N");
		RobotSQA.enter();
		SapGui.esperarSegundos(8);
	}

	public static BuscarModulo enSap() {
		return Instrumented.instanceOf(BuscarModulo.class).withProperties();
	}
}