package comex;

public class Produto {
	private static int count = 0;
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private double quantidadeEmEstoque;
	private Categoria categoria;

		
	public void cadastraProduto(String nome, double precoUnitario,	double quantidadeEmEstoque, Categoria categoria,String descricao){
		 id = ++count; 
		 this.nome = nome;  
		 this.precoUnitario = precoUnitario;
		 this.quantidadeEmEstoque = quantidadeEmEstoque;
		 this.categoria = categoria;
		 this.descricao = descricao;
		 if (nome.length() <= 5 || nome == null) {
				throw new IllegalArgumentException("O Nome de precisa ter mais de 5 letras e nao pode ficar fazio. Favor cadastrar novamente.");
			} else if (precoUnitario <= 0) {
				throw new IllegalArgumentException("O Preco Unitario precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (quantidadeEmEstoque <= 0) {
				throw new IllegalArgumentException("A Quantidade em Estoque precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (categoria == null) {
				throw new IllegalArgumentException("A Categoria é um cambo obrigatorio. Favor cadastrar novamente.");
			}
	}
	
	public void getProduto() {
		System.out.println("Id: " + this.id + " Nome: " + 
			this.nome + " Preço Unitario: " + this.precoUnitario +
			" Quantidade em Estoque: " + this.quantidadeEmEstoque +
			" Categoria: " +  this.categoria.getNome());
	}
	
	public void RelatorioProduto() {
		System.out.println("Id: " + this.id + " Nome: " + 
			this.nome + " Preço Unitario: " + this.precoUnitario +
			" Quantidade em Estoque: " + this.quantidadeEmEstoque +
			" Categoria: " +  this.categoria.getNome() +
			" Descricao Produto: " + this.descricao +
			" Valor em Estoque: " +  String.format("%.2f", this.valorTotalProdutoEstoque()) +
			" Imposto Unitario: " + String.format("%.2f", this.impostosProduto()));
	}
	
	public int getId(){
		return this.id;
	}
	
	public String  getNome(){
		return this.nome;
	}
	
	public String  getDescricao(){
		return this.descricao;
	}
	
	public double  getPrecoUnitario(){
		return this.precoUnitario;
	}
	
	public double  getQuantidadeEmEstoque(){
		return this.quantidadeEmEstoque;
	}
	
	public void  getCategoria(){
		categoria.getCategoria();
	}
	
	public void setId(int id){
		 this.id = id;
	}
	
	public void  setNome(String nome){
		 this.nome = nome;
	}
	
	public void  setDescricao(String descricao){
		 this.descricao = descricao;
	}
	
	public void  setPrecoUnitario(double precoUnitario){
		 this.precoUnitario = precoUnitario;
	}
	
	public void  setQuantidadeEmEstoque(double quantidadeEmEstoque){
		 this.quantidadeEmEstoque= quantidadeEmEstoque;
	}
	
	public void  setCategoria(Categoria categoria){
		this.categoria = categoria;
	}
	
	public double valorTotalProdutoEstoque() {
		return ((this.precoUnitario + this.impostosProduto()) * this.quantidadeEmEstoque);
	}
	
	public double impostosProduto() {
		return (this.precoUnitario * 0.4);
	}
	
	public double valorProdutoComImposto() {
		return (this.precoUnitario + this.impostosProduto());
	}
	
	
	
	
}
