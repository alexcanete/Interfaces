package view;

import javax.swing.JButton;
import javax.swing.JDialog;

import controller.controlador;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.ModuleLayer.Controller;
public class FrmProductos extends JDialog {
	
	public FrmProductos () {
		setTitle("GEstión productos");
		setModal(true);
		setBounds(100,100,400,200);
		setLayout(null);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				controlador ctrl = new controlador();
				setVisible(false);
			}
		});
		
		crearComponentes();
		setVisible(true);
	
	}

	public void crearComponentes() {
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(10,50,80,200);
		add(btnCrear);
	}
	
}
