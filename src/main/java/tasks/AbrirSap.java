package tasks;

import co.sqasa.kraken.sap.SapGui;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class AbrirSap implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		SapGui.inicializarVaribalesGlobalesDeSap();
		SapGui.abrirSapLogon();		
	}

	public static AbrirSap enWindows() {
		return Instrumented.instanceOf(AbrirSap.class).withProperties();
	}
}
