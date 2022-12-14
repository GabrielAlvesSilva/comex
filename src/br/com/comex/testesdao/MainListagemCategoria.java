package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;



public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        List<Categoria> ListadeCategorias = new CategoriaDAO(connection).listarCategoria();
        for (Categoria categoria : ListadeCategorias ) {
        	System.out.println(categoria.toString());
        }
	}

}
