package monopoly;

public class Impuesto extends Casilla{

	private int tasa;
	
	public Impuesto(String nombre, int tasa) {
		super(nombre);
		this.tasa = tasa;
	}

	public int getTasa() {
		return tasa;	
	}
}
