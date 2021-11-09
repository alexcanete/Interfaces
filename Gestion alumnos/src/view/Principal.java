package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import java.awt.Choice;
import java.awt.TextArea;
import java.util.ArrayList;
import java.awt.List;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import model.Persona;

import java.awt.Font;
import java.awt.Toolkit;

public class Principal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	
	//START
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		ArrayList<Persona> Persona1 = new ArrayList<Persona>();
		
		
		
	}

	public Principal() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("fotos\\girar-a-la-izquierda.png"));
		frame.setResizable(false);
		frame.setBounds(100, 100, 454, 446);
		frame.getDefaultCloseOperation();
		frame.getContentPane().setLayout(null);
		
		ButtonGroup grCiclo = new ButtonGroup();

		
		ButtonGroup grTurno = new ButtonGroup();
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(31, 176, 76, 14);
		frame.getContentPane().add(lblComentarios);
		
		TextArea txtComentarios = new TextArea();
		txtComentarios.setBounds(31, 206, 217, 74);
		frame.getContentPane().add(txtComentarios);
		
		JLabel lblSede = new JLabel("Sede");
		lblSede.setBounds(290, 177, 46, 14);
		frame.getContentPane().add(lblSede);
		
		List list = new List();
		list.setBounds(290, 206, 110, 74);
		frame.getContentPane().add(list);
		
		list.add("Sevilla");
		list.add("P.Montano");
		list.add("Granada");
		list.add("Almería");

		
		
		JCheckBox chResponsable = new JCheckBox("\u00BFEs responsable econ\u00F3mico?");
		chResponsable.setBounds(31, 305, 238, 23);
		frame.getContentPane().add(chResponsable);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 347, 438, 2);
		frame.getContentPane().add(separator);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(0, 352, 438, 55);
		frame.getContentPane().add(panel4);
		panel4.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(357, 10, 76, 23);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel4.add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(283, 10, 76, 23);
		panel4.add(btnGuardar);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEditar.setBounds(208, 10, 76, 23);
		panel4.add(btnEditar);
		
		JButton btnPasarIzquierdaFinal = new JButton("|<");
		btnPasarIzquierdaFinal.setHorizontalAlignment(SwingConstants.LEFT);
		btnPasarIzquierdaFinal.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPasarIzquierdaFinal.setBounds(0, 10, 46, 23);
		panel4.add(btnPasarIzquierdaFinal);
		
		JButton btnPasarIzquierda = new JButton("<<");
		btnPasarIzquierda.setHorizontalAlignment(SwingConstants.LEFT);
		btnPasarIzquierda.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPasarIzquierda.setBounds(45, 10, 49, 23);
		panel4.add(btnPasarIzquierda);
		
		JButton btnPasarDerecha = new JButton(">>");
		btnPasarDerecha.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPasarDerecha.setBounds(91, 10, 49, 23);
		panel4.add(btnPasarDerecha);
		
		JButton btnPasarDerechaFinal = new JButton(">|");
		btnPasarDerechaFinal.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPasarDerechaFinal.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPasarDerechaFinal.setBounds(136, 10, 49, 23);
		panel4.add(btnPasarDerechaFinal);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 132, 438, 38);
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(32, 11, 28, 14);
		panel3.add(lblTurno);
		
		JRadioButton btnOnline = new JRadioButton("On-line");
		btnOnline.setBounds(323, 7, 109, 23);
		panel3.add(btnOnline);
		
		JRadioButton btnManiana = new JRadioButton("Ma\u00F1ana");
		btnManiana.setSelected(true);
		btnManiana.setBounds(106, 7, 109, 23);
		panel3.add(btnManiana);
		
		JRadioButton btnTarde = new JRadioButton("Tarde");
		btnTarde.setBounds(210, 7, 109, 23);
		panel3.add(btnTarde);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 95, 438, 31);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JLabel lblCiclo = new JLabel("Ciclo");
		lblCiclo.setBounds(31, 11, 22, 14);
		panel2.add(lblCiclo);
		
		JRadioButton btnDam = new JRadioButton("DAM");
		btnDam.setSelected(true);
		btnDam.setBounds(105, 7, 64, 23);
		panel2.add(btnDam);
		
		JRadioButton btnDaw = new JRadioButton("DAW");
		btnDaw.setBounds(211, 7, 58, 23);
		panel2.add(btnDaw);
		
		JRadioButton btnAsir = new JRadioButton("ASIR");
		btnAsir.setBounds(323, 7, 67, 23);
		panel2.add(btnAsir);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 438, 92);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(30, 32, 51, 14);
		panel1.add(lblNombre_1);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(30, 57, 64, 14);
		panel1.add(lblApellidos);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(104, 29, 86, 20);
		panel1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 50, 86, 20);
		panel1.add(textField_1);
		
		JLabel lblTalla = new JLabel("Talla:");
		lblTalla.setBounds(280, 32, 46, 14);
		panel1.add(lblTalla);
		
		Choice choice = new Choice();
		choice.setBounds(332, 32, 58, 20);
		panel1.add(choice);
		
		
		
	}
}
