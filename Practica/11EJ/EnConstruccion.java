package ej11;

public class EnConstruccion extends Etapa{

	public EnConstruccion() {

	}

	@Override
	public void aprobarEtapa(Proyecto proyec) {
		if (proyec.precio() != 0)
			proyec.setEtapa(new EnEvaluacion());
		else
			throw new RuntimeException("El precio es 0");

	}
	
	@Override
	public void modificarMargen(Proyecto proyec, int margen) {
		if (8 <= margen && margen<= 10)
			proyec.setMargen(margen);
	}
}
