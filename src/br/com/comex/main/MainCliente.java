package br.com.comex.main;

import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {
	//error name
		//Cliente cliente1= new Cliente("Ana", "933.919.930-81", "(45) 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
	//error CPF
		//Cliente cliente1= new Cliente("Anabele", "33.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
	//	Error Telefone
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
	// Error Rua
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 93249-8347", "Rua", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
	//Error Numero
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", " ", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
	//Error Estado
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "R");
	//Error nome numero
		//Cliente cliente1= new Cliente("1Anabele", "933.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
	//Error CPF caracteres
		//Cliente cliente1= new Cliente("Anabele", "933.919.930.81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
	//Error Telefone caracteres
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
	//Sem erro
		Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", "PR");
		cliente1.printCliente();
		
		
	

	}

}
