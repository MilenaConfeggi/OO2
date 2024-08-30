package ej9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String punto;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Estado estado;
	private List<Usuario> usuarios;
	private List<Usuario> enEspera;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String punto, double costo,
			         int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.punto = punto;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado = new Provisoria();
		this.usuarios = new ArrayList<Usuario>();
		this.enEspera = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario user) {
			this.estado.agregarUsuario(this, user);
		
	}
	
	public String obtenerInformacion() {
		return ("nombre: " + this.nombre + "costo: " + this.costo + "fecha de inicio: " + this.fechaInicio
				+ "fecha de fin: " + this.fechaFin + "punto de encuentro: " + this.punto + this.estado.obtenerInfo(this));
	}
	
	public int cuposRestantes() {
		return this.cupoMaximo - this.usuarios.size();
	}
	
	public int cuposFaltantes() {
		return this.cupoMinimo - this.usuarios.size();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPunto() {
		return punto;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public Estado getEstado() {
		return estado;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	

	public List<Usuario> getEnEspera() {
		return enEspera;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
}
