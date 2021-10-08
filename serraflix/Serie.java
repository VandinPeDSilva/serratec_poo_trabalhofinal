package serraflix;

import java.util.ArrayList;
import java.util.List;

import serraflix_exceptions.ClassificacaoInvalida;

public class Serie extends Programa {
	private ArrayList<Temporada> temporadas;
	private int qtdTemporada;

	Serie(String nome, Categoria categoria) {
		super(nome, categoria);
	}

	public void addTemporada(ArrayList<Temporada> temporada) {
		this.temporadas = temporada;
		qtdTemporada++;
	}
	
	/*public void addTemporada(int temporada, int episodios) {
		this.temporadas.add(new Temporada(temporada, episodios));
	} */
	
	@Override
	public void classificar(int classificacao) {
		if(classificacao < 0 || classificacao > 10) {
			throw new ClassificacaoInvalida("Classificação inválida, meu!");
		}
	}
	
	public int getQuantidadeTemporadas() {
		return this.qtdTemporada;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
