package ej6;

public class Pantano extends Topografia{

	@Override
	public double proporcionTierra() {
		return 0.3;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.compararContraSimple(this.proporcionAgua());
	}

	public boolean compararContraMixta(Mixta topografia) {
		return false;
	}
	
}
