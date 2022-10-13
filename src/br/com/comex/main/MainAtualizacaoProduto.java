package br.com.comex.main;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ProdutoDAO;


public class MainAtualizacaoProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new ProdutoDAO(connection).atualizarProdutoNome("Notebook Samsung", "Notebook Asus");
        new ProdutoDAO(connection).atualizarProdutoPreco("Notebook Asus", 5000.00);
        new ProdutoDAO(connection).atualizarProdutoQuantidade("Notebook Asus", 10);
        connection.close();
	}

}
