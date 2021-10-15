package View;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MiVentana extends JFrame {

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
		getContentPane().setBackground(Color_ventana);
		setLayout(null);
		setResizable(false);
		
		
		
		crearComponentes();

		setVisible(true);
	}
	
	private void crearComponentes() {
		JPanel panLogin = new JPanel();
		panLogin.setLayout(new GridLayout(2,2));
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		
		
		JLabel lblContrasenia = new JLabel("Contraseña: ");
		
		TextField txtUserName = new TextField();
		
		TextField txtContrasenia = new TextField();
		
		
		
		
		panLogin.add(lblUsuario);
		panLogin.add(txtUserName);
		panLogin.add(lblContrasenia);
		panLogin.add(txtContrasenia);
		panLogin.setBounds(20, 20,200,50);
		add(panLogin);
		
		
		
		JPanel pCurso = new JPanel();
		JPanel pTurno = new JPanel();
		
		CheckboxGroup grpCurso = new CheckboxGroup();
		CheckboxGroup grpTurno = new CheckboxGroup();

		
		JLabel lblCurso = new JLabel("Curso: ");
		
		JLabel lblTurno = new JLabel("Turno: ");

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
		
		pCurso.setBounds(10,100,80,150);
		pTurno.setBounds(150,100,100,150);
		chbResponsable.setBounds(20,230,180,50);
		pCurso.setBackground(Color_ventana);
		pTurno.setBackground(Color_ventana);
		panLogin.setBackground(Color_ventana);
		
		
		add(pCurso);
		add(pTurno);
		add(chbResponsable);
		

		
		
	}
}
