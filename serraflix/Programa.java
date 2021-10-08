package serraflix;

import serraflix_exceptions.ClassificacaoInvalida;

public abstract class Programa implements Classificar{
	private String nome;
	private int pontuacao;
	private Categoria categoria;
	
	Programa(String nome, Categoria categoria){
		this.nome = nome;
		this.categoria = categoria;
	}
	
	
	
	@Override
	public void classificar(int classificacao) {
		if(classificacao < 0 || classificacao > 5){
			throw new ClassificacaoInvalida("Classificação inválida.");
		} else {
			this.pontuacao = classificacao;
		}
	}
	
	// Coloca novo nome.
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Retorna o nome atual.
	public String getNome() {
		return this.nome;
	}
	
	// Coloca nova categoria.
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;	
	}
	
	// Retorna categoria
	public Categoria getCategoria() {
		return this.categoria;
	}
	
	// Retorna a classificação (0 - 5)
	public int getPontuacao() {
		return this.pontuacao;
	}
}
