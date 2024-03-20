package ar.edu.unlp.info.oo2.ej2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unlp.info.oo2.ej2.*;
public class JuegoTest {
	private Juego juego;
	private Piedra piedra;
	private Papel papel;
	private Tijera tijera;
	private Spock spock;
	private Lagarto lagarto;
	
	@BeforeEach
	public void setup() {
		this.juego = new Juego();
		this.piedra = new Piedra();
		this.papel = new Papel();
		this.tijera = new Tijera();
		this.spock = new Spock();
		this.lagarto = new Lagarto();
	}
	
	@Test
	public void TestPartida() {
		assertEquals(this.juego.partida(papel, tijera), "Gana tijera");
		assertEquals(this.juego.partida(papel, piedra), "Gana papel");
		assertEquals(this.juego.partida(papel, papel), "empate");
		assertEquals(this.juego.partida(papel, lagarto), "Gana lagarto");
		assertEquals(this.juego.partida(papel, spock), "Gana papel");
	}
	
}
