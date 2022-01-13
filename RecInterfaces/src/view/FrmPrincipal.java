package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable tablaPC;

	
	public FrmPrincipal() {
		setResizable(false);
		setTitle("Tienda de PACO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 423);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menGestion = new JMenu("Gesti\u00F3n");
		menuBar.add(menGestion);
		
		JMenu menConexion = new JMenu("Conexi\u00F3n");
		menGestion.add(menConexion);
		
		JMenuItem btnDatabase = new JMenuItem("Database");
		menConexion.add(btnDatabase);

		btnDatabase.addActionListener(e ->{
			FrmDataBase frmDataBase = new FrmDataBase();
			frmDataBase.setVisible(true);
		});
		
		
		JMenuItem btnLogin = new JMenuItem("Login");
		menConexion.add(btnLogin);

		btnLogin.addActionListener(e ->{
			FrmLogin frmLogin = new FrmLogin();
			frmLogin.setVisible(true);
		});
		
		JMenuItem btnActualizar = new JMenuItem("Actualizar");
		menGestion.add(btnActualizar);

		//Temporal para probar el conexion
		btnActualizar.addActionListener(e -> {
			System.out.println("Actualizar");
			try {
				dbms.Database.conectarCasa();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		JSeparator separator = new JSeparator();
		menGestion.add(separator);
		
		JMenuItem btnSalir = new JMenuItem("Salir");
		menGestion.add(btnSalir);
		
		btnSalir.addActionListener(e->{
			FrmSalir Frame = new FrmSalir();
		});
		
		JMenu menPc = new JMenu("PC");
		menuBar.add(menPc);
		
		JMenuItem btnNuevo = new JMenuItem("Nuevo");
		menPc.add(btnNuevo);

		btnNuevo.addActionListener(e ->{
			FrmNuevoPC frmNuevo = new FrmNuevoPC();
			frmNuevo.setVisible(true);
		});
		
		JMenuItem btnEditar = new JMenuItem("Editar");
		menPc.add(btnEditar);

		btnEditar.addActionListener(e->{
			FrmEditarPC frmEditarPC = new FrmEditarPC();
			frmEditarPC.setVisible(true);	
		});
		
		JMenuItem btnBorrar = new JMenuItem("Borrar");
		menPc.add(btnBorrar);
		
		JMenuItem btnConsultar = new JMenuItem("Consultar");
		menPc.add(btnConsultar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.EAST);
		
		tablaPC = new JTable();
		contentPane.add(tablaPC, BorderLayout.CENTER);
		
	}

}
