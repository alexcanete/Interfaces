package View;
import java.awt.*;
import java.awt.event.*;

public class MiVentana extends java.awt.Frame{

	final Color Color_ventana = Color.green;
	final Color Color_usuario = Color.yellow;
	final Color Color_contrasenia = Color.white;
	
	
	final Font fuente_normal = new Font("Arial", Font.PLAIN , 12);
	final Font fuente_negrita = new Font("Arial", Font.BOLD , 12);
	
	
	public static void main(String[] args) {
		MiVentana myapp = new MiVentana();
		myapp.crearVentana();
	}
	
	
	
	private void crearVentana() {
		
		
		//cerrar ventana
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				Controller.Controlador.salir();
			}
		});

		setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
		
		setTitle("Creando componentes");
		setBounds(100, 100, 600,400);
		setBackground(Color_ventana);
		setLayout(null);
		
		
		crearComponentes();

		setVisible(true);
	}
	
	private void crearComponentes() {
	
		TextArea txtComentarios = new TextArea();
		
		CheckboxGroup grpFormaPago = new CheckboxGroup();
		
		Checkbox opcRembolso = new Checkbox("Reembolso", true, grpFormaPago);
		Checkbox opcTarjeta = new Checkbox("Tarjeta", false, grpFormaPago);
		Checkbox opcBizzum = new Checkbox("Bizzum", false, grpFormaPago);
		
		opcRembolso.setBounds(140,80,100,20);
		opcTarjeta.setBounds(140, 100, 100, 20);
		opcBizzum.setBounds(140,120, 100, 20);
		txtComentarios.setBounds(20,50,100,50);

		
		add(txtComentarios);
		add(opcRembolso);
		add(opcTarjeta);
		add(opcBizzum);
	}
}
