package br.com.comex.modelo;

public class Categoria {
	private static int count = 0;
	private long id;
	private String nome;
	private Status status;
	
	public Categoria(String nome, Status status) {
		id = ++count;
		this.nome = nome;
		this.status = status;
		if (nome.length() <= 3 || nome == null) {
			throw new IllegalArgumentException("O nome é um campo obrigatorio e precisa ter mais de 3 letras. Favor cadastrar novamente.");
		}else if (Character.isAlphabetic((nome.charAt(0))) != true) {
			throw new IllegalArgumentException("O Nome nao pode começar com numeros.");
		}else if (id <= 0) {
			throw new IllegalArgumentException("O id precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
		}else if (status != Status.ATIVA && status != Status.INATIVA ) {
			throw new IllegalArgumentException("O status precisa ser ATIVO ou INATIVO. Favor cadastrar novamente.");
		}
		
		
	}
	
	public Categoria(String nome) {
		id = ++count;
		this.nome = nome;
		this.status = Status.ATIVA;
		
		if (nome.length() <= 3 || nome == null) {
			throw new IllegalArgumentException("O nome é um campo obrigatorio e precisa ter mais de 3 letras. Favor cadastrar novamente.");
		}
		
	}
	
	@Override
	public String toString() {
		return String.format("Categoria cadastrada: %d %s %s", this.id, this.nome, this.getStatusString());
	}

	public void cadastrarCategoria() {

	}
		
	public long  getId(){
		return this.id;
	}

	public String getNome(){
		return this.nome;
	}
	
	public Status getStatus(){
		return this.status;
	}
	
	public String getStatusString() {
		return String.format("%s", getStatus());
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	








}

