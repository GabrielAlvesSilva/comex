package comex;

public class MainPedido {

	public static void main(String[] args) {
		Cliente cliente1= new Cliente("Ana", "933.919.930-81", "(45) 3249-8347", "Rua Abraham Lincoln", 72, "Perto do Semafaro", "Seminário", "Curitiba", "PR");
		
		Pedido pedido1 = new Pedido("21-09-2022", cliente1);

		
		pedido1.printPedido();
		
		
		Cliente cliente2= new Cliente("Eli", "376.286.810-77", "(45) 3141-7844", "Travessa Leão Trauczynski", 37, "Perto da Panificadora", "Tatuquara", "Curitiba", "PR");

		
		Pedido pedido2 = new Pedido("15-09-2000", cliente2);

		
		pedido2.printPedido();
		
		Cliente cliente3= new Cliente("Gabi", "246.347.000-34", "(45) 3677-7211", "Rua Daisy Luci Berno", 37, "Perto da PUC", "Parolin", "Curitiba", "PR");
		
		Pedido pedido3 = new Pedido("29-08-2021", cliente3);

		
		pedido3.printPedido();
		
	}

}