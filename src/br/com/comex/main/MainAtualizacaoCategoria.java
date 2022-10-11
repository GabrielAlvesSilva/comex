package br.com.comex.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        
        String sql = "update comex.categoria set nome = ? where nome = ?";
        String nomeAtual = "LIVROS";
        String nomeNovo = "LIVROS TÉCNICOS";
        
        PreparedStatement insert1 = connection.prepareStatement(sql);
        insert1.setString(1, nomeNovo);
        insert1.setString(2, nomeAtual);
        insert1.execute();
        

        insert1.close();
        connection.close();
	}

}
