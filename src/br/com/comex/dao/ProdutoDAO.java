package br.com.comex.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.comex.modelo.Produto;

public class ProdutoDAO {
	private Connection connection;
	
	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void cadastrarProduto(Produto produto) throws SQLException {
		 String[] colunaParaRetornar = { "id" };
		 String sql = "INSERT INTO comex.produto" + 
				 		"(nome, descricao, preco_unitario, quantidade_estoque, categoria_id)" +
				 		"values (?, ?, ?, ?, ?)";
		 PreparedStatement insert = connection.prepareStatement(sql, colunaParaRetornar);
		 insert.setString(1, produto.getNome());
		 insert.setString(2, produto.getDescricao());
		 insert.setDouble(3, produto.getPrecoUnitario());
		 insert.setInt(4, produto.getQuantidadeEmEstoque());
		 insert.setInt(5, produto.getIdCategoria());
		 insert.execute();
		 try(ResultSet rs = insert.getGeneratedKeys()){
	        	while(rs.next()) {
	        		produto.setId(rs.getLong(1));
	        	}
	        }
		 System.out.println(produto.toString());		 
		 insert.close();
	}
	
	public void atualizarProduto(int id, String nome, 
											int quantidade, double preco, 
											int categoria_id, String tipo,
											String descricao
											) throws SQLException {
		 String sql = "update comex.produto set "
		 		+ "nome = ?, "
		 		+ "quantidade_estoque = ?, "
		 		+ "preco_unitario = ?, "
		 		+ "categoria_id = ?, "
		 		+ "tipo = ?, "
		 		+ "descricao = ? "
		 		+ "where id = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setString(1, nome);
		 	update.setInt(2, quantidade);
		 	update.setDouble(3, preco);
		 	update.setInt(4, categoria_id);
		 	update.setString(5, tipo);
		 	update.setString(6, descricao);
		 	update.setInt(7, id);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
	
	public List<Produto> listarProduto() throws SQLException {
		String sql = "select * from comex.produto";
		PreparedStatement select = connection.prepareStatement(sql);
		
		List<Produto> produtos = new ArrayList<>();
		ResultSet registros = select.executeQuery();
		while (registros.next()) {
			Produto produto = new Produto(
					registros.getString("NOME"),
					registros.getDouble("PRECO_UNITARIO"),
					registros.getInt("QUANTIDADE_ESTOQUE"),
					registros.getInt("CATEGORIA_ID"),
					registros.getString("DESCRICAO"),
					registros.getString("TIPO") 
					);
			produto.setId(registros.getLong("id"));
			produtos.add(produto);		
		}
		registros.close();
		select.close();
		return produtos;
	}
	
	public void deletarProdutoPorID (int id) throws SQLException {
		String sql = "delete from comex.produto where id = ?";
              
       PreparedStatement delete = connection.prepareStatement(sql);
       delete.setInt(1, id);
       delete.execute();
       System.out.println("Deletado com Sucesso.");
       delete.close();
	}
}
