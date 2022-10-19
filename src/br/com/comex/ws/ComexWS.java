package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

@WebService
public class ComexWS {
	@WebMethod(operationName = "getCategorias") 
	@WebResult(name = "listarCategorias" )
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
	    connection.close();
	    return ListadeClientes;
    
	}
	
	public  List<Produto> listarProdutos() throws SQLException{
		ConnectionFactory conexao = new ConnectionFactory();
	    Connection connection = conexao.getConnection();
	    List<Produto> ListadeProdutos = new ProdutoDAO(connection).listarProduto();
	    connection.close();
	    return ListadeProdutos;
	    
	}

	public Cliente adicionarCliente(Cliente cliente) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
		
        new ClienteDAO(connection).cadastrarCliente(cliente);
        
		 connection.close();
		 return cliente;
	}
	

}
