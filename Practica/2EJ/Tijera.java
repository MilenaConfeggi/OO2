package ar.edu.unlp.info.oo2.ej2;

public class Tijera implements Jugada{
	
	public Tijera() {
	}
	
	public String contraPiedra() {
		return "Gana piedra";
	}
	
	public String contraPapel() {
		return "Gana tijera";
	}
	
	public String contraTijera() {
		return "empate";
	}
	
	public String contraLagarto() {
		return "Gana tijera";
	}
	
	public String contraSpock() {
		return "Gana spock";
	}
	
	public String partida(Jugada jugada) {
		return jugada.contraTijera();
	}
}
