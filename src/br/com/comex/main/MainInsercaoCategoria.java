package br.com.comex.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;


public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();

        String sql = "INSERT INTO comex.categoria (nome, status) values (?, ?)";
        String nome1 = "INFORMÁTICA";
        String status1 = "ATIVA";
        
        String nome2 = "MÓVEIS";
        String status2 = "INATIVA";
        
        String nome3 = "LIVROS";
        String status3 = "ATIVA";
        
        PreparedStatement insert1 = connection.prepareStatement(sql);
        insert1.setString(1, nome1);
        insert1.setString(2, status1);
        insert1.execute();
        
        PreparedStatement insert2 = connection.prepareStatement(sql);
        insert2.setString(1, nome2);
        insert2.setString(2, status2);
        insert2.execute();
        
        PreparedStatement insert3 = connection.prepareStatement(sql);
        insert3.setString(1, nome3);
        insert3.setString(2, status3);
        insert3.execute();

      
        	
        insert3.close();
        insert2.close();
        insert1.close();
        connection.close();

	}

}
