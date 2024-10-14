package monopoly;

public class Vivienda extends Casilla {
	private int valor;
	private Reforma mejora;
	private Color color;
	
	public Vivienda(String nombre, int valor, Color color) {
		super(nombre);
		this.mejora = Reforma.Piso;
		this.valor = valor;
		this.color = color;
	}

	public int getValor() {
		return valor;
	}

	public Reforma getMejora() {
		return mejora;
	}

	public Color getColor() {
		return color;
	}	
	
	public void Mejorar() {
		if (this.mejora == Reforma.Piso) {
			this.mejora = Reforma.Casa;
			this.mejora= Reforma.Rascacielos;
		}
	}
}