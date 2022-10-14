package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;


public class MainRemocaoPedido {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        new PedidoDAO(connection).deletarPedido(16);

        connection.close();
	}

}
