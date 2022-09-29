package br.com.comex.modelo;

public class Categoria {
	private static int count = 0;
	private int id;
	private String nome;
	private Status status;
	
	public Categoria(String nome, Status status) {
		id = ++count;
		this.nome = nome;
		this.status = status;
		if (nome.length() <= 3 || nome == null) {
			throw new IllegalArgumentException("O nome é um campo obrigatorio e precisa ter mais de 3 letras. Favor cadastrar novamente.");
		} else if (id <= 0) {
			throw new IllegalArgumentException("O id precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
		}else if (status != Status.ATIVO && status != Status.INATIVO ) {
			throw new IllegalArgumentException("O status precisa ser ATIVO ou INATIVO. Favor cadastrar novamente.");
		}
		
		
	}
	
	public Categoria(String nome) {
		id = ++count;
		this.nome = nome;
		this.status = Status.ATIVO;
		
		if (nome.length() <= 3 || nome == null) {
			throw new IllegalArgumentException("O nome é um campo obrigatorio e precisa ter mais de 3 letras. Favor cadastrar novamente.");
		}
		
	}
	
	public void getCategoria() {
		System.out.println("Categoria " + this.getNome() + 
				"(" + this.getId() + " - " + 
				this.getStatus() + ")");
	}
	
	public void cadastrarCategoria() {

	}
		
	public int  getId(){
		return this.id;
	}

	public String getNome(){
		return this.nome;
	}

	public Status getStatus(){
		return this.status;
	}
	








}

