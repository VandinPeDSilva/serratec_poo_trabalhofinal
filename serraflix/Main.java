package serraflix;

import java.util.ArrayList;
import java.util.List;

import serraflix_exceptions.ClassificacaoInvalida;

public class Main {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();
		
		Filme doisMilEDoze = new Filme("2012", Categoria.FICCAO_CIENTIFICA, 1.2);
		
		Serie bojackHorseman = new Serie("Bojack Horseman", Categoria.COMEDIA);
		
		ArrayList<Temporada> bjh = new ArrayList<Temporada>();
		    bjh.add(new Temporada(1,20));
		    bjh.add(new Temporada(2, 15));
		    
	    bojackHorseman.addTemporada(bjh);
	    
	    System.out.println(bjh.toString());
		
		/*
		Temporada bjh1 = new Temporada(1,20);
		Temporada bjh2 = new Temporada(2,20);
		bojackHorseman.addTemporada(bjh1);
		/*

		
		//System.out.println(bojackHorseman.getTemporadas());
		
		/*
		Filme f1 = new Filme("", Categoria.COMEDIA, 1.2 );
		try {
			f1.classificar(5);
		} catch (ClassificacaoInvalida e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(f1.getPontuacao());
		*/
	}

}
