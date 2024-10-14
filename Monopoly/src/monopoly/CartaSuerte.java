package monopoly;

public class CartaSuerte {

	private String efecto;
	private TipoCartaSuerte tipo;
	private int modificadorDinero;
	
	public CartaSuerte(String efecto, TipoCartaSuerte tipo, int modificadorDinero) {
		this.efecto = efecto;
		this.tipo = tipo;
		this.modificadorDinero = modificadorDinero;
	}

	public String getEfecto() {
		return efecto;
	}

	public TipoCartaSuerte getTipo() {
		return tipo;
	}

	public int getModificadorDinero() {
		return modificadorDinero;
	}
}