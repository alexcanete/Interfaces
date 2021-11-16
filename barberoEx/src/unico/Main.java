package unico;

public class Main {

	public static void main(String[] args) {

		final int nSillas = 4;
		final int nClientes = 5;
		
		Monitor barberia = new Monitor(nSillas);
		Barbero barbero  = new Barbero(barberia);
		Cliente[] clientes = new Cliente [5];

		barbero.start();

		for (int i = 0; i < nClientes; i++) {
			clientes[i] = new Cliente(barberia, i);
			clientes[i].start();
		}
		
		
	}

}
