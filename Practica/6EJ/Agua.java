package ej6;

public class Agua extends Topografia{

	@Override
	public double proporcionTierra() {
		return 0;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.compararContraSimple(this.proporcionAgua());
	}

	public boolean compararContraMixta(Mixta topografia) {
		return false;
	}
	
	
	
}
