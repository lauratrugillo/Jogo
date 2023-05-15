package br.com.fiap.jogo;

public abstract class Jogador {
	private String nome = "anonimo";
	private int xp = 100;
	private int hp = 100;
	private boolean envenenado;
	
	public Jogador() {
		System.out.println("Criando jogador " + nome);
	}
	
	public Jogador(String nome) {
		System.out.println("Criando jogador " + nome);
		this.nome = nome;
	}
	
	public void receberDano(int pontos) {
		hp -= pontos;
		if(foiDerrotado()) {
			System.out.println("Game Over " + nome);
		}
	}

	public void receberCura(int pontos) {
		hp += pontos;		
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

	public void ganharExperiencia(int pontos) {
		xp += pontos;		
	}

	public void receberAntidoto() {
		envenenado = !envenenado;
		
	}

	public void atacar(Jogador jogador) {
		jogador.receberDano(this.getXp());
		if(jogador.foiDerrotado())
			ganharExperiencia(jogador.getXp());
		
	}

	private boolean foiDerrotado() {
		return hp <= 0;
	}
}
