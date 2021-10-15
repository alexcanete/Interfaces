package controller;

import java.awt.Label;

import view.Theme;

public class CtrlDoble {
	public static void finalizarApp() {
			System.exit(0);
		}
	public static void calcularDoble() {
		try {
			int num = Integer.parseInt(view.FrmDoble.txtNumero.getText())*2;
			
			System.out.println("has pulsado el boton. Resultado = "+ num);
			}catch(Exception ex) {
				view.FrmDoble.lblEtiqueta.setText("Introduce un numero");
				view.FrmDoble.lblEtiqueta.setAlignment(Label.CENTER);
				view.FrmDoble.lblEtiqueta.setForeground(Theme.Color_error);
			}
	}
	
	}
	
