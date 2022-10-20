package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;


public class MainAtualizacaoPedido {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new PedidoDAO(connection).atualizarPedido(15, "10/10/15", 13);
        
        connection.close();
	}

}
