package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;



public class MainInsercaoItemPedido {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
       
        ItemPedido item = new ItemPedido(5000.00, 5, 29, 15, "PROMOCAO");
        ItemPedido item2 = new ItemPedido(5000.00, 2, 29, 15, "PROMOCAO");

        new ItemPedidoDAO(connection).cadastrarItemPedido(item);
        new ItemPedidoDAO(connection).cadastrarItemPedido(item2);


        connection.close();  
	}

}
