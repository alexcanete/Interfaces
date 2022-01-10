import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCP {
    
    private static final int PUERTO = 6000;
	private static final String HOST = "localhost";


    public ClienteTCP(){
        try {
            Socket skCliente= new Socket(HOST, PUERTO);
            InputStream aux = skCliente.getInputStream();
            DataInputStream flujo = new DataInputStream(aux);
            System.out.println("Mensaje recibido");
            System.out.println(flujo.readUTF());
            skCliente.close();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ClienteTCP();
	}


}
