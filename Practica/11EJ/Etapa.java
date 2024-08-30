package ej11;

public abstract class Etapa {

	public void aprobarEtapa(Proyecto proyec) {
		
	}
	public void modificarMargen(Proyecto proyec, int margen) {
		
	}
	public void cancelarProyecto(Proyecto proyec) {
		proyec.setObjetivo("cancelado");
		proyec.setEtapa(new Cancelada());
	}
}
