package comex;

public class Categoria {
	private int id;
	private String nome;
	private boolean status = true;

	public void cadastrarCategoria(int id,String nome, boolean status) {
		this.id = id;
		this.nome = nome;
		this.status = status;
	}
		
	public void setId(int id){
		this.id = id;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public int  getId(){
		return this.id;
	}

	public String getNome(){
		return this.nome;
	}

	public boolean getStatus(){
		return this.status;
	}
	








}

