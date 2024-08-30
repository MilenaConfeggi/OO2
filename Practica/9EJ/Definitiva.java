package ej9;

import java.util.List;

public class Definitiva extends Estado{

	
	public void agregarUsuario(Excursion exc, Usuario user) {
		exc.getUsuarios().add(user);
		if (exc.getUsuarios().size() == exc.getCupoMaximo()) {
			exc.setEstado(new Completa());
		}
	}
	
	public String obtenerInfo(Excursion exc) {
		return ("mails de los usuarios: " + this.todosLosUsuarios(exc.getUsuarios()) + "usuarios faltantes: " + exc.cuposRestantes());
	}
	
	private String todosLosUsuarios(List<Usuario> usuarios) {
		String listado = "";
		usuarios.stream().forEach(u -> listado.concat(u.getMail()));
		return listado;
	}
}
