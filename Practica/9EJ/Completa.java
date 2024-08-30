package ej9;

public class Completa extends Estado{

	public void agregarUsuario(Excursion exc, Usuario user) {
		exc.getEnEspera().add(user);
	}
	
	public String obtenerInfo(Excursion exc) {
		return "";
	}
}
