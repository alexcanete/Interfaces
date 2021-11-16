package unico;

public class Barbero extends Thread{

	private Monitor barberia;

	public Barbero(Monitor barberia) {
		this.barberia = barberia;
	}

	public void run() {
		while (true) {
			try {
				barberia.barberoDormido();
				
				Thread.sleep(1000);
				barberia.acaba();
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			;
		}
	}
}
