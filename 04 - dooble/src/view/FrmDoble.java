package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FrmDoble extends java.awt.Frame {
	
	public static TextField txtNumero;
	public static Label lblEtiqueta;
		

		
		
		public void crearVentana() {
			
			
			//cerrar ventana
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we) {
					controller.CtrlDoble.finalizarApp();
				}
			});
			
			setTitle("Creando componentes");
			setBounds(100, 100, 400, 300);
			setBackground(Theme.Color_ventana);
			setLayout(null);
			
			
			crearComponentes();

			setVisible(true);
		}
		
		private void crearComponentes() {
			
			
			Label lblNumero = new Label("Numero: ");
			lblNumero.setBounds(130,100,50,20);
			add(lblNumero);
			
			lblEtiqueta = new Label("Escribe un número para saber el doble");
			lblEtiqueta.setBounds(90,150,230,20);
			add(lblEtiqueta);
			
			txtNumero = new TextField();
			txtNumero.setBounds(220,100,90,20);
			add(txtNumero);
		
			
			Button btnDoble = new Button("DOBLE");
			btnDoble.setBounds(160,200,100,40);
			btnDoble.setBackground(Theme.Color_btnAceptar);
			add(btnDoble);
			
			Button btnTriple = new Button("Triple");
			btnDoble.setBounds(160,200,100,40);
			btnDoble.setBackground(Theme.Color_btnAceptar);
			add(btnTriple);
			
			//eventos
			
			btnDoble.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				controller.CtrlDoble.calcularDoble();
			}
			});
			
		}
		
	}
