import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;

public class clientehttp {
    public static void main(String[] args){
        final String sDireccion = "https://google.com";

        URL url ;

        try {
            url = new URL(sDireccion);
        } catch (Exception e) {
            System.out.println("Error al crear la URL");
            return;
        }

        String sHost = url.getHost();
        final int iPuerto = 80;

        try (Socket socket = new Socket(sHost, iPuerto)){
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            pw.println("HEAD: "+ url.getPath() + " HTTP/1.1");
            pw.println("Host: "+ sHost);
            pw.println("User-Agent: ClienteHTTP");
            pw.println("Accept: txt/html");
            pw.println("Accept-Language: es");
            pw.println("Conexion: close");
            pw.println("");

            //lectura de respeusta
            InputStream is = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String sLinea;

            while ((sLinea = reader.readLine()) != null){
                System.out.println(sLinea);
            }

            
            
        } catch (Exception e) {
            System.out.println("Error al crear el socket");
            return;
        }


    }

    
}
