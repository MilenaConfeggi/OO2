package ej6;

public abstract class Topografia {
	
	public double proporcionAgua() {
		return 1 - this.proporcionTierra();
	}
	
	public abstract double proporcionTierra();
	
	public abstract boolean esIgual(Topografia topografia);
	
	public boolean compararContraSimple(double proporcion) {
		return this.proporcionAgua() == proporcion;
	}
	public abstract boolean compararContraMixta(Mixta topografia);
	
	@Override
	public boolean equals(Object obj) {
		return this.esIgual((Topografia)obj);
	}
}
