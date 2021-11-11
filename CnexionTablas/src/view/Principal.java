package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Principal extends JFrame {

	private JPanel contentPane;
	public static JTable table;
	public static JLabel lblInfo;

	/**
	 * Launch the application.
	 */
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDataBase = new JMenu("DataBase");
		menuBar.add(mnDataBase);
		
		JMenuItem mntmConex = new JMenuItem("Conexi\u00F3n");
		mnDataBase.add(mntmConex);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnDataBase.add(mntmLogin);
		
		JSeparator separator = new JSeparator();
		mnDataBase.add(separator);
		
		JMenuItem mntmTest = new JMenuItem("Test");
		mnDataBase.add(mntmTest);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		lblInfo = new JLabel("");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblInfo, BorderLayout.SOUTH);
		
		JList lista = new JList();
		contentPane.add(lista, BorderLayout.WEST);


		
		mntmConex.addActionListener(e -> {
			new Conexion();

		});

		mntmLogin.addActionListener(e -> {
			new frmLogin();
		});
		
		mntmTest.addActionListener(e-> {
			dbms.DataBase.comprobarConexion();
			new frmTest();
		});

		


		
			
	}

}
