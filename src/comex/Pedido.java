package comex;

public class Pedido {
	private static int count = 0;
	private int id;
	private String data;
	private Cliente cliente;
	
	public Pedido(String data,Cliente cliente) {
		id = ++count;
		this.data = data;
		this.cliente = cliente;
	}
		
	public void printPedido() {
		System.out.println("Id: " + this.getId() + 
				" Data do Pedido: " + this.getData() + 
				" Nome Cliente: " + this.cliente.getNome());
	}
		
	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
}
