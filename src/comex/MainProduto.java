package comex;

public class MainProduto {
	public static void main(String[] args) { 
		
		Categoria informatica = new Categoria("INFORMÁTICA", true);
		Categoria livros = new Categoria("LIVROS", true);
		
		Produto noteSansung = new Produto();
		noteSansung.cadastraProduto("Notebook Samsung", 3523.00, 1, informatica, "NoteBook novo");
		noteSansung.RelatorioProduto();
		
		ProdutoIsento cleanArchitecture = new ProdutoIsento();
		cleanArchitecture.cadastraProduto("Clean Architecture", 102.90, 2, livros, "Livro novo");
		cleanArchitecture.RelatorioProduto();

		
		
		Produto monitorDell = new Produto();
		monitorDell.cadastraProduto("Monitor Dell 27", 1889.00, 3, informatica, "Monitor novo");
		monitorDell.RelatorioProduto();
		
		
/* \\Com Erros
		Produto noteSansung = new Produto();
		noteSansung.cadastraProduto("Note", 3523.00, 1, informatica, "NoteBook novo");
		noteSansung.RelatorioProduto();
		
		ProdutoIsento cleanArchitecture = new ProdutoIsento();
		cleanArchitecture.cadastraProduto("Clean Architecture", 0, 2, livros, "Livro novo");
		cleanArchitecture.RelatorioProduto();

		ProdutoIsento cleanArchitecture = new ProdutoIsento();
		cleanArchitecture.cadastraProduto("Clean Architecture", 2499.00, 0, livros, "Livro novo");
		cleanArchitecture.RelatorioProduto();
	
		Produto monitorDell = new Produto();
		monitorDell.cadastraProduto("Monitor Dell 27", 1889.00, 3, null, "Monitor novo");
		monitorDell.RelatorioProduto();
*/		
			

		
		
	}
}
