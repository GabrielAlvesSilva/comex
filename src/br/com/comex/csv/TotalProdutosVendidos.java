package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class TotalProdutosVendidos {
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidosCsv leitorpedidos = new LeitorPedidosCsv();
		List<PedidoCsv> pedidosCsv = leitorpedidos.LerPedidoCsv();
		int soma = 0;
		for(int i = 0; i < pedidosCsv.size(); i++)
		{
			soma = soma + Integer.parseInt(pedidosCsv.get(i).getQuantidade());
		}
		System.out.println("Soma total: " +soma);
		}
	
}
