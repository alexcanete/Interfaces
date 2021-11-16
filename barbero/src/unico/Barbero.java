package unico;

public class Barbero extends Thread{

	private Barberia barberia;

	public Barbero(Barberia barberia) {
		this.barberia = barberia;
	}

	public void run() {
		while (true) {
			try {
				barberia.esperarCliente();
				
				Thread.sleep(5000);
				barberia.acabarCorte();
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			;
		}
	}
}
