package br.com.comex.modelo;

public class Cliente {
	private static int count = 0;
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidate;
	private String estado;
	
	public Cliente(String nome, String cpf, String telefone, 
			String rua, int numero, String complemento, String bairro, 
			String cidate, String estado) {
		id = ++count;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidate = cidate;
		this.estado = estado;
		
	}
	
	public void printCliente() {
		System.out.println("Id: " + this.id + 
				" Nome: " + this.nome + 
				" CPF: " + this.cpf +
				" Telefone: " + this.telefone +
				" Rua: " +  this.rua +
				" Numero: " + this.numero +
				" Complemento: " + this.complemento +
				" Bairro: " + this.bairro +
				" Cidade: " + this.cidate +
				" Estado: " + this.estado);
	}
		
	public int getId() {
		return id;
	}



	public String getEstado() {
		return estado;
	}



	public String getCpf() {
		return cpf;
	}



	public String getTelefone() {
		return telefone;
	}



	public String getRua() {
		return rua;
	}



	public int getNumero() {
		return numero;
	}



	public String getComplemento() {
		return complemento;
	}



	public String getNome() {
		return nome;
	}



	public String getBairro() {
		return bairro;
	}



	public String getCidate() {
		return cidate;
	}
	
	
	
	
}
