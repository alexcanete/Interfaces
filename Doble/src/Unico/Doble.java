package Unico;

import java.awt.*;
import java.awt.event.*;

public class Doble extends java.awt.Frame {
	final Color Color_ventana = Color.gray;
	final Color Color_btnAceptar = Color.green;
	final Color Color_error = Color.red;
		

		public static void main(String[] args) {

			
			Doble myapp = new Doble();
			myapp.crearVentana();
			
		}

		
		private void crearVentana() {
			
			
			//cerrar ventana
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
			
			setTitle("Creando componentes");
			setBounds(100, 100, 400, 300);
			setBackground(Color_ventana);
			setLayout(null);
			
			
			crearComponentes();

			setVisible(true);
		}
		
		private void crearComponentes() {
			
			
			Label lblNumero = new Label("Numero: ");
			lblNumero.setBounds(130,100,50,20);
			add(lblNumero);
			
			Label lblEtiqueta = new Label("Escribe un número para saber el doble");
			lblEtiqueta.setBounds(90,150,230,20);
			add(lblEtiqueta);
			
			TextField txtNumero = new TextField();
			txtNumero.setBounds(220,100,90,20);
			add(txtNumero);
		
			
			Button btnDoble = new Button("DOBLE");
			btnDoble.setBounds(160,200,100,40);
			btnDoble.setBackground(Color_btnAceptar);
			add(btnDoble);
			
			//eventos
			
			btnDoble.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				int num = Integer.parseInt(txtNumero.getText())*2;
				lblEtiqueta.setText(num + "");
				//lblEtiqueta.setBounds(205,150,230,20);
				
				System.out.println("has pulsado el boton. Resultado = "+ num);
				}catch(Exception ex) {
					lblEtiqueta.setText("Introduce un numero");
					lblEtiqueta.setAlignment(Label.CENTER);
					lblEtiqueta.setForeground(Color_error);
				}
			}
			});
			
		}
		
	}