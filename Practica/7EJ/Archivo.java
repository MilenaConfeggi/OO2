package ej7;

public class Archivo extends Componente{
	public int tamanio;
		
	public Archivo(String nombre, int tamanio) {
		super(nombre);
		this.tamanio = tamanio;
	}

	public int tamanioTotalOcupado() {
		return this.getTamanio();
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	
	public int getTamanio() {
		return tamanio;
	}
	
	 public void listarContenido(StringBuilder l, String previo){
	        l.append(previo).append(this.getNombre()).append("/\n");
	    }
	
	
}
