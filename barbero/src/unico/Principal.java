package unico;

public class Principal {

	public static void main(String[] args) {
		final int nSillas = 3;
		final int nClientes = 5;
		
		Barberia barberia = new Barberia(nSillas);
		Barbero barbero  = new Barbero(barberia);
		Cliente[] clientes = new Cliente [10];

		barbero.start();

		for (int i = 0; i < nClientes; i++) {
			clientes[i] = new Cliente(barberia, i);
			clientes[i].start();
		}
	}

}
