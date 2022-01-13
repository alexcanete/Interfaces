package view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import model.Pc;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JTable table;
	public static ArrayList<Pc> listaPc;


	
	public FrmPrincipal() {
		listaPc = new ArrayList<Pc>();
		setResizable(false);
		setTitle("CANETE");
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

		btnActualizar.addActionListener(e -> {
			System.out.println("Actualizar");
			try {
				controller.Controlador.CargarTabla();
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

		
		
		JMenuItem btnEditar = new JMenuItem("Editar");
		menPc.add(btnEditar);

		
		
		JMenuItem btnBorrar = new JMenuItem("Borrar");
		menPc.add(btnBorrar);
		
		JMenuItem btnConsultar = new JMenuItem("Consultar");
		menPc.add(btnConsultar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		scrollPane.setViewportView(table);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setRowSelectionAllowed(true);


		btnNuevo.addActionListener(e ->{
			if(dbms.Database.comprobarConexion()==true) {
				FrmNuevoPC frmNuevo = new FrmNuevoPC();
				frmNuevo.setVisible(true);
			}

		});


		btnConsultar.addActionListener(e->{
			if(table.getSelectedRow()!=-1) {
				FrmConsultarPC frmConsultarPC = new FrmConsultarPC();
				frmConsultarPC.setVisible(true);			

			}
			
		});

		
		btnBorrar.addActionListener(e ->{
			if(table.getSelectedRow()!=-1) {
				FrmBorrar frmBorrar = new FrmBorrar();
				frmBorrar.setVisible(true);
			}
			
		});
	

		btnEditar.addActionListener(e->{
			if(table.getSelectedRow()!=-1) {
				FrmEditarPC frmEditarPC = new FrmEditarPC();
				frmEditarPC.setVisible(true);
			}			
		});
			
		
		
		
	}



	



	



	

}
