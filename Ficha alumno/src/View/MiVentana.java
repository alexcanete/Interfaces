package View;
import java.awt.*;
import java.awt.event.*;

public class MiVentana extends java.awt.Frame{

	public static final Color Color_btnAceptar = Color.GREEN;
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
		
		setTitle("Ficha alumno");
		setBounds(100, 100, 290,320);
		setBackground(Color_ventana);
		setLayout(null);
		setResizable(false);
		
		
		crearComponentes();

		setVisible(true);
	}
	
	private void crearComponentes() {
		Panel panLogin = new Panel();
		panLogin.setLayout(new GridLayout(2,2));
		
		Label lblUsuario = new Label("Usuario: ");
		
		
		Label lblContrasenia = new Label("Contraseña: ");
		
		TextField txtUserName = new TextField();
		
		TextField txtContrasenia = new TextField();
		
		
		
		
		panLogin.add(lblUsuario);
		panLogin.add(txtUserName);
		panLogin.add(lblContrasenia);
		panLogin.add(txtContrasenia);
		panLogin.setBounds(20, 50,200,50);
		add(panLogin);
		
		
		
		Panel pCurso = new Panel();
		Panel pTurno = new Panel();
		
		CheckboxGroup grpCurso = new CheckboxGroup();
		CheckboxGroup grpTurno = new CheckboxGroup();

		
		Label lblCurso = new Label("Curso: ");
		
		Label lblTurno = new Label("Turno: ");

		Checkbox opcDam = new Checkbox("DAM", true, grpCurso);
		Checkbox opcDaw = new Checkbox("DAW", false, grpCurso);
		Checkbox opcAsir = new Checkbox("ASIR", false, grpCurso);
		
		Checkbox opcMañana = new Checkbox("Mañana", true, grpTurno);
		Checkbox opcTarde = new Checkbox("Tarde    ", false, grpTurno);
		
		Checkbox chbResponsable = new Checkbox("Es responsable económico");

		/*
		pCurso.setBackground(Color.RED);
		pTurno.setBackground(Color.BLUE);
		chbResponsable.setBackground(Color.PINK);
		panLogin.setBackground(Color.BLACK);
		*/
		
		pCurso.add(lblCurso);
		pCurso.add(opcDam);
		pCurso.add(opcDaw);
		pCurso.add(opcAsir);
		
		pTurno.add(lblTurno);
		pTurno.add(opcMañana);
		pTurno.add(opcTarde);
		
		pCurso.setBounds(10,120,80,150);
		pTurno.setBounds(150,120,100,150);
		chbResponsable.setBounds(20,260,180,50);
		
		add(pCurso);
		add(pTurno);
		add(chbResponsable);
		

		
		
	}
}
