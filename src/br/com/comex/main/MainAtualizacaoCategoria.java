package br.com.comex.main;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.modelo.CategoriaDAO;
import br.com.comex.modelo.ConnectionFactory;


public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new CategoriaDAO(connection).atualizarCategoria("LIVROS", "LIVROS TÉCNICOS");;
        
        connection.close();
	}

}
