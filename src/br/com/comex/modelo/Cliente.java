package br.com.comex.modelo;

public class Cliente {
	private static int count = 0;
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidate;
	private String estado;
	
	public Cliente(String nome, String cpf, String telefone, 
			String rua, String numero, String complemento, String bairro, 
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
		if (nome.length() <= 5 || nome == null) {
			throw new IllegalArgumentException("O Nome é um campo obrigatorio e precisa ter mais de 3 letras. Favor cadastrar novamente.");
		} else if (id <= 0) {
			throw new IllegalArgumentException("O id precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
		}else if (telefone.replaceAll("[^0-9]", "").length() < 11 || telefone.replaceAll("[^0-9]", "").length() > 16) {
			throw new IllegalArgumentException("O Telefone precisa ter entre 11 a 16 caracteres. Favor cadastrar novamente.");
		}else if ((cpf.replaceAll("[^0-9]", "").length() < 11 || cpf.replaceAll("[^abc]", "").length() > 14) || cpf == null) {
			throw new IllegalArgumentException("O CPF é um campo obrigatorio e precisa ter entre 11 a 14 caracteres. Favor cadastrar novamente.");
		}else if (rua.replaceAll("[^abc0-9]", "").length() < 5 || rua == null) {
			throw new IllegalArgumentException("O Rua é um campo obrigatorio e precisa ter mais de 5 caracteres. Favor cadastrar novamente.");
		}else if (numero.replaceAll("[^abc0-9]", "").length() < 1 || numero == null) {
			throw new IllegalArgumentException("O Numero é um campo obrigatorio e precisa ter mais de um 1 caracter. Favor cadastrar novamente.");
		}else if (bairro.length() < 1 || bairro == null) {
			throw new IllegalArgumentException("O Bairro é um campo obrigatorio e precisa ter mais de um 1 caracter. Favor cadastrar novamente.");
		}else if (cidate.length() < 1 || cidate == null) {
			throw new IllegalArgumentException("O Cidate é um campo obrigatorio e precisa ter mais de um 1 caracter. Favor cadastrar novamente.");
		}else if (estado.length() != 2 || estado == null) {
			throw new IllegalArgumentException("O Estado é um campo obrigatorio e precisa ter exatamento 2 caracteres. Favor cadastrar novamente.");
		}
		
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



	public String getNumero() {
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
