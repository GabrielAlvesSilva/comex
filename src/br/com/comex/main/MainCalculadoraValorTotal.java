package br.com.comex.main;

import br.com.comex.modelo.CalculadoraValorTotal;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estado;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class MainCalculadoraValorTotal {

	public static void main(String[] args) {
		
		Categoria informatica = new Categoria("INFORMÁTICA");
		
		Produto noteSansung = new Produto("Notebook Samsung", 3523.00, 1, informatica, "NoteBook novo");
		
		Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
		
		Pedido pedido1 = new Pedido("21-09-2022", cliente1);
		
		ItemPedido item1 = new ItemPedido();
		item1.cadastrarItemPedido(15, noteSansung, pedido1, "PROMOCAO");
		
		
		CalculadoraValorTotal calculadora = new CalculadoraValorTotal(item1);
		item1.printIItemPedido();
		System.out.println("Valor Total com Descontos: " + String.format("%.2f", calculadora.calcula()));
		
	}

}
