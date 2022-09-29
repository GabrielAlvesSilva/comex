package br.com.comex.main;

import br.com.comex.modelo.CalculadoraValorTotal;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class MainItemPedido {

	public static void main(String[] args) {
		
		Categoria informatica = new Categoria("INFORMÁTICA");
		
		Produto noteSansung = new Produto();
		noteSansung.cadastraProduto("Notebook Samsung", 3523.00, 1, informatica, "NoteBook novo");

		
		Produto monitorDell = new Produto();
		monitorDell.cadastraProduto("Monitor Dell 27", 1889.00, 3, informatica, "Monitor novo");

		Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
		
		Pedido pedido1 = new Pedido("21-09-2022", cliente1);

		
		ItemPedido item1 = new ItemPedido();
		item1.cadastrarItemPedido(15, noteSansung, pedido1, "PROMOCAO");
		item1.printIItemPedido();	
		
		CalculadoraValorTotal calculadora = new CalculadoraValorTotal(item1);
		System.out.println("Valor Total com Descontos: " + String.format("%.2f", calculadora.calcula()));
		

		Cliente cliente2= new Cliente("Elimathias", "376.286.810-77", "(45) 93141-7844", "Travessa Leão Trauczynski", "37", "Perto da Panificadora", "Tatuquara", "Curitiba", "PR");
		Pedido pedido2 = new Pedido("15-09-2000", cliente2);

				
		ItemPedido item2 = new ItemPedido();
		item2.cadastrarItemPedido(1, monitorDell, pedido2);
	//	item2.printIItemPedido();
		
		
		
		
	}

}
