package ej7;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
	private List<Componente> componentes;

	public int tamanioTotalOcupado(){
		return this.componentes.stream().mapToInt(c -> c.tamanioTotalOcupado()).sum();
	}
	public Archivo archivoMasGrande() {
		 return componentes.stream().map(c -> c.archivoMasGrande())
	                .max((a1, a2) -> Double.compare(a1.tamanioTotalOcupado(), a2.tamanioTotalOcupado())).orElse(null);
	}
	public Archivo archivoMasNuevo() {
		 return this.componentes.stream().map(c -> c.archivoMasNuevo())
	                .max((a1, a2) -> a1.getFecha().compareTo(a2.getFecha())).orElse(null);
	}
	public Componente buscar(String nombre) {
		return componentes.stream().filter(c -> c.buscar(nombre) != null).findFirst().orElse(null);
	}
	
	public List<Componente> buscarTodos(String nombre){
		List<Componente> f = new ArrayList<Componente>();
		componentes.stream().forEach(c -> c.buscarTodos(f, nombre));
		return f;
	
	}
	
	 public String listadoDeContenido() {
	        StringBuilder l = new StringBuilder();
	        String previo = "/";
	        this.componentes.stream().forEach(c -> c.listarContenido(l, previo));
	        return l.toString();
	    }
}
