package ej9;

public class Provisoria extends Estado{

	public void agregarUsuario(Excursion exc, Usuario user) {
		exc.getUsuarios().add(user);
		if (exc.getUsuarios().size() == exc.getCupoMinimo()) {
			exc.setEstado(new Definitiva());
		}
	}
	
	public String obtenerInfo(Excursion exc) {
		return ("usuarios faltantes: " + exc.cuposFaltantes());
	}
}
