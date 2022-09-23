package comex;

public class MainCategoria {

	public static void main(String[] args) { 
           
		Categoria informatica = new Categoria("INFORMÁTICA", true);
		informatica.getCategoria();
	
		Categoria moveis = new Categoria("MÓVEIS", false);
		moveis.getCategoria();
		
		Categoria livros = new Categoria("LIVROS", true);
		livros.getCategoria();
	}	
	
}

