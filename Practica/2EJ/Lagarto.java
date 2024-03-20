package ar.edu.unlp.info.oo2.ej2;

public class Lagarto implements Jugada{
	
	public Lagarto() {
	}
	
	public String contraPiedra() {
		return "Gana piedra";
	}
	
	public String contraPapel() {
		return "Gana lagarto";
	}
	
	public String contraTijera() {
		return "Gana tijera";
	}
	
	public String contraLagarto() {
		return "empate";
	}
	
	public String contraSpock() {
		return "Gana lagarto";
	}
	
	public String partida(Jugada jugada) {
		return jugada.contraLagarto();
	}
}
