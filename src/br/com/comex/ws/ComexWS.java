package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.dao.PedidoDAO;
import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
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
	
	public String atualizarCategoria(String nome, String status, Integer id) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new CategoriaDAO(connection).atualizarCategoria(nome, status, id);
        
        connection.close();
        return "Atualizacao feita com sucesso";
	
	}
	
	public String deletarCategoria(Integer id) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        new CategoriaDAO(connection).deletarCategoriaPorID(id);

        connection.close();
        return "Deletado com sucesso";
	}
	
	public  List<Cliente> listarClientes() throws SQLException{
		ConnectionFactory conexao = new ConnectionFactory();
	    Connection connection = conexao.getConnection();
	    List<Cliente> ListadeClientes = new ClienteDAO(connection).listarCliente();
	    connection.close();
	    return ListadeClientes;
    
	}

	public Cliente adicionarCliente(Cliente cliente) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
		
        new ClienteDAO(connection).cadastrarCliente(cliente);
        
		 connection.close();
		 return cliente;
	}
	
	public String atualizarCliente(String nome, Integer id) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new ClienteDAO(connection).atualizarClienteNome(id, nome);
        connection.close();
        return "Atualizacao feita com sucesso";
	
	}
	
	public String deletarCliente(Integer id) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        new ClienteDAO(connection).deletarClientePorNome(id);

        connection.close();
        return "Deletado com sucesso";
	}
	
	public Produto adicionarProdutos(Produto produto) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
		
        new ProdutoDAO(connection).cadastrarProduto(produto);
        
		 connection.close();
		 return produto;
	}
	
	public  List<Produto> listarProdutos() throws SQLException{
		ConnectionFactory conexao = new ConnectionFactory();
	    Connection connection = conexao.getConnection();
	    List<Produto> ListadeProdutos = new ProdutoDAO(connection).listarProduto();
	    connection.close();
	    return ListadeProdutos;
	    
	}
	
	public String atualizarProdutos(int id, String nome, 
			int quantidade, double preco, 
			int categoria_id, String tipo,
			String descricao
			) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new ProdutoDAO(connection).atualizarProduto(id, nome, quantidade, 
        		preco, categoria_id, 
        		tipo, descricao);
        
        connection.close();
        return "Atualizacao feita com sucesso";
	
	}
	
	public String deletarProdutos(Integer id) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        new ProdutoDAO(connection).deletarProdutoPorID(id);

        connection.close();
        return "Deletado com sucesso";
	}
	
	public Pedido adicionarPedido(Pedido pedido) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
		
        new PedidoDAO(connection).cadastrarPedido(pedido);
        
		 connection.close();
		 return pedido;
	}
	
	public  List<Pedido> listarPedido() throws SQLException{
		ConnectionFactory conexao = new ConnectionFactory();
	    Connection connection = conexao.getConnection();
	    List<Pedido> listarPedido = new PedidoDAO(connection).listarPedido();
	    connection.close();
	    return listarPedido;
	    
	}
	
	public String atualizarPedido(int id, 
			String novaData, 
			int novoCliente) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new PedidoDAO(connection).atualizarPedido(id, novaData, novoCliente);
        
        connection.close();
        return "Atualizacao feita com sucesso";
	
	}
	
	public String deletarPedido(Integer id) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        new PedidoDAO(connection).deletarPedido(id);

        connection.close();
        return "Deletado com sucesso";
	}
	
	public ItemPedido adicionarItemPedido(ItemPedido itempedido) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
		
        new ItemPedidoDAO(connection).cadastrarItemPedido(itempedido);
        
		 connection.close();
		 return itempedido;
	}
	
	public  List<ItemPedido> listarItemPedido() throws SQLException{
		ConnectionFactory conexao = new ConnectionFactory();
	    Connection connection = conexao.getConnection();
	    List<ItemPedido> ListadeItemsPedidos = new ItemPedidoDAO(connection).listarItemPedido();
	    connection.close();
	    return ListadeItemsPedidos;
	    
	}
	
	public String atualizarItemPedido(int id, double preco, 
			int quantidade, int produto, int pedido, int desconto) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
            
        new ItemPedidoDAO(connection).atualizarItemPedido(id, preco, 
    			quantidade, produto, pedido, desconto);
        
        connection.close();
        return "Atualizacao feita com sucesso";
	
	}
	
	public String deletarItemPedido(Integer id) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        new ItemPedidoDAO(connection).deletarItemPedido(id);

        connection.close();
        return "Deletado com sucesso";
	}
	

}
