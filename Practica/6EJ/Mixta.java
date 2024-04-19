package ej6;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> topografias;
	
	

	public Mixta() {
		this.topografias = new ArrayList<Topografia>();
	}

	@Override
	public double proporcionTierra() {
		return this.topografias.stream().mapToDouble(t -> t.proporcionTierra()).sum();
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.compararContraMixta(this);
	}

	@Override
	public boolean compararContraMixta(Mixta topografia) {
		 return this.topografias.equals(topografia.getTopografias());
	}

	public List<Topografia> getTopografias() {
		return topografias;
	}

	
}
