package view;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import java.awt.*;

	

	public class ventana extends JFrame {
	
		private static final String[] colorNombre = {"ROJO", "AZUL", ""};
		
		final Color Color_ventana = new Color(100, 100, 100);
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ventana myapp = new ventana();
			myapp.crearVentana();
		}
	
		
	private void crearVentana() {
			
			
			//cerrar ventana
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we) {
					controller.controlador.salir();
				}
			});
	
			setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
			
			setTitle("Cambiando colores");
			setBounds(100, 100, 290,320);
			getContentPane().setBackground(Color_ventana);
			setLayout(null);
			setResizable(false);
			
			
			
			crearComponentes();
	
			setVisible(true);
		}
	private void crearComponentes() {
		
		List lstcFondo = new List();
		List lstcLetras = new List();
		
		lstcFondo.add("ROJO");
		lstcFondo.add("VERDE");
		lstcFondo.add("AMARILLO");
		lstcFondo.add("NEGRO");
		
		
		lstcLetras.add("BLANCO");
		lstcLetras.add("AZULO");
		lstcLetras.add("NEGRO");
		
		
		lstcFondo.setBounds(30,100,80,100);
		lstcLetras.setBounds(140,100,80,100);
		add(lstcFondo);
		add(lstcLetras);
		
	
		Button btnMensaje = new Button("Mensaje");
		btnMensaje.setBounds(20,150,80,100);
		
		btnMensaje.addActionListener( event -> {
			String sValor = JOptionPane.showInputDialog(null, "Introduzca precio", "100");
		});
		
		
		add(btnMensaje);
		
		lstcFondo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
		if(lstcFondo.getSelectedItem()=="ROJO") {
			getContentPane().setBackground(Color.red);
		}
	}	
			
});
		
		lstcLetras.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
		if(lstcLetras.getSelectedItem()=="BLANCO") {
			getContentPane().setForeground(Color.WHITE);
		}
	}	
			
});
		
		Button btnVentana = new Button("Ventana");
		btnVentana.setBounds(100, 200, 80, 40);
		add(btnVentana);
		
		btnVentana.addActionListener(event -> {
			view.FrmProductos frmPro = new view.FrmProductos();
			frmPro.crearComponentes();
		});
		
	}
	
	}
