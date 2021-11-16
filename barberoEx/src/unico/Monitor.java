package unico;

public class Monitor extends Thread {
	private int nSillasEspera;
	private int nSillasEsperaOcupadas = 0;
	private boolean sillaBarberoOcupada = false;
	private boolean termina = false;
	private boolean barberoDormido = false;

	public Monitor(int nSillasEspera) {
		this.nSillasEspera = nSillasEspera;
	}

	public synchronized boolean entrar(int clienteId)
			throws InterruptedException {
		if (nSillasEsperaOcupadas == nSillasEspera) {

			System.out.println("---- El cliente " + clienteId + " se va sin cortar el pelo");
			return false;
		} else {
		
			nSillasEsperaOcupadas++;
			System.out.println("---- El cliente " + clienteId + " se sienta en la silla de espera");
			while (sillaBarberoOcupada) {
				wait();
			}

			
			nSillasEsperaOcupadas--;

			
			sillaBarberoOcupada = true;
			termina = false;

			if (barberoDormido) {   
				System.out.println("---- El cliente " + clienteId + " despierta al barbero");
				notifyAll();
			}

			System.out.println("---- El cliente " + clienteId + " se sienta en la silla de barbero");
			while (!termina) {
				wait();
			}

			sillaBarberoOcupada = false;

			notifyAll();

			System.out.println("---- El cliente " + clienteId + " se va con el pelo cortado");
			return true;
		}
	}

	public synchronized void barberoDormido() throws InterruptedException {
		barberoDormido = true;
		while (!sillaBarberoOcupada) {
			System.out.println("-- Barbero esperando cliente --");
			wait();
		}
		barberoDormido = false;
		System.out.println("-- Barbero cortando el pelo --");
	}

	public synchronized void acaba() {
		termina = true;
		System.out.println("-- Barbero termina de cortar el pelo --");
		notifyAll();
	}

}
