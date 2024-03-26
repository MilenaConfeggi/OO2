package ar.edu.unlp.info.oo2.ej4;

public class Pasante extends Empleado{
	private int examenes;

	public Pasante(int examenes) {
		super();
		this.examenes = examenes;
	}
	
	public double basico() {
		return 20000;
	}
	
	public double adicional() {
		return this.examenes * 2000;
	}
}
