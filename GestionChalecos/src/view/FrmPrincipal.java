package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JTable;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuItem itmNuevo;
	public static JTable table;
	public static String sSeleccionado;


	public FrmPrincipal() {
		setTitle("Gestor de chalecos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mGestion = new JMenu("Gesti\u00F3n");
		menuBar.add(mGestion);
		
		JMenu mConexion = new JMenu("Conexi\u00F3n");
		mGestion.add(mConexion);
		
		JMenuItem itmDataBase = new JMenuItem("DataBase");
		mConexion.add(itmDataBase);
		
		JMenuItem itmLogin = new JMenuItem("Login");
		mConexion.add(itmLogin);
		
		JMenuItem itmActualizar = new JMenuItem("Actualizar");
		mGestion.add(itmActualizar);
		
		JSeparator separator = new JSeparator();
		mGestion.add(separator);
		
		JMenuItem itmSalir = new JMenuItem("Salir");
		mGestion.add(itmSalir);
		
		JMenu mChaleco = new JMenu("Chaleco");
		menuBar.add(mChaleco);
		
		itmNuevo = new JMenuItem("Nuevo");
		mChaleco.add(itmNuevo);
		
		JMenuItem itmEditar = new JMenuItem("Editar");
		mChaleco.add(itmEditar);
		
		JMenuItem itmBorrar = new JMenuItem("Borrar");
		mChaleco.add(itmBorrar);
		
		JMenuItem itmConsultar = new JMenuItem("Consultar");
		mChaleco.add(itmConsultar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollBar scrollBar = new JScrollBar();
		contentPane.add(scrollBar, BorderLayout.EAST);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);

		itmDataBase.addActionListener(e -> {
			new FrmDataBase();

		});

		itmLogin.addActionListener(e -> {
			new FrmLogin();
		});

		itmActualizar.addActionListener(e -> {
			try {

				controller.Controlador.executeQuery("SELECT * FROM CHALECO");

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		itmSalir.addActionListener(e -> {
			new FrmSalir();

		});

		itmNuevo.addActionListener(e -> {
			new FrmNuevoChaleco();

		});

		//texto del cuadro seleccionado de la tabla
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				sSeleccionado = table.getValueAt(table.getSelectedRow(), 0).toString();
			}
		});

		itmBorrar.addActionListener(e -> {
			new FrmBorrar();

		});
		
		
	}


}
