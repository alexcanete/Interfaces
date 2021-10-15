package unico;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame{
	
	final Color Color_ventana = Color.GRAY;
	final Color Color_btnAceptar = Color.green;

	
	

	public static void main(String[] args) {

		
		Login myapp = new Login();
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
		setLayout(new BorderLayout());
		
		
		crearComponentes();

		setVisible(true);
	}
	
	private void crearComponentes() {
		Panel panCentro = new Panel();
		panCentro.setLayout(new GridLayout(2,2));
		
		Label lblUsuario = new Label("Usuario: ");
		
		
		Label lblContrasenia = new Label("Contraseña: ");
		
		TextField txtUserName = new TextField();
		
		TextField txtContrasenia = new TextField();
		
		Button btnAceptar = new Button("ACEPTAR");
		btnAceptar.setBackground(Color_btnAceptar);
		
		
		panCentro.add(lblUsuario);
		panCentro.add(txtUserName);
		panCentro.add(lblContrasenia);
		panCentro.add(txtContrasenia);
		add(btnAceptar, BorderLayout.SOUTH);

		add(panCentro);
		
		
	}
	
}
