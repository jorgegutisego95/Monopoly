package monopoly;

public class Tablero {

	private Casilla[] tableroCasillas;
	
	public Tablero() {
		tableroCasillas = new Casilla[39];
		tableroCasillas[0] = new Casilla("Salida");
		tableroCasillas[1] = new Vivienda("Avenida Mediterraneo", 80, Color.Verde );
		tableroCasillas[2] = new Casilla("Arca Comunal");
		tableroCasillas[3] = new Vivienda("Avenida Baltica", 80, Color.Verde);
		tableroCasillas[4] = new Impuesto("Impuesto sobre ingresos", 50);
	}
	
}
