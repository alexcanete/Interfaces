package ej2;

public class ej2 {
	public static void main(String[] args) throws InterruptedException {

		final int sleep = 1000; // 1 segundo
		final int distancia =10; //distancia en km

		Corredor corredor = new Corredor("Maribel", sleep, distancia); //corredor1
		Corredor corredor2 = new Corredor("Juan", sleep, distancia); //corredor 2
		Corredor corredor3 = new Corredor("Maria", sleep, distancia); //corredor 3

		corredor.start(); //empieza corredor1
		corredor.join(); //espera a que termine corredor1
		corredor2.start(); //empieza corredor2
		corredor2.join(); //espera a que termine corredor2
		corredor3.start(); //empieza corredor3
		corredor3.join(); //espera a que termine corredor3
	}

}
