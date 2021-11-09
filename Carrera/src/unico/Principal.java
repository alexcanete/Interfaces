package unico;

public class Principal {	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		final int sleep = 1000; 
		final int distancia =10;

		//Crear corredor
		Corredor corredor = new Corredor("Pepe", sleep, distancia);
		Corredor corredor2 = new Corredor("Juan", sleep, distancia);
		Corredor corredor3 = new Corredor("Maria", sleep, distancia);


		//Crear carrera
		corredor.start();
		corredor.join();
		corredor2.start();
		corredor2.join();
		corredor3.start();
		corredor3.join();

		
	}

}
