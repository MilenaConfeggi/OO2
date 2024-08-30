package ej11;

public class EnEvaluacion extends Etapa{

	public EnEvaluacion() {
		
	}
	@Override
	public void aprobarEtapa(Proyecto proyec) {
		proyec.setEtapa(new Confirmado());
	}
	
	@Override
	public void modificarMargen(Proyecto proyec, int margen) {
		if (11 <= margen && margen<= 15)
			proyec.setMargen(margen);
	}
}
