package br.com.comex.main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.comex.modelo.ConnectionFactory;


public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
   
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

}
