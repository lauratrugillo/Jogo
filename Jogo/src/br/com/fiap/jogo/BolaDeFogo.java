package br.com.fiap.jogo;

public class BolaDeFogo implements Fase{

	private int poder;

	@Override
	public int Mover(int x, int y) {
		return 0;
	}

	@Override
	public String Carregar(String nome) {
		return "Bola de Fogo";
	}
	
}
