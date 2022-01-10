package controller;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import model.Persona;

public class Controlador {

	public static String sArchivo ="";
	public static File abrirFichero() {
		File fileName = null;
		JFileChooser selectorFichero = new JFileChooser();
		selectorFichero.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		int iBtnFch = selectorFichero.showOpenDialog(null);
		
		if (iBtnFch!= JFileChooser.CANCEL_OPTION) {
			fileName = selectorFichero.getSelectedFile();
			if(fileName!= null & !fileName.getName().equals("")) {
				System.out.println(fileName.getAbsolutePath());
				sArchivo=fileName.getAbsolutePath();
			}
			
		}
		return fileName;
	}
	
	public static ArrayList <Persona> cargarFichero(File sArchivo) {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		try {
			Persona loadedPersona;
			BufferedReader reader = new BufferedReader(new FileReader(sArchivo));
			String linea = reader.readLine();
			String[] dataPersona;
			
			while (linea!= null) {
				dataPersona = linea.split("#");
				loadedPersona = new Persona(dataPersona[0], dataPersona[1]);
				listaPersonas.add(loadedPersona);
				view.Principal.listNombres.add(loadedPersona.getsNombre());
				linea = reader.readLine();
			}
			reader.close();
			
			
		}catch (Exception e) {
			view.Principal.listNombres.add("error");
			listaPersonas=null;
		}
		
		return listaPersonas;
		
	}

    public static void guardarCambio(String text, String text2) {
		// TODO Auto-generated method stub
		//guardar cambios

		

		
    }
	
	
	
}
