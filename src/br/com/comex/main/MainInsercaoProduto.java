package br.com.comex.main;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoDAO;



public class MainInsercaoProduto {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();

        Produto noteSansung = new Produto("Notebook Samsung", 3523.00, 1, 25, "NoteBook novo");
        Produto noteXUXA = new Produto("Notebook XUXA", 7000.00, 1, 25, "NoteBook Ruim");

        new ProdutoDAO(connection).cadastrarProduto(noteSansung);
        new ProdutoDAO(connection).cadastrarProduto(noteXUXA);
        
        connection.close();  
	}

}
