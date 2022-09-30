package br.com.comex.main;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estado;

public class MainCliente {

	public static void main(String[] args) {
	//error name
		//Cliente cliente1= new Cliente("Ana", "933.919.930-81", "(45) 9 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
	//error CPF
		//Cliente cliente1= new Cliente("Anabele", "33.919.930-81", "(45) 9 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
	//	Error Telefone
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 9 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
	// Error Rua
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 9 3249-8347", "Rua", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
	//Error Numero
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 9 3249-8347", "Rua Abraham Lincoln", " ", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
	//Error Estado 2 caracteres nao da mais erro depois dessa commit pois foi mudado a verificaçao
		Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 9 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", null);
	//Error nome numero
		//Cliente cliente1= new Cliente("1Anabele", "933.919.930-81", "(45) 9 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
	//Error CPF caracteres
		//Cliente cliente1= new Cliente("Anabele", "933.919.930.81", "(45) 9 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
	//Error Telefone caracteres
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 93249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
	//Sem erro
		//Cliente cliente1= new Cliente("Anabele", "933.919.930-81", "(45) 9 3249-8347", "Rua Abraham Lincoln", "72", "Perto do Semafaro", "Seminário", "Curitiba", Estado.PR);
		cliente1.printCliente();
		
		
	

	}

}
