package serraflix;

import java.util.List;

public class Biblioteca {
	private List<Programa> programas;
	
	public Biblioteca() {
		
	}
	
	public void addFilme(Filme filme) {
		this.programas.add(filme);
	}
	
	public void addSerie(Serie serie) {
		this.programas.add(serie);
	}
}

