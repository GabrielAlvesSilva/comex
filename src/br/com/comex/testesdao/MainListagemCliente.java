package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;


public class MainListagemCliente {

	public static void main(String[] args) throws SQLException {
        ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        List<Cliente> ListadeClientes = new ClienteDAO(connection).listarCliente();
        for (Cliente cliente : ListadeClientes ) {
        	System.out.println(cliente.toString());
        }
	}

}
