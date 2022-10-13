package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;

public class MainProduto {
	public static void main(String[] args) { 
		
		Categoria informatica = new Categoria("INFORMÁTICA");
		Categoria livros = new Categoria("LIVROS");
		
		Produto noteSansung = new Produto("Notebook Samsung", 3523.00, 1, informatica, "NoteBook novo");
		noteSansung.RelatorioProduto();
		
		ProdutoIsento cleanArchitecture = new ProdutoIsento("Clean Architecture", 102.90, 2, livros, "Livro novo");
		cleanArchitecture.RelatorioProduto();
		
		Produto monitorDell = new Produto("Monitor Dell 27", 1889.00, 3, informatica, "Monitor novo");
		monitorDell.RelatorioProduto();
	
 //Com Erros
		// erro numero de letras nome
		//Produto noteSansung = new Produto();
		//noteSansung.cadastraProduto("Note", 3523.00, 1, informatica, "NoteBook novo");
		//noteSansung.RelatorioProduto();
		
		// erro preco Unitario
		//ProdutoIsento cleanArchitecture = new ProdutoIsento();
		//cleanArchitecture.cadastraProduto("Clean Architecture", 0, 2, livros, "Livro novo");
		//cleanArchitecture.RelatorioProduto();
		
		//erro quantidade em estoque
		//ProdutoIsento cleanArchitecture = new ProdutoIsento();
		//cleanArchitecture.cadastraProduto("Clean Architecture", 2499.00, 0, livros, "Livro novo");
		//cleanArchitecture.RelatorioProduto();
		
		//erro categoria campo obrigatorio
		//Produto monitorDell = new Produto();
		//monitorDell.cadastraProduto("Monitor Dell 27", 1889.00, 3, null, "Monitor novo");
		//monitorDell.RelatorioProduto();
		
		//erro inicio nome
		//Produto noteSansung = new Produto();
		//noteSansung.cadastraProduto("1Notebook Samsung", 3523.00, 1, informatica, "NoteBook novo");
		//noteSansung.RelatorioProduto();

		
		
	}
}
