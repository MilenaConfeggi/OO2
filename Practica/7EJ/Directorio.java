package ej7;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{
	public List<Componente> files;
	
	public Directorio(String nombre) {
		super(nombre);
		this.files = new ArrayList<Componente>();
	}


	public int tamanioTotalOcupado() {
		return this.files.stream().mapToInt(f -> f.tamanioTotalOcupado()).sum();
	}
	
	public Archivo archivoMasGrande() {
		return (Archivo)this.files.stream().max((f1, f2) -> Integer.compare(f1.archivoMasGrande().getTamanio(), f2.archivoMasGrande().getTamanio())).orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return this.files.stream().map(c -> c.archivoMasNuevo())
                .max((a1, a2) -> a1.getFecha().compareTo(a2.getFecha())).orElse(null);
	}
	
	@Override
	public Componente buscar(String nombre) {
		if (this.nombre.equals(nombre))
			return this;
		else
			return this.files.stream().filter(f -> (f.buscar(nombre) != null)).findFirst().orElse(null);
	}
	
	@Override
    public void buscarTodos(List<Componente> lista, String nombre) {
        super.buscarTodos(lista, nombre);
        this.files.stream().forEach(c -> c.buscarTodos(lista, nombre));
    }
	
	 public void listarContenido(StringBuilder l, String previo) {
	        String nuevoPrevio = previo + this.getNombre() + "/";
	        l.append(nuevoPrevio).append("\n");
	        this.files.stream().forEach(c -> c.listarContenido(l, nuevoPrevio));
	    }
}
