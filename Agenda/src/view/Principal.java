package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.List;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtNombre;
	public static List listNombres;
	
	/**
	 * Launch the application.
	 */
	//START
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
		
	}

	/**
	 * Create the frame.
	 */
	//--------------------------------
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrir = new JButton("ABRIR AGENDA");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = controller.Controlador.abrirFichero();
				controller.Controlador.cargarFichero(file);
			}
		});
		btnAbrir.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnAbrir.setBounds(10, 227, 101, 23);
		contentPane.add(btnAbrir);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(169, 105, 107, 30);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(169, 64, 107, 30);
		contentPane.add(txtNombre);
		
		JButton btnGuardarCambio = new JButton("GUARDAR");
		btnGuardarCambio.setBounds(169, 146, 101, 23);
		contentPane.add(btnGuardarCambio);

		//accion boton guardar
		btnGuardarCambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.Controlador.guardarCambio(txtNombre.getText(), txtNumero.getText());
			}
		});
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(169, 180, 101, 23);
		contentPane.add(btnEditar);
		
		JButton btnGuardar = new JButton("GUARDAR AGENDA");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnGuardar.setBounds(169, 227, 107, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNumero = new JLabel("New label");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setBounds(169, 11, 107, 31);
		contentPane.add(lblNumero);
		
		listNombres = new List();
		listNombres.setBounds(1, 11, 110, 192);
		contentPane.add(listNombres);
	}
}
