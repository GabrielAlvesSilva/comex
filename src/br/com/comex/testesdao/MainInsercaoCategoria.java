package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Status;


public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
       
        Categoria informatica = new Categoria("Jogos d");
        Categoria moveis = new Categoria("MÓVEIS", Status.INATIVA);
        Categoria livros = new Categoria("LIVROS", Status.ATIVA);
        
        new CategoriaDAO(connection).cadastrarCategoria(informatica);
        new CategoriaDAO(connection).cadastrarCategoria(moveis);
        new CategoriaDAO(connection).cadastrarCategoria(livros);


        connection.close();  
	}

}
