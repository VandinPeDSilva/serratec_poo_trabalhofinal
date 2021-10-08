package serraflix;

import serraflix_exceptions.DuracaoInvalida;

public class Filme extends Programa{
	private double duracao;
	
	public Filme(String nome, Categoria categoria, double duracao) {
		super(nome, categoria);
		if(duracao < 0) {
			throw new DuracaoInvalida("Duração inválida, meu chapa.");
		} else {
			this.duracao = duracao;
		}
		
	}
	
	public Double getDuracao() {
		return this.duracao;
	}
}
