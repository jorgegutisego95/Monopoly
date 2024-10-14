package monopoly;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private int dinero;
	private ArrayList<Vivienda> viviendasEnPropiedad;	
	
	public Jugador(String nombre, int dinero) {
		this.nombre = nombre;
		this.dinero = dinero;		
		this.viviendasEnPropiedad = new ArrayList<Vivienda>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getDinero() {
		return this.dinero;
	}

	public ArrayList<Vivienda> getViviendasEnPropiedad() {
		return this.viviendasEnPropiedad;
	}
	
	public void aniadeVivienda(Vivienda vivienda) {
		viviendasEnPropiedad.add(vivienda);
	}
}