package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;

public class MainCategoria {

	public static void main(String[] args) { 
    //Erro caracteres nome       
		//Categoria informatica = new Categoria("A", Status.ATIVO);
		//informatica.getCategoria();
	//Erro caracteres nome       
		Categoria informatica = new Categoria("Notebook Super", Status.ATIVA);
		System.out.println(informatica.toString());
		System.out.println(informatica.getStatusString());
		
		Categoria livros = new Categoria("LIVROS", Status.ATIVA);
		livros.toString();
		
		
	}	
	
}

