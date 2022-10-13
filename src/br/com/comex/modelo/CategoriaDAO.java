package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CategoriaDAO {
private Connection connection;
	
	public CategoriaDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void cadastrarCategoria(Categoria categoria) throws SQLException {
		 String[] colunaParaRetornar = { "id" };
		 String sql = "INSERT INTO comex.categoria (nome, status) values (?, ?)";
		 PreparedStatement insert = connection.prepareStatement(sql, colunaParaRetornar);
		 	insert.setString(1, categoria.getNome());
	        insert.setString(2, categoria.getStatusString());
	        insert.execute();
	        try(ResultSet rs = insert.getGeneratedKeys()){
	        	while(rs.next()) {
	        		categoria.setId(rs.getLong(1));
	        	}
	        }
	        System.out.println(categoria.toString());
	        insert.close();  
	}
	
	public void atualizarCategoria(String nomeAtual, String nomeNovo) throws SQLException {
		 String sql = "update comex.categoria set nome = ? where nome = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setString(1, nomeNovo);
		 	update.setString(2, nomeAtual);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
	
	public void listarCategoria() throws SQLException {
		Statement stm = connection.createStatement();
        stm.execute("SELECT * FROM comex.categoria");
        
        ResultSet rst = stm.getResultSet();
        System.out.println("ID | Nome | STATUS");
        while(rst.next()) {
        	int id = rst.getInt("id");
        	String nome = rst.getString("nome");
        	String status = rst.getString("status");
        	System.out.println(id +" "+ nome +" "+ status);
        }
        stm.close();
        rst.close();
        connection.close();
	}
	
	public void deletarCategoriaPorStatus(String status) throws SQLException {
		String sql = "delete from comex.categoria where status = ?";
               
        PreparedStatement delete = connection.prepareStatement(sql);
        delete.setString(1, status);
        delete.execute();
        System.out.println("Categoria deletada com Sucesso.");
        delete.close();
	}
	
	public void deletarCategoriaPorNome(String nome) throws SQLException {
		String sql = "delete from comex.categoria where nome = ?";
               
        PreparedStatement delete = connection.prepareStatement(sql);
        delete.setString(1, nome);
        delete.execute();
        System.out.println("Categoria deletada com Sucesso.");
        delete.close();
	}
}
