package ar.edu.unlp.info.oo2.ej2;

public class Piedra implements Jugada{
	
	

	public Piedra() {
	}

	public String contraPiedra() {
		return "empate";
	}
	
	public String contraPapel() {
		return "Gana papel";
	}
	
	public String contraTijera() {
		return "Gana piedra";
	}
	
	public String contraLagarto() {
		return "Gana piedra";
	}
	
	public String contraSpock() {
		return "Gana spock";
	}
	public String partida(Jugada jugada) {
		return jugada.contraPiedra();
	}
}
