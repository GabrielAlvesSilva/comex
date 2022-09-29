package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;

public class MainCategoria {

	public static void main(String[] args) { 
    //com erro       
		Categoria informatica = new Categoria("A", Status.ATIVO);
		informatica.getCategoria();
		
		Categoria livros = new Categoria("LIVROS", Status.ATIVO);
		livros.getCategoria();
		
		
	}	
	
}

