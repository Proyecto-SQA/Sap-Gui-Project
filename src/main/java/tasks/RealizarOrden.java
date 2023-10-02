package tasks;

import java.util.ArrayList;
import java.util.Map;
import co.sqasa.kraken.robot.RobotSQA;
import co.sqasa.kraken.sap.SapGui;
import co.sqasa.kraken.sap.UtilSap;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import pages.OrdenDeCompraPages;

public class RealizarOrden implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {		
		ArrayList<Map<String, String>> datosExcelSap = null;
		try {
			datosExcelSap = UtilSap.leerDatosDeHojaDeExcel("D:\\Sap Project\\src\\test\\resources\\data\\DataSap.xlsx", "SapData1");
		} catch (Exception e) {
			
		}
		SapGui.esperarSegundos(3);
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CABEZERA);
		SapGui.esperarSegundos(3);
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_ORDEN_COMPRA, datosExcelSap.get(0).get("Orden Compra"));
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CONTINUAR);
		SapGui.esperarSegundos(3);
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_ORGANIZACION_COMPRA, datosExcelSap.get(0).get("Organización Compra"));
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CONTINUAR);
		SapGui.esperarSegundos(3);
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_SOCIEDAD, datosExcelSap.get(0).get("Sociedad"));
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CONTINUAR);
		SapGui.esperarSegundos(3);
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_PROVEEDOR, datosExcelSap.get(0).get("Proveedor"));
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CONTINUAR);
		SapGui.esperarSegundos(3);
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_MATERIAL, datosExcelSap.get(0).get("Material"));
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CONTINUAR);
		SapGui.esperarSegundos(3);
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CERRAR_DETALLE);
		SapGui.esperarSegundos(3);
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_CENTRO_COSTO, datosExcelSap.get(0).get("Centro de Costo"));
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CONTINUAR);
		SapGui.esperarSegundos(3);
		SapGui.escribirEnCampo(OrdenDeCompraPages.TXT_CANTIDAD, datosExcelSap.get(0).get("Cantidad"));
		SapGui.clickElemento(OrdenDeCompraPages.BTN_CONTINUAR);
		SapGui.esperarSegundos(3);
		SapGui.clickElemento(OrdenDeCompraPages.BTN_ABRIR_DETALLE);;
		SapGui.clickElemento(OrdenDeCompraPages.BTN_GUARDAR);
		SapGui.esperarSegundos(2);
	}
	
	public static RealizarOrden enSap() {
		return Instrumented.instanceOf(RealizarOrden.class).withProperties();
	}
}