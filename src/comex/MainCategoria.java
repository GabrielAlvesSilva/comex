package comex;

public class MainCategoria {

	public static void main(String[] args) { 
           
		Categoria informatica = new Categoria();
		informatica.cadastrarCategoria(1, "INFORMÁTICA", true);
		System.out.println("Categoria " + informatica.getNome() + 
				"(" + informatica.getId() + " - " + 
				informatica.getStatus() + ")");
	
		Categoria moveis = new Categoria();
		moveis.cadastrarCategoria(2, "MÓVEIS", true);
		System.out.println("Categoria " + moveis.getNome() + 
				"(" + moveis.getId() + " - " + 
				moveis.getStatus() + ")");
		
		Categoria livros = new Categoria();
		livros.cadastrarCategoria(2, "LIVROS", true);
		System.out.println("Categoria " + livros.getNome() + 
				"(" + livros.getId() + " - " + 
				livros.getStatus() + ")");
		
	}	
	
}

