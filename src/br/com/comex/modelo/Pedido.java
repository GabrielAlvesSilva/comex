package br.com.comex.modelo;

public class Pedido {
	private static int count = 0;
	private long id;
	private String data;
	private Cliente cliente;
	long idcliente;
	
	public Pedido(String data,Cliente cliente) {
		id = ++count;
		this.data = data;
		this.cliente = cliente;
	}
	
	public Pedido(String data,long idcliente) {
		id = ++count;
		this.data = data;
		this.idcliente = idcliente;
	}
		
	public void printPedido() {
		System.out.println("Id: " + this.getId() + 
				" Data do Pedido: " + this.getData() + 
				" Nome Cliente: " + this.cliente.getNome());
	}
	
	public void setIdcliente(long idcliente) {
		 this.idcliente = idcliente ;
	}
	
	public long getIdcliente() {
		 return idcliente;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		 this.id = id ;
	}

	public String getData() {
		return data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public String getClientNome() {
		return this.cliente.getNome();
	}
	
	@Override
	public String toString() {
		
		return String.format("Pedido cadastrada: id:%d Data:%s ClienteID:%d", this.id, this.data, this.idcliente);
	}
}
