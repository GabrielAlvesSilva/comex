package br.com.comex.modelo;

public class Produto {
	private static int count = 0;
	private long id;
	private String nome;
	private String descricao;	
	private double precoUnitario;
	
	private int quantidadeEmEstoque;
	private Categoria categoria;
	private int idCategoria;
	private String tipo;
	
	public Produto(String nome, double precoUnitario,	int quantidadeEmEstoque, Categoria categoria, String descricao){
		 id = ++count; 
		 this.nome = nome;  
		 this.precoUnitario = precoUnitario;
		 this.quantidadeEmEstoque = quantidadeEmEstoque;
		 this.categoria = categoria;
		 this.descricao = descricao;
		 this.tipo = "NAO_ISENTO";
		 if (nome.length() <= 5 || nome == null) {
				throw new IllegalArgumentException("O Nome de precisa ter mais de 5 letras e nao pode ficar fazio. Favor cadastrar novamente.");
			}else if (Character.isAlphabetic((nome.charAt(0))) != true) {
				throw new IllegalArgumentException("O Nome nao pode começar com numeros.");
			}else if (precoUnitario <= 0) {
				throw new IllegalArgumentException("O Preco Unitario precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (quantidadeEmEstoque <= 0) {
				throw new IllegalArgumentException("A Quantidade em Estoque precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (categoria == null) {
				throw new IllegalArgumentException("A Categoria é um cambo obrigatorio. Favor cadastrar novamente.");
			}
	}
	
	public Produto(String nome, double precoUnitario,	int quantidadeEmEstoque, int idCategoria, String descricao, String tipo){
		 id = ++count; 
		 this.nome = nome;  
		 this.precoUnitario = precoUnitario;
		 this.quantidadeEmEstoque = quantidadeEmEstoque;
		 this.idCategoria = idCategoria;
		 this.descricao = descricao;
		 this.tipo = tipo;
		 if (nome.length() <= 5 || nome == null) {
				throw new IllegalArgumentException("O Nome de precisa ter mais de 5 letras e nao pode ficar fazio. Favor cadastrar novamente.");
			}else if (Character.isAlphabetic((nome.charAt(0))) != true) {
				throw new IllegalArgumentException("O Nome nao pode começar com numeros.");
			}else if (precoUnitario <= 0) {
				throw new IllegalArgumentException("O Preco Unitario precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (quantidadeEmEstoque <= 0) {
				throw new IllegalArgumentException("A Quantidade em Estoque precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (idCategoria <= 0) {
				throw new IllegalArgumentException("A Categoria é um cambo obrigatorio. Favor cadastrar novamente.");
			}
	}
	
	public Produto(String nome, double precoUnitario,	int quantidadeEmEstoque, int idCategoria, String descricao){
		 id = ++count; 
		 this.nome = nome;  
		 this.precoUnitario = precoUnitario;
		 this.quantidadeEmEstoque = quantidadeEmEstoque;
		 this.idCategoria = idCategoria;
		 this.descricao = descricao;
		 this.tipo = "NAO_ISENTO";
		 if (nome.length() <= 5 || nome == null) {
				throw new IllegalArgumentException("O Nome de precisa ter mais de 5 letras e nao pode ficar fazio. Favor cadastrar novamente.");
			}else if (Character.isAlphabetic((nome.charAt(0))) != true) {
				throw new IllegalArgumentException("O Nome nao pode começar com numeros.");
			}else if (precoUnitario <= 0) {
				throw new IllegalArgumentException("O Preco Unitario precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (quantidadeEmEstoque <= 0) {
				throw new IllegalArgumentException("A Quantidade em Estoque precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (idCategoria <= 0) {
				throw new IllegalArgumentException("A Categoria é um cambo obrigatorio. Favor cadastrar novamente.");
			}
	}
		
	public void cadastraProduto(String nome, double precoUnitario,	int quantidadeEmEstoque, Categoria categoria, String descricao){
		 id = ++count; 
		 this.nome = nome;  
		 this.precoUnitario = precoUnitario;
		 this.quantidadeEmEstoque = quantidadeEmEstoque;
		 this.categoria = categoria;
		 this.descricao = descricao;
		 if (nome.length() <= 5 || nome == null) {
				throw new IllegalArgumentException("O Nome de precisa ter mais de 5 letras e nao pode ficar fazio. Favor cadastrar novamente.");
			}else if (Character.isAlphabetic((nome.charAt(0))) != true) {
				throw new IllegalArgumentException("O Nome nao pode começar com numeros.");
			}else if (precoUnitario <= 0) {
				throw new IllegalArgumentException("O Preco Unitario precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (quantidadeEmEstoque <= 0) {
				throw new IllegalArgumentException("A Quantidade em Estoque precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (categoria == null) {
				throw new IllegalArgumentException("A Categoria é um cambo obrigatorio. Favor cadastrar novamente.");
			}
	}
	
	public void cadastraProduto(String nome, double precoUnitario,	int quantidadeEmEstoque, int idCategoria, String descricao){
		 id = ++count; 
		 this.nome = nome;  
		 this.precoUnitario = precoUnitario;
		 this.quantidadeEmEstoque = quantidadeEmEstoque;
		 this.idCategoria = idCategoria;
		 this.descricao = descricao;
		 if (nome.length() <= 5 || nome == null) {
				throw new IllegalArgumentException("O Nome de precisa ter mais de 5 letras e nao pode ficar fazio. Favor cadastrar novamente.");
			}else if (Character.isAlphabetic((nome.charAt(0))) != true) {
				throw new IllegalArgumentException("O Nome nao pode começar com numeros.");
			}else if (precoUnitario <= 0) {
				throw new IllegalArgumentException("O Preco Unitario precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (quantidadeEmEstoque <= 0) {
				throw new IllegalArgumentException("A Quantidade em Estoque precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
			}else if (idCategoria <= 0) {
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
	
	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
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
	
	public int  getQuantidadeEmEstoque(){
		return this.quantidadeEmEstoque;
	}
	
	public int  getCategoria(){
		return (int) categoria.getId();
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

	public int getIdCategoria() {
		return idCategoria;
	}
	
	@Override
	public String toString() {
		return String.format("id Produto:%d Nome:%s "+ 
				"Preco Unidade:%.2f Quantidade Estoque:%d ID Categoria:%d Descricao:%s", this.id, 
				this.nome, this.precoUnitario, this.quantidadeEmEstoque, this.idCategoria, 
				this.descricao);
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
