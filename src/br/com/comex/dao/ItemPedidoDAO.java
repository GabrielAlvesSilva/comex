package br.com.comex.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.comex.modelo.ItemPedido;


public class ItemPedidoDAO {
	private Connection connection;
	
	public ItemPedidoDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void cadastrarItemPedido(ItemPedido item) throws SQLException {
		 String[] colunaParaRetornar = { "id" };
		 String sql = "insert into comex.item_pedido" + 
				 		"(preco_unitario, quantidade, produto_id, pedido_id, desconto, tipo_desconto)" +
				 		"values (?, ?, ?, ?, ?, ?)";
		 PreparedStatement insert = connection.prepareStatement(sql, colunaParaRetornar);
		 insert.setDouble(1, item.getPrecoUnitario());
		 insert.setInt(2, item.getQuantidade());
		 insert.setLong(3, item.getIdProduto());
		 insert.setLong(4, item.getIdPedido());
		 insert.setDouble(5, item.calculaDesconto());
		 insert.setString(6, item.getTipoDesconto());
		 insert.execute();
		 try(ResultSet rs = insert.getGeneratedKeys()){
	        	while(rs.next()) {
	        		item.setId(rs.getLong(1));
	        	}
	        }
		 System.out.println(item.toString());		 
		 insert.close();
	}
	
	public void atualizarItemPedido(int id, double preco, 
			int quantidade, int produto, int pedido, double desconto) throws SQLException {
		 String sql = "update comex.item_pedido set preco_unitario = ?, "
		 		+ "quantidade = ?, "
		 		+ "produto_id = ?, "
		 		+ "pedido_id = ?, "
		 		+ "desconto = ? "
		 		+ "where id = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setDouble(1, preco);
		 	update.setInt(2, quantidade);
		 	update.setInt(3, produto);
		 	update.setInt(4, pedido);
		 	update.setDouble(5, desconto);
		 	update.setInt(6, id);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
			
	public List<ItemPedido> listarItemPedido() throws SQLException {
		String sql = "select * from comex.item_pedido";
		PreparedStatement select = connection.prepareStatement(sql);
		
		List<ItemPedido> itemspedidos = new ArrayList<>();
		ResultSet registros = select.executeQuery();
		while (registros.next()) {
			ItemPedido item = new ItemPedido(
					registros.getDouble("preco_unitario"),
					registros.getInt("quantidade"),
					registros.getLong("produto_id"),
					registros.getLong("pedido_id"),
					registros.getString("tipo_desconto")
					);
			item.setId(registros.getLong("id"));
			itemspedidos.add(item);		
		}
		registros.close();
		select.close();
		return itemspedidos;
	}
	
	public void deletarItemPedido(int id) throws SQLException {
		String sql = "delete from comex.item_pedido where id = ?";
              
       PreparedStatement delete = connection.prepareStatement(sql);
       delete.setInt(1, id);
       delete.execute();
       System.out.println("Deletado com Sucesso.");
       delete.close();
	}
}
