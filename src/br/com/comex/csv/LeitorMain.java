package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class LeitorMain {

	public static void main(String[] args) throws FileNotFoundException {
		
	LeitorPedidosCsv leitorpedidos = new LeitorPedidosCsv();
	List<PedidoCsv> pedidosCsv = leitorpedidos.LerPedidoCsv();
	System.out.println("Total de linhas: " +pedidosCsv.size());
	}

}
