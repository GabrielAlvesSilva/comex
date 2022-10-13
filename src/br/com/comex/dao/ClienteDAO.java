package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.Cliente;

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
	
	public void atualizarClienteNome(String nomeAtual, String nomeNovo) throws SQLException {
		 String sql = "update comex.cliente set nome = ? where nome = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setString(1, nomeNovo);
		 	update.setString(2, nomeAtual);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
			
	public void listarCliente() throws SQLException {
		Statement stm = connection.createStatement();
       stm.execute("SELECT * FROM comex.cliente");
       
       ResultSet rst = stm.getResultSet();
       System.out.println("ID |      Nome       |    Descricao    | Preco Unitario| Quantidade Estoque | Categoria ID | Tipo");
       while(rst.next()) {
       	int id = rst.getInt("id");
       	String nome = rst.getString("nome");
       	String descricao = rst.getString("descricao");
       	double precoUnitario = rst.getDouble("preco_unitario");
       	int quantidade = rst.getInt("quantidade_estoque");
       	int idCategoria = rst.getInt("categoria_id");
       	String tipo = rst.getString("tipo");
       	System.out.println(id +"   "+ nome +" "+ descricao + "       "+ precoUnitario+ "         " + 
       						quantidade+ "                    "+ idCategoria+ "             " + tipo);
       }
       stm.close();
       rst.close();
	}
	
	public void deletarClientePorNome(String nome) throws SQLException {
		String sql = "delete from comex.cliente where nome = ?";
              
       PreparedStatement delete = connection.prepareStatement(sql);
       delete.setString(1, nome);
       delete.execute();
       System.out.println("Deletado com Sucesso.");
       delete.close();
	}
}
