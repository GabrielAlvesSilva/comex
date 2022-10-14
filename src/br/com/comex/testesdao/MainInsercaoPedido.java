package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;


public class MainInsercaoPedido {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
       
        
        Pedido pedido1 = new Pedido("14/10/2022",13);
        Pedido pedido2 = new Pedido("15/10/2022",13);

       new PedidoDAO(connection).cadastrarPedido(pedido1);
       new PedidoDAO(connection).cadastrarPedido(pedido2);
        
        
        

        connection.close();  
	}

}
