package br.com.comex.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        String sql = "delete from comex.categoria where status = ?";
        String status = "INATIVA";
        
        PreparedStatement insert1 = connection.prepareStatement(sql);
        insert1.setString(1, status);
        insert1.execute();
        

        insert1.close();
        connection.close();

	}

}
