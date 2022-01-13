package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.List;
import javax.swing.SwingConstants;

public class FrmNuevoPC extends JFrame {

	private JPanel contentPane;
	public static JTextField txtPrecio;
	public static JLabel lblMarcaSeleccionada;
	public static JComboBox comboboxListProveedor;
	public static JComboBox comboboxListMicro;
	public static JComboBox comboboxListRam;

	
	
	private FrmNuevoPC FrmNuevoPC;
	public static JTextField txtModelo;

					
				
	public FrmNuevoPC() {
		setResizable(false);
		FrmNuevoPC = this;

		setTitle("Nuevo PC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 379, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(37, 25, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(37, 71, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblMicro = new JLabel("Micro");
		lblMicro.setBounds(37, 114, 39, 14);
		contentPane.add(lblMicro);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(247, 114, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblRam = new JLabel("Ram");
		lblRam.setBounds(140, 114, 30, 14);
		contentPane.add(lblRam);
		
		txtPrecio = new JTextField();
		txtPrecio.setToolTipText("");
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(290, 112, 39, 17);
		contentPane.add(txtPrecio);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(68, 161, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(204, 161, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblHP = new JLabel("HP");
		lblHP.setHorizontalAlignment(SwingConstants.CENTER);
		lblHP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHP.setBounds(100, 17, 20, 20);
		lblHP.setOpaque(true);
		lblHP.setBackground(java.awt.Color.RED);
		contentPane.add(lblHP);

	
		JLabel lblLn = new JLabel("LN");
		lblLn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLn.setBounds(130, 17, 20, 20);
		lblLn.setOpaque(true);
		lblLn.setBackground(java.awt.Color.GREEN);
		contentPane.add(lblLn);
		
		JLabel lblAs = new JLabel("AS");
		lblAs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAs.setBounds(160, 17, 20, 20);
		lblAs.setOpaque(true);
		lblAs.setBackground(java.awt.Color.BLUE);
		contentPane.add(lblAs);
		
		JLabel lblAc = new JLabel("AC");
		lblAc.setHorizontalAlignment(SwingConstants.CENTER);
		lblAc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAc.setBounds(190, 17, 20, 20);
		lblAc.setOpaque(true);
		lblAc.setBackground(java.awt.Color.YELLOW);
		contentPane.add(lblAc);
		
		lblMarcaSeleccionada = new JLabel("NULL");
		lblMarcaSeleccionada.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarcaSeleccionada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMarcaSeleccionada.setBounds(247, 17, 30, 30);
		contentPane.add(lblMarcaSeleccionada);

		
		//hacer click en Label
		lblHP.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lblMarcaSeleccionada.setText("HP");
				
			}
		});

		lblLn.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lblMarcaSeleccionada.setText("LN");
				
			}
		});

		lblAs.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lblMarcaSeleccionada.setText("AS");
				
			}
		});

		lblAc.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lblMarcaSeleccionada.setText("AC");
				
			}
		});

		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(93, 69, 64, 17);
		contentPane.add(txtModelo);
		
		JLabel lblProveedor = new JLabel("Proveedor");
		lblProveedor.setBounds(190, 71, 70, 14);
		contentPane.add(lblProveedor);
		

		String listProveedor [] = { "MediaMarkt", "Alibaba", "eBay", "Amazon" };
		comboboxListProveedor = new JComboBox(listProveedor);
		comboboxListProveedor.setBounds(257, 68, 98, 17);
		contentPane.add(comboboxListProveedor);

		String listMicro [] = { "i3", "i5", "i7" };
		comboboxListMicro = new JComboBox(listMicro);
		comboboxListMicro.setBounds(80, 111, 40, 17);
		contentPane.add(comboboxListMicro);

		String listRam [] = { "4GB", "8GB", "16GB" };
		comboboxListRam = new JComboBox(listRam);
		comboboxListRam.setBounds(170, 111, 50, 17);
		contentPane.add(comboboxListRam);
		
		
		setVisible(true);
		



		btnGuardar.addActionListener(e -> {
			if(lblMarcaSeleccionada.getText().equals("NULL")) {
				JOptionPane.showMessageDialog(null, "Seleccione una marca");
			
			}else if(txtModelo.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Ingrese un modelo");

			}else if(txtPrecio.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Ingrese un precio");


			}else {
				
				try {
				logic.Logic.insert();

			} catch (Exception e1) {
				//dialog
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			dispose();
			}

		});





		btnCancelar.addActionListener(e -> {
			dispose();

		});
	}
}
