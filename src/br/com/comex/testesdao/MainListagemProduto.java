package br.com.comex.testesdao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;


public class MainListagemProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
        Connection connection = conexao.getConnection();
        List<Produto> ListadeProdutos = new ProdutoDAO(connection).listarProduto();
        for (Produto produto : ListadeProdutos ) {
        	System.out.println(produto.toString());
        }
	}

}
