package br.com.fiap.jogo;

import java.util.Random;

public class Dragao implements Fase{

	private int x;
	private int y;

	@Override
	public int Mover(int x, int y) {
		Random random = new Random();
		this.x = random.nextInt() * 1;
		if(this.x == 1) {
			return this.x + 1;
		}else {
			return this.y + 1;
		}
		
	}

	@Override
	public String Carregar(String nome) {
		return "Dragão";
	}

}
