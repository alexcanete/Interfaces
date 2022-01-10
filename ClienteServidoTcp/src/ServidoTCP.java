import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidoTCP {

	private static final int PUERTO = 6000;
	private static final int MAXClientes = 3;

	

	public ServidoTCP() {
		try {
			ServerSocket skServidor = new ServerSocket(PUERTO);
			System.out.println("Servidor TCP iniciado en el puerto " + PUERTO);
			for (int i = 0; i < MAXClientes; i++) {
				Socket skCliente= skServidor.accept();
				System.out.println("Sirvo a "+ i);
				OutputStream aux= skCliente.getOutputStream();
				DataOutputStream flujo = new DataOutputStream(aux);
				flujo.writeUTF("Hola cliente " + i);
				skCliente.close();

			}
		System.out.println("Finalizado con los clientes");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ServidoTCP();
		
	}
}
