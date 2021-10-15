package controller;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controlador {

	public static int numPreg;
	
	public static void inicio() {
		model.Languages.cargarLenguajes();
		generarNumPregunta();
		String pregunta = model.Languages.eng.get(numPreg);
		
		new view.Principal();
		view.Principal.lPalabra.setText(pregunta);
		
	}
	
	public static void generarNumPregunta() {
		numPreg= (int) Math.random();
	}
	
	public static boolean verificar() {
		boolean resultado = false;
		String respuestauser = view.Principal.lPalabra.getText().toString();
		String respuestaCorrecta = model.Languages.eng.get(numPreg);
		if (respuestauser.equalsIgnoreCase(respuestaCorrecta)) {
			resultado = true;
		}
		return resultado;
	}
	
	
	public static void abrirFichero() {
		JFileChooser selectorFichero = new JFileChooser();
		selectorFichero.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("formato de imagen", "jpg", "bmp", "gif");
		selectorFichero.setFileSelectionMode(imgFilter);
		
		int iBtnFch = selectorFichero.showOpenDialog(null);
		
		if (iBtnFch!= JFileChooser.CANCEL_OPTION) {
			File fileName = selectorFichero.getSelectedFile();
			if(fileName!= null & !fileName.getName().equals("")) {
				System.out.println(fileName.getAbsolutePath());
			}
			
		}
	}
	
	
	
}

