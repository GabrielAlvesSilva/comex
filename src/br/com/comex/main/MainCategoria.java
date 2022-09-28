package br.com.comex.main;

import br.com.comex.modelo.Categoria;

public class MainCategoria {

	public static void main(String[] args) { 
    //com erro       
		Categoria informatica = new Categoria("A", true);
		informatica.getCategoria();
			
		Categoria livros = new Categoria("LIVROS", true);
		livros.getCategoria();
	}	
	
}

