package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;


public class MainListagemPedido {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        List<Pedido> ListadePedidos = new PedidoDAO(connection).listarPedido();
        for (Pedido pedido : ListadePedidos ) {
        	System.out.println(pedido.toString());
        }
	}
}
