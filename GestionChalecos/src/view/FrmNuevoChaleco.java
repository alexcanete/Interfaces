package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class FrmNuevoChaleco extends JFrame {

	private JPanel contentPane;
	public static JTextField txtModelo;
	public static JTextField txtPrecio;
	public static JTextField txtStock;

	
	
	private FrmNuevoChaleco FrmNuevoChaleco;

					
				
	public FrmNuevoChaleco() {
		FrmNuevoChaleco = this;

		setTitle("Nuevo Chaleco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(37, 25, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(37, 60, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblTalla = new JLabel("Talla");
		lblTalla.setBounds(37, 96, 46, 14);
		contentPane.add(lblTalla);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(140, 96, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setBounds(247, 96, 46, 14);
		contentPane.add(lblStock);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(117, 22, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(187, 94, 39, 17);
		contentPane.add(txtPrecio);
		
		txtStock = new JTextField();
		txtStock.setColumns(10);
		txtStock.setBounds(288, 93, 39, 17);
		contentPane.add(txtStock);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(68, 161, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(204, 161, 89, 23);
		contentPane.add(btnCancelar);
		
		JSpinner spiTalla = new JSpinner();
		spiTalla.setBounds(79, 93, 30, 20);
		contentPane.add(spiTalla);
		
		JSpinner spiColor = new JSpinner();
		spiColor.setBounds(117, 57, 30, 20);
		contentPane.add(spiColor);
		setVisible(true);



		btnGuardar.addActionListener(e -> {
			controller.Controlador.nuevoChaleco();
			try {
				controller.Controlador.executeQuery("SELECT * FROM CHALECO");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			dispose();


		});





		btnCancelar.addActionListener(e -> {
			dispose();

		});
	}
}
