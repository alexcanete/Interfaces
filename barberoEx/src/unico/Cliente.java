package unico;

public class Cliente extends Thread{
    private Monitor barberia;
	private int cliente;
	private boolean cortePelo = false;

	public Cliente(Monitor barberia, int cliente) {
		this.barberia = barberia;
		this.cliente = cliente;
	}

    public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				cortePelo = barberia.entrar(cliente);
				
				if (cortePelo) {
					Thread.sleep(1000);
				} else {
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
			}
			;
		}
	}

}
