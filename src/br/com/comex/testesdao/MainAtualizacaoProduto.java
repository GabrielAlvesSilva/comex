package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;


public class MainAtualizacaoProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new ProdutoDAO(connection).atualizarProduto(29, "Notebook teste", 3, 4000, 31 , 
        		"NAO_ISENTO", "NoteBook Novo");

        connection.close();
	}

}
