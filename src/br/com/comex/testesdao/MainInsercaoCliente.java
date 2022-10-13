package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Estado;



public class MainInsercaoCliente{

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 9 3249-8347", 
        		"Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
        
        Cliente cliente2= new Cliente("Petter", "943.919.930-81", "(45) 9 3249-8347", 
        		"Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
        
        new ClienteDAO(connection).cadastrarCliente(cliente1);
        new ClienteDAO(connection).cadastrarCliente(cliente2);

        connection.close();  
	}

}
