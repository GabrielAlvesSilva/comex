package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;


public class MainAtualizacaoProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new ProdutoDAO(connection).atualizarProdutoNome(29, "Notebook Asus");
        new ProdutoDAO(connection).atualizarProdutoPreco(29, 5000.00);
        new ProdutoDAO(connection).atualizarProdutoQuantidade(29, 10);
        connection.close();
	}

}
