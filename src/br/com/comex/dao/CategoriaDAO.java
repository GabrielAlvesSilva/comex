package br.com.comex.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;

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
	
	public void atualizarCategoria(String nome, String status, int id) throws SQLException {
		 String sql = "update comex.categoria set nome = ?,"
		 		+ "status = ?"
		 		+ " where id = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setString(1, nome);
		 	update.setString(2, status);
		 	update.setInt(3, id);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
	
	public List<Categoria> listarCategoria() throws SQLException {
		String sql = "select * from comex.categoria";
		PreparedStatement select = connection.prepareStatement(sql);
		
		List<Categoria> categorias = new ArrayList<>();
		ResultSet registros = select.executeQuery();
		while (registros.next()) {
			Categoria categoria = new Categoria(
					registros.getString("NOME"),
					Status.valueOf(registros.getString("STATUS"))
					);
			categoria.setId(registros.getLong("id"));
			categorias.add(categoria);		
		}
		registros.close();
		select.close();
		return categorias;
	}
	
	public void deletarCategoriaPorStatus(String status) throws SQLException {
		String sql = "delete from comex.categoria where status = ?";
               
        PreparedStatement delete = connection.prepareStatement(sql);
        delete.setString(1, status);
        delete.execute();
        System.out.println("Categoria deletada com Sucesso.");
        delete.close();
	}
	
	public void deletarCategoriaPorID(int id) throws SQLException {
		String sql = "delete from comex.categoria where id = ?";
               
        PreparedStatement delete = connection.prepareStatement(sql);
        delete.setInt(1, id);
        delete.execute();
        System.out.println("Categoria deletada com Sucesso.");
        delete.close();
	}
}
