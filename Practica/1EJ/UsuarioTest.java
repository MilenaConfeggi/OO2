package ar.edu.unlp.info.oo2.proyecto_ejemplo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unlp.info.oo2.proyecto_ejemplo.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioTest {
	private Usuario milena;
	private Usuario martina;
	
	@BeforeEach
	public void setup() {
		this.milena = new Usuario("milenaria");
		this.martina = new Usuario("martuu");
	}
	
	@Test
	public void TestRealizarTweet() {
		assertEquals(this.milena.realizarTweet("basta de lluvia loco"), true);
		assertEquals(this.martina.realizarTweet("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"), false);
	}
	
	@Test
	public void TestEliminarTweets() {
		assertEquals(this.milena.realizarTweet("basta de lluvia loco"), true);
		List<Tweet> listaTweets= this.milena.getTweets();
		List<ReTweet> listaReTweets= this.milena.getReTweets();
		this.milena.eliminarTweets();
		assertEquals(this.milena.getReTweets().size(), 0);
		listaTweets.stream().forEach(t -> assertEquals(t.getTexto(), "Contenido no disponible"));
	}
	
	@Test
	public void testReTweetear() {
		Tweet tweet = new Tweet("no me acuerdo nada");
		assertEquals (this.martina.reTweetear(tweet).getOriginal().getTexto(), "no me acuerdo nada");
	}
}
