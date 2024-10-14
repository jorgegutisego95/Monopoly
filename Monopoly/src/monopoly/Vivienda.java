package monopoly;

public class Vivienda extends Casilla {
	private int valor;
	private int tasa;
	private Reforma mejora;
	private Color color;
	private boolean disponible;
	
	public Vivienda(String nombre, int valor, Color color) {
		super(nombre);
		this.valor = valor;
		this.tasa = valor/4; //Un cuarto del valor
		this.color = color; //
		this.mejora = Reforma.Piso;
		this.disponible = false;
	}

	public int getValor() {
		return this.valor;
	}

	public Reforma getMejora() {
		return this.mejora;
	}

	public Color getColor() {
		return this.color;
	}	
	
	public void mejorar() {
		if (this.mejora == Reforma.Piso) {
			this.mejora = Reforma.Casa;
		}
		else if (this.mejora == Reforma.Casa) {
			this.mejora = Reforma.Rascacielos;			
		}
	}

	public int getTasa() {
		return this.valor;
	}

	public boolean isDisponible() {
		return this.disponible;
	}	
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}	
}