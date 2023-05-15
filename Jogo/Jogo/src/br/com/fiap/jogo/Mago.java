package br.com.fiap.jogo;

public class Mago extends Jogador implements Fase{
	
	private int mp;

	@Override
	public int Mover(int x, int y) {
		return 0;
	}

	@Override
	public String Carregar(String nome) {
		return "Mago";
	}
	
	
}
