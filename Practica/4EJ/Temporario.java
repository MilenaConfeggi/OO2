package ar.edu.unlp.info.oo2.ej4;

public class Temporario extends Empleado{
	private int horas;
	private boolean casado;
	private int hijos;
	
	
	public Temporario(int horas, boolean casado, int hijos) {
		super();
		this.horas = horas;
		this.casado = casado;
		this.hijos = hijos;
	}

	public double basico() {
		return 20.000 * horas;
	}
	
	public double adicional() {
		double ad = this.hijos * 2000;
		if(casado)
			ad+= 5000;
		return ad;
			
	}
}
