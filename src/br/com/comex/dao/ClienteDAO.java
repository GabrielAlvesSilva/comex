package br.com.comex.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estado;


public class ClienteDAO {
	private Connection connection;
	
	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void cadastrarCliente(Cliente cliente) throws SQLException {
		 String[] colunaParaRetornar = { "id" };
		 String sql = "insert into comex.cliente" + 
				 		"(nome, cpf, telefone, rua, numero, complemento, bairro, cidade, uf)" +
				 		"values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		 PreparedStatement insert = connection.prepareStatement(sql, colunaParaRetornar);
		 insert.setString(1, cliente.getNome());
		 insert.setString(2, cliente.getCpf());
		 insert.setString(3, cliente.getTelefone());
		 insert.setString(4, cliente.getRua());
		 insert.setString(5, cliente.getNumero());
		 insert.setString(6, cliente.getComplemento());
		 insert.setString(7, cliente.getBairro());
		 insert.setString(8, cliente.getCidate());
		 insert.setString(9, cliente.getEstadoString());
		 insert.execute();
		 try(ResultSet rs = insert.getGeneratedKeys()){
	        	while(rs.next()) {
	        		cliente.setId(rs.getLong(1));
	        	}
	        }
		 System.out.println(cliente.toString());		 
		 insert.close();
	}
	
	public void atualizarClienteNome(int id, String nomeNovo) throws SQLException {
		 String sql = "update comex.cliente set nome = ? where id = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setString(1, nomeNovo);
		 	update.setInt(2, id);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
			
	public List<Cliente> listarCliente() throws SQLException {
		String sql = "select * from comex.cliente";
		PreparedStatement select = connection.prepareStatement(sql);
		
		List<Cliente> clientes = new ArrayList<>();
		ResultSet registros = select.executeQuery();
		while (registros.next()) {
			Cliente cliente = new Cliente(
					registros.getString("nome"),
					registros.getString("cpf"),
					registros.getString("TELEFONE"),
					registros.getString("RUA"),
					registros.getString("NUMERO"),
					registros.getString("COMPLEMENTO"),
					registros.getString("BAIRRO"),
					registros.getString("CIDADE"),
					Estado.valueOf(registros.getString("UF"))    
					);
			cliente.setId(registros.getLong("id"));
			clientes.add(cliente);		
		}
		registros.close();
		select.close();
		return clientes;
	}
	
	public void deletarClientePorNome(int id) throws SQLException {
		String sql = "delete from comex.cliente where id = ?";
              
       PreparedStatement delete = connection.prepareStatement(sql);
       delete.setInt(1, id);
       delete.execute();
       System.out.println("Deletado com Sucesso.");
       delete.close();
	}
}
