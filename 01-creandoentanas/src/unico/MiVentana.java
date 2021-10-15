package unico;
import java.awt.*;
public class MiVentana extends java.awt.Frame{

	public MiVentana(){
		
		Color fondoVentana =new Color(12, 35, 190);
		Color TextoError = Color.red;
		Color TextoNormal = Color.gray;
		
		setTitle("ejemplo de herencia");
		//setBounds(400, 200, 100, 100);
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int ancho =600;
		int alto =400;
		int x = (screensize.width - ancho) /2;
		int y = (screensize.height - alto) /2;
		
		
		
		
		
		
		setVisible(true);
		setBackground(java.awt.Color.blue);
		//setForeground();
		
	}

}
