package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public void atualizarProdutoNome(String nomeAtual, String nomeNovo) throws SQLException {
		 String sql = "update comex.produto set nome = ? where nome = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setString(1, nomeNovo);
		 	update.setString(2, nomeAtual);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
	
	public void atualizarProdutoPreco(String nome, double preco) throws SQLException {
		 String sql = "update comex.produto set preco_unitario = ? where nome = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setDouble(1, preco);
		 	update.setString(2, nome);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
	
	public void atualizarProdutoQuantidade(String nome, int quantidade) throws SQLException {
		 String sql = "update comex.produto set quantidade_estoque = ? where nome = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setInt(1, quantidade);
		 	update.setString(2, nome);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
	
	public void listarProduto() throws SQLException {
		Statement stm = connection.createStatement();
       stm.execute("SELECT * FROM comex.produto");
       
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
	
	public void deletarProdutoPorNome(String nome) throws SQLException {
		String sql = "delete from comex.produto where nome = ?";
              
       PreparedStatement delete = connection.prepareStatement(sql);
       delete.setString(1, nome);
       delete.execute();
       System.out.println("Deletado com Sucesso.");
       delete.close();
	}
}
