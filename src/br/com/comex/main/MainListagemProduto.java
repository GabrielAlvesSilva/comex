package br.com.comex.main;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ProdutoDAO;


public class MainListagemProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
   
        new ProdutoDAO(connection).listarProduto();
        connection.close();
	}

}
