package br.com.comex.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Pedido;

public class PedidoDAO {
	private Connection connection;
	
	public PedidoDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void cadastrarPedido(Pedido pedido) throws SQLException {
		 String[] colunaParaRetornar = { "id" };
		 String sql = "insert into comex.pedido" + 
				 		"(data, cliente_id)" +
				 		"values (?, ?)";
		 PreparedStatement insert = connection.prepareStatement(sql, colunaParaRetornar);
		 insert.setString(1, pedido.getData());
		 insert.setLong(2, pedido.getIdcliente());
		 insert.execute();
		 try(ResultSet rs = insert.getGeneratedKeys()){
	        	while(rs.next()) {
	        		pedido.setId(rs.getLong(1));
	        	}
	        }
		 System.out.println(pedido.toString());		 
		 insert.close();
	}
	
	public void atualizarPedidoData(int id, String novaData) throws SQLException {
		 String sql = "update comex.pedido set data = ? where id = ?";
		 
		 PreparedStatement update = connection.prepareStatement(sql);
		 	update.setString(1, novaData);
		 	update.setInt(2, id);
		 	update.execute();
	        System.out.println("Atualicao realizada com Sucesso.");
	        update.close();  
	}
			
	public List<Pedido> listarPedido() throws SQLException {
		String sql = "select * from comex.pedido";
		PreparedStatement select = connection.prepareStatement(sql);
		
		List<Pedido> pedidos = new ArrayList<>();
		ResultSet registros = select.executeQuery();
		while (registros.next()) {
			Pedido pedido = new Pedido(
					registros.getString("data"),
					registros.getLong("cliente_id")
					);
			pedido.setId(registros.getLong("id"));
			pedidos.add(pedido);		
		}
		registros.close();
		select.close();
		return pedidos;
	}
	
	public void deletarPedido(int id) throws SQLException {
		String sql = "delete from comex.pedido where id = ?";
              
       PreparedStatement delete = connection.prepareStatement(sql);
       delete.setInt(1, id);
       delete.execute();
       System.out.println("Deletado com Sucesso.");
       delete.close();
	}
}
