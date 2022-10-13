package br.com.comex.modelo;

public class Cliente {
	private static int count = 0;
	private long id;
	private String nome;
	private String cpf;
	private String exeCPF = "999.999.999-99";
	private String telefone;
	private String exeTelefone = "(99) 9 9999-9999";
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidate;
	private Estado estado;
	
	
	public Cliente(String nome, String cpf, String telefone, 
			String rua, String numero, String complemento, String bairro, 
			String cidate, Estado estado) {
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
		}else if (Character.isAlphabetic((nome.charAt(0))) != true) {
			throw new IllegalArgumentException("O Nome nao pode começar com numeros.");
		}else if (id <= 0) {
			throw new IllegalArgumentException("O id precisa ser um valor acima e diferente de 0. Favor cadastrar novamente.");
		}else if (telefone.replaceAll("[^0-9]", "").length() < 11 || telefone.replaceAll("[^0-9]", "").length() > 16) {
			throw new IllegalArgumentException("O Telefone precisa ter entre 11 a 16 caracteres. Favor cadastrar novamente.");
		}else if (telefone.charAt(0) != exeTelefone.charAt(0) || (telefone.charAt(3) != exeTelefone.charAt(3)) ||
					(telefone.charAt(4) != exeTelefone.charAt(4)) || (telefone.charAt(6) != exeTelefone.charAt(6)) ||
					(telefone.charAt(11) != exeTelefone.charAt(11))) {
			throw new IllegalArgumentException("O Telefone ser cadastrado com todos os caracteres padroe, segue o exemplo: "+ exeTelefone  +" Favor cadastrar novamente.");
		}else if ((cpf.replaceAll("[^0-9]", "").length() < 11 || cpf.replaceAll("[^abc]", "").length() > 14) || cpf == null) {
			throw new IllegalArgumentException("O CPF é um campo obrigatorio e precisa ter entre 11 a 14 caracteres. Favor cadastrar novamente.");
		}else if (cpf.charAt(3) != exeCPF.charAt(3) || (cpf.charAt(7) != exeCPF.charAt(7)) || (cpf.charAt(11) != exeCPF.charAt(11))) {
			throw new IllegalArgumentException("O CPF precisa ser cadastrado com os caracteres de acordo com esse padrao: " + exeCPF  +" Favor cadastrar novamente.");
		}else if (rua.replaceAll("[^abc0-9]", "").length() < 5 || rua == null) {
			throw new IllegalArgumentException("O Rua é um campo obrigatorio e precisa ter mais de 5 caracteres. Favor cadastrar novamente.");
		}else if (numero.replaceAll("[^abc0-9]", "").length() < 1 || numero == null) {
			throw new IllegalArgumentException("O Numero é um campo obrigatorio e precisa ter mais de um 1 caracter. Favor cadastrar novamente.");
		}else if (bairro.length() < 1 || bairro == null) {
			throw new IllegalArgumentException("O Bairro é um campo obrigatorio e precisa ter mais de um 1 caracter. Favor cadastrar novamente.");
		}else if (cidate.length() < 1 || cidate == null) {
			throw new IllegalArgumentException("O Cidate é um campo obrigatorio e precisa ter mais de um 1 caracter. Favor cadastrar novamente.");
		}else if ((verificaEstado()) || estado == null) {
			throw new ComexException("O Estado é um campo obrigatorio e corresponder com nossa base. Favor cadastrar novamente.");
		}
	}
			
	public boolean verificaEstado() {	
			int contador = 0;
			for(Estado e: Estado.values()) {
				if(this.estado == e) {
					contador +=1;
				}
			}
			if (contador != 0) {
				return false;
			}
			return true;			
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
		
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		 this.id = id;
	}

	public Estado getEstado() {
		return estado;
	}
	
	public String getEstadoString() {
		return String.format("%s", getEstado());
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
	
	@Override
	public String toString() {

		return String.format("Cliente cadastrada: id:%d Nome:%s CPF:%s", this.id, this.nome, this.cpf);
	}
	
	
}
