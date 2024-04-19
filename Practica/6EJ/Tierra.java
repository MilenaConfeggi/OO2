package ej6;

public class Tierra extends Topografia{

	@Override
	public double proporcionTierra() {
		return 1;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.compararContraSimple(this.proporcionAgua());
	}
	
	public boolean compararContraMixta(Mixta topografia) {
		return false;
	}
	
}
