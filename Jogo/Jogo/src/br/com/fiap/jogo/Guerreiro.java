package br.com.fiap.jogo;

public class Guerreiro extends Jogador implements Fase{

	public Guerreiro() {}
	
	public Guerreiro(String nome) {
		super(nome);
	}
	
	@Override
	public int Mover(int x, int y) {
		return 0;
	}

	@Override
	public String Carregar(String nome) {
		return "Guerreiro";
	}

}