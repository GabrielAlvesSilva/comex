package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;
import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;

@WebService
public class ComexWS {
	
	public List<Categoria> getCategorias() throws SQLException {
		
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        List<Categoria> ListadeCategorias = new CategoriaDAO(connection).listarCategoria();
        connection.close();
        return ListadeCategorias;
        
	}
	
	public Categoria adicionarCategoria(Categoria categoria) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
		
        new CategoriaDAO(connection).cadastrarCategoria(categoria);
        
		 connection.close();
		 return categoria;
	}
	
	public  List<Cliente> listarClientes() throws SQLException{
	ConnectionFactory conexao = new ConnectionFactory();
    Connection connection = conexao.getConnection();
    List<Cliente> ListadeClientes = new ClienteDAO(connection).listarCliente();
    return ListadeClientes;
    
	}
}
