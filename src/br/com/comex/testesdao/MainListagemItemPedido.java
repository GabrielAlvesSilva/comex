package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;



public class MainListagemItemPedido {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        List<ItemPedido> ListadeItemsPedidos = new ItemPedidoDAO(connection).listarItemPedido();
        for (ItemPedido item : ListadeItemsPedidos ) {
        	System.out.println(item.toString());
        }
	}
	

}
