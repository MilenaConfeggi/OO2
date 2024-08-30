package ej11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int nro_integrantes;
	private double monto_dia;
	private int margen;
	private Etapa etapa;
	
	
	public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int nro_integrantes, double monto_dia) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.nro_integrantes = nro_integrantes;
		this.monto_dia = monto_dia;
		this.margen = 7;
		this.etapa = new EnConstruccion();
	}
	
	//pasa de la etapa actual a la siguiente
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa(this);
	}
	
	//Retorna la suma de los costos de las personas involucradas, las personas trabajan todos los días que dura el proyecto.
	public double costo() {
		return (ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin)) * this.monto_dia;
	}
	
	//Retorna el valor obtenido luego de aplicar el margen de ganancia al costo del proyecto
	public double precio() {
		return this.costo() + this.costo() * this.margen;
	}
	
	//Actualiza el margen de ganancia
	public void modificarMargen(int margen) {
		this.etapa.modificarMargen(this, margen);
	}
	
	//cancela proyecto
	public void cancelarProyecto() {
		this.etapa.cancelarProyecto(this);;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public int getMargen() {
		return margen;
	}

	public void setMargen(int margen) {
		this.margen = margen;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	
	
}
