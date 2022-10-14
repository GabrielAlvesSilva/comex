package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;


public class MainAtualizacaoItemPedido {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new ItemPedidoDAO(connection).atualizarItemPedidoQuantidade(11, 10);
        
        connection.close();
	}

}
