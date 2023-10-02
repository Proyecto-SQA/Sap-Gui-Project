package stepDefinitions;

import java.io.IOException;
import co.sqasa.kraken.sap.SapGui;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pages.OrdenDeCompraPages;
import questions.ValidarTexto;
import tasks.AbrirSap;
import tasks.BuscarModulo;
import tasks.IniciarSesion;
import tasks.RealizarOrden;

public class OrdenDeCompraStepDefinitions {

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que el usuario ha iniciado sesion en SAP ERP$")
	public void queElUsuarioHaIniciadoSesiNEnSAPERP() {
		OnStage.theActorCalled("SQA S.A.").attemptsTo(AbrirSap.enWindows(),
				IniciarSesion.enSap());
	}

	@When("^realiza la orden de compra para nuevos productos y materiales$")
	public void realizaLaOrdenDeCompraParaNuevosProductosYMateriales() {
		OnStage.theActorInTheSpotlight().attemptsTo(
				BuscarModulo.enSap(),
				RealizarOrden.enSap());
	}

	@Then("^la orden de compra se crea correctamente en SAP ERP$")
	public void laOrdenDeCompraSeCreaCorrectamenteEnSAPERP() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTexto.enPantalla(OrdenDeCompraPages.LBL_PEDIDO_CREADO,"Pedido estándar creado bajo el número")));
	}
	
	@After
	public void after() {
		SapGui.cerrarSapLogon();
	}
}





