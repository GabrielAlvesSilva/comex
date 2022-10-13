package br.com.comex.modelo;

public class ProdutoIsento extends Produto {
		
	public ProdutoIsento(String nome, double precoUnitario, int quantidadeEmEstoque, Categoria categoria,
			String descricao) {
		super(nome, precoUnitario, quantidadeEmEstoque, categoria, descricao);
		// TODO Auto-generated constructor stub
	}

	public double impostosProduto() {
		return (0);
	}
	
}
