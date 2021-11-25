package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Casa;

public class Principal {

	public static void main(String[] args) throws Exception {

		
		
		final String Query="";
		//guardarObj();
		leerObj();
		dbms.DataBase.conectar();
		controller.Controlador.createQuery(Query);
		controller.Controlador.executeQuery(Query);
	}

	//Read the file object casas.dat
	public static void leerObj() {
		try {
			FileInputStream fis = new FileInputStream("casas.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Casa> casas = (ArrayList<Casa>) ois.readObject();
			for (Casa casa : casas) {
				System.out.println(casa);
			}
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	



	//save model Casa en BD

}
