package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.ConnectionFactory;


public class MainAtualizacaoCliente {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new ClienteDAO(connection).atualizarClienteNome(14, "Petter de Paula");
        
        connection.close();
	}

}
