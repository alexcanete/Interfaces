package view;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			controller.Controlador.crearFichero();
			controller.Controlador.leerFichero();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
