package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TotalCategorias {
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidosCsv leitorpedidos = new LeitorPedidosCsv();
		List<PedidoCsv> pedidosCsv = leitorpedidos.lerPedidoCsv();
		List<String> categorias = new ArrayList<String>();
		for(int i = 0; i < pedidosCsv.size(); i++)
		{
			String categoria = pedidosCsv.get(i).getCategoria();
			if(!categorias.contains(categoria)) {
				categorias.add(categoria);
			}
		}
		System.out.println("Total de Categorias: " + categorias.size());
		}
	
}
