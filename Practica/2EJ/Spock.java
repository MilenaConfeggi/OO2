package ar.edu.unlp.info.oo2.ej2;

public class Spock implements Jugada{
	
	public Spock() {
	}
	
	public String contraPiedra() {
		return "Gana spock";
	}
	
	public String contraPapel() {
		return "Gana papel";
	}
	
	public String contraTijera() {
		return "Gana spock";
	}
	
	public String contraLagarto() {
		return "Gana lagarto";
	}
	
	public String contraSpock() {
		return "empate";
	}
	
	public String partida(Jugada jugada) {
		return jugada.contraSpock();
	}
}
