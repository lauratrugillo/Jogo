package br.com.fiap.jogo;

public class Jogo {

	public static void main(String[] args) {
		var jogador1 = new Mago("Joao");
		var jogador2 = new Guerreiro();
		
		jogador1.mostrarJogador();
		jogador2.mostrarJogador();
		jogador1.receberDano(10);
		jogador1.mostrarJogador();
		jogador1.receberCura(5);
		jogador1.mostrarJogador();
		jogador1.ganharExperiencia(20);
		jogador1.mostrarJogador();
		jogador1.receberAntidoto();
		jogador1.mostrarJogador();
		jogador2.atacar(jogador1);
		jogador1.mostrarJogador();
		jogador2.mostrarJogador();


		

	}

}
