package ar.edu.unlp.info.oo2.proyecto_ejemplo;
import java.util.ArrayList;
import java.util.List;
public class Twitter {
	public List<Usuario> usuarios;

	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario registrarUsuario(String screenName) {
		if (!existeUsuario(screenName)) {
			Usuario user = new Usuario(screenName);
			this.usuarios.add(null);
			return user;
		}
		else return null;
	}
	
	private boolean existeUsuario(String screenName) {
		return this.usuarios.stream().anyMatch(nom -> nom.getScreenName().equals(screenName));
	}
	
	public void eliminarUsuario(Usuario user) {
		user.eliminarTweets();
		this.usuarios.remove(user);
	}
}
