package br.com.comex.modelo;

public class CalculadoraValorTotal{
	private ItemPedido itempedido;
	
	public CalculadoraValorTotal(ItemPedido itempedido) {
		this.itempedido = itempedido;
	}
	
	public double calcula() {
		return((this.itempedido.getQuantidade() * this.itempedido.precoComDesconto()));
	}
	
	
}
