package ej7;

import java.time.LocalDate;
import java.util.List;

public abstract class Componente {
	public String nombre;
	public LocalDate fecha;
	
	public Componente(String nombre) {
		this.nombre = nombre;
		this.fecha = LocalDate.now();
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public abstract int tamanioTotalOcupado();
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();
	
	public Componente buscar(String nombre) {
        if (this.nombre.equals(nombre)) {
            return this;
        }
        return null;
    }
	
	public void buscarTodos (List<Componente> l, String nombre) {
		if (this.getNombre().equals(nombre))
			l.add(this);
	}
	
	 public abstract void listarContenido(StringBuilder listado, String previo);
	
}
