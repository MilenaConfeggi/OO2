package ar.edu.unlp.info.oo2.ej4;

public class Planta {
	private int aniosAntiguedad;
	private boolean casado;
	private int hijos;
	
	
	public Planta(int aniosAntiguedad, boolean casado, int hijos) {
		super();
		this.aniosAntiguedad = aniosAntiguedad;
		this.casado = casado;
		this.hijos = hijos;
	}
	
	public double basico() {
		return 50000;
	}
	
	public double adicional() {
		double ad = this.hijos * 2000 + this.aniosAntiguedad * 2000;
		if (casado)
			ad+= 5000;
		return ad;
	}
}
