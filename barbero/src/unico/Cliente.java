package unico;

public class Cliente extends Thread {

    private Barberia barberia;
	private int clienteId;
	private boolean cortePelo = false;

	public Cliente(Barberia barberia, int clienteId) {
		this.barberia = barberia;
		this.clienteId = clienteId;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
				cortePelo = barberia.entrar(clienteId);
				
				if (cortePelo) {
					
					Thread.sleep(25000);
				} else {
					
					Thread.sleep(4000);
				}
			} catch (InterruptedException e) {
			}
			;
		}
	}
}
