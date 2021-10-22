package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import view.Principal;


public class Controlador {

	public static void abrirArchivo() {
		
		try {
			RandomAccessFile fichero = new RandomAccessFile("nombreFiche.txt", "r");
			byte[] byteLeidos= new byte[(int)fichero.length()];
			fichero.readFully(byteLeidos);
			String sTexto = new String(byteLeidos);
			fichero.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
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
	
	
	public static void cargarArchivo(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String linea = reader.readLine();
			String texto = "";
			while(linea != null) {
				texto += linea + "\n";
				linea = reader.readLine();
			}
			
			view.Principal.textArea.setText(texto);
			reader.close();
		}catch(Exception e) {
			//No conseguimos cargar
			e.printStackTrace();
		}
	
	}
	
	public static void guardarArchivo(File file) {
		boolean success = false;
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file));
			
			fileWriter.write(Principal.textArea.getText());
			fileWriter.flush();
			fileWriter.close();
			success = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String muestraContenido(String archivo) throws FileNotFoundException {
        String cadena = "";
        FileReader filereader = new FileReader(archivo);
        BufferedReader bufferedreader = new BufferedReader(filereader);
        String allText = "";
        
        try {
        	while((cadena = bufferedreader.readLine())!=null) {
                allText += cadena;
        
              
        	}
        	filereader.close();
        	bufferedreader.close();
        	}catch (FileNotFoundException e) {
        		e.printStackTrace();
        	}catch (IOException e) {
        		e.printStackTrace();
        	}
        
        return allText;
    }
	
	public static File guardarComo() {
		File nuevoArchivo = null;
		String sPath;
		String sExtension;
		JFileChooser jChooser = new JFileChooser();
		jChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter filtro =new FileNameExtensionFilter("*.txt, .txt");
		jChooser.setFileFilter(filtro);
		int fileSaveButton = jChooser.showSaveDialog(null);
		
		try {
			nuevoArchivo.createNewFile();
		}catch(IOException e) {
			
		}
		//if (guardarArchivo(nuevoArchivo)) {
			//nuevoArchivo= null;
		//}
		
		
		return nuevoArchivo;
		
		
	}
	
	
	public void nuevo() {
		
	}	
	
	
	

}
