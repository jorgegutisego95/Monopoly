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
		tableroCasillas[5] = new Impuesto("Ferrocarril", 50);
	}
	
	public boolean HayDisponiblesParaUnColor(Color color) {		
		boolean hayDisponibles = false;
		
		for (int i = 0; i < tableroCasillas.length || !hayDisponibles; i++) {
			if (tableroCasillas[i] instanceof Vivienda) {
				Vivienda vivienda = (Vivienda) tableroCasillas[i];
				if (vivienda.getColor() == color && vivienda.isDisponible()){
					hayDisponibles = true;
				}
				else {
					System.out.println("La casilla numero:" + i + " no es del color " + color.toString() + "o no está disponible.");					
				}
			}
			else {
				System.out.println("La casilla numero:" + i + " no es una vivienda");
			}
		}
		
		return hayDisponibles;
	}
}
