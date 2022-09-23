package comex;

public class ItemPedido {
	private static int count = 0;
	private int id;
	private int quantidade;
	private Produto produto;
	private Pedido pedido;
	private double desconto;
	private String tipoDesconto;

	public ItemPedido() {
		id = ++count;
	}
	
	public void cadastrarItemPedido(int quantidade, Produto produto, Pedido pedido, String tipoDesconto) {
		this.quantidade = quantidade;
		this.produto = produto;
		this.pedido = pedido;
		this.tipoDesconto = tipoDesconto;
		
	}
	
	public void cadastrarItemPedido(int quantidade, Produto produto, Pedido pedido) {
		this.quantidade = quantidade;
		this.produto = produto;
		this.pedido = pedido;		
	}
	
	
	public double calculaDesconto() {
		if(this.tipoDesconto == "PROMOCAO") {
			return 0.2;
		}else if (this.quantidade > 10 ) {
			return 0.1;
		}
		return 1.0;
	}
	
	public double precoComDesconto() {
		double valor;
		valor = (this.produto.valorProdutoComImposto() - (this.produto.valorProdutoComImposto()* this.calculaDesconto()));
		return valor;
	}
		
	public String tipoDesconto() {
		if(calculaDesconto() == 0.2 ) {
			return (" PROMOCAO DESCONTO DE 20%: " + (this.produto.valorProdutoComImposto()* this.calculaDesconto()));
		}else if(calculaDesconto() == 0.1) {
			return (" QUANTIDADE DESCONTO DE 10%: "+ (this.produto.valorProdutoComImposto()* this.calculaDesconto()));
		}else {
			return (" NENHUM");
		}
		
	}		
		
	public double totalSemDesconto() {
		double valor;
		valor = (this.getQuantidade() * this.produto.valorProdutoComImposto());
		return valor;
	}
		
	public void printIItemPedido() {
		System.out.println("/////////////////////////////////////////////////////////"
				+ "\nId do Item: " + this.id + " Id do Pedido: " + this.pedido.getId() + " Data do Pedido: " + this.pedido.getData() + 
				"\nQuantidade de Itens: " + this.quantidade + " Nome do item: " + this.produto.getNome() + " Valor Unitario: " + this.produto.valorProdutoComImposto() +
				" Desconto: " + this.tipoDesconto() + 
				"\n------------------------------------------------");
		
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public String getTipoDesconto() {
		return tipoDesconto;
	}
	
	
	

	
}
