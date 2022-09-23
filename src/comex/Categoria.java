package comex;

public class Categoria {
	private static int count = 0;
	private int id;
	private String nome;
	private boolean status = true;
	
	public Categoria(String nome, boolean status) {
		id = ++count;
		this.nome = nome;
		this.status = status;
	}
	
	public void getCategoria() {
		System.out.println("Categoria " + this.getNome() + 
				"(" + this.getId() + " - " + 
				this.getStatus() + ")");
	}
	
	public void cadastrarCategoria() {

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

