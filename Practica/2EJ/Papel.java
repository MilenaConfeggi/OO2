package ar.edu.unlp.info.oo2.ej2;

public class Papel implements Jugada{
	
	public Papel() {
	}

	public String contraPiedra() {
		return "Gana papel";
	}
	
	public String contraPapel() {
		return "empate";
	}
	
	public String contraTijera() {
		return "Gana tijera";
	}
	
	public String contraLagarto() {
		return "Gana lagarto";
	}
	
	public String contraSpock() {
		return "Gana papel";
	}
	
	public String partida(Jugada jugada) {
		return jugada.contraPapel();
	}
}
