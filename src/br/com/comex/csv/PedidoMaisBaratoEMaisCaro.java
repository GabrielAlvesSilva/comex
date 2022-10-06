package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class PedidoMaisBaratoEMaisCaro {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorpedidos = new LeitorPedidosCsv();
		List<PedidoCsv> pedidosCsv = leitorpedidos.lerPedidoCsv();
		double menorvalor = 10000000;
		int imenor = 0;
		double maiorvalor = 0;
		int imaior = 0;
		for(int i = 0; i < pedidosCsv.size(); i++)
		{
			if(menorvalor > (Double.parseDouble(pedidosCsv.get(i).getPreco()) * Double.parseDouble(pedidosCsv.get(i).getQuantidade()))){
				menorvalor = Double.parseDouble(pedidosCsv.get(i).getPreco());
				imenor = i;
			}
			
			if(maiorvalor < (Double.parseDouble(pedidosCsv.get(i).getPreco()) * Double.parseDouble(pedidosCsv.get(i).getQuantidade()))) {
				maiorvalor = (Double.parseDouble(pedidosCsv.get(i).getPreco()) * Double.parseDouble(pedidosCsv.get(i).getQuantidade()));
				imaior = i;
			}
		}
		System.out.println("Venda mais barata: "+ pedidosCsv.get(imenor).getPreco() + " Produto: "+ pedidosCsv.get(imenor).getProduto());
		System.out.println("Venda mais cara: "+ pedidosCsv.get(imaior).getPreco() +" Produto: "+ pedidosCsv.get(imaior).getProduto());
		
		
		String cpf ="09551130401";
	    cpf = cpf.replaceAll("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)", "$1.$2.$3-$4");
	    System.out.println(cpf);
	    
	}

}


