package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.List;

public class MontanteTotalVendas {
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidosCsv leitorpedidos = new LeitorPedidosCsv();
		List<PedidoCsv> pedidosCsv = leitorpedidos.lerPedidoCsv();
		double soma = 0;
		for(int i = 0; i < pedidosCsv.size(); i++)
		{
			double mult = 0;
			mult = Double.parseDouble(pedidosCsv.get(i).getPreco()) * Double.parseDouble(pedidosCsv.get(i).getQuantidade()); 
			soma = soma + mult;
		}
		System.out.println("Montante de vendas: " +NumberFormat.getCurrencyInstance().format(soma));
		
		
	}
}
