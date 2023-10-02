package questions;

import co.sqasa.kraken.sap.SapGui;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTexto implements Question<Boolean>{
	
	private String elemento, texto;
	

	public ValidarTexto(String elemento, String texto) {
		this.elemento = elemento;
		this.texto = texto;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		if(SapGui.obtenerTextoDeElemento(elemento).contains(texto)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static ValidarTexto enPantalla(String elemento, String texto) {
		return new ValidarTexto(elemento, texto);
	}
}


