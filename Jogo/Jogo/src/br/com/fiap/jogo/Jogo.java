package br.com.fiap.jogo;

public class Jogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Joao");
		Jogador jogador2 = new Jogador();
		
		mostrarJogador(jogador1);
		jogador1.receberDano(10);
		mostrarJogador(jogador1);
		jogador1.receberCura(5);
		mostrarJogador(jogador1);
		jogador1.ganharExperiencia(20);
		mostrarJogador(jogador1);
		jogador1.receberAntidoto();
		mostrarJogador(jogador1);
		jogador2.atacar(jogador1);
		mostrarJogador(jogador1);
		
		System.out.println("Jogador 2 " + jogador2.getNome() + 
							" XP=" + jogador2.getXp() +
							" HP=" + jogador2.getHp() +
							" Env=" + jogador2.isEnvenenado() 
			);

	}

}
