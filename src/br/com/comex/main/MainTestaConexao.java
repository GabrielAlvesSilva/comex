package br.com.comex.main;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;


public class MainTestaConexao {

		public static void main(String[] args) throws SQLException{

			ConnectionFactory conexao = new ConnectionFactory();
	        Connection connection = conexao.getConnection();
	        
	        System.out.println("Conexão efetuada com sucesso");
	        
	        connection.close();
	        

		}
}
