package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;

public class FrmConsultarPC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConsultarPC frame = new FrmConsultarPC();
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
	public FrmConsultarPC() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 270, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMarca = new JLabel("");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMarca.setBounds(39, 40, 81, 14);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModelo.setBounds(39, 85, 81, 14);
		contentPane.add(lblModelo);
		
		JLabel lblproveedor = new JLabel("");
		lblproveedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblproveedor.setBounds(39, 131, 81, 14);
		contentPane.add(lblproveedor);
		
		JLabel lblMicro = new JLabel("");
		lblMicro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMicro.setBounds(173, 40, 81, 14);
		contentPane.add(lblMicro);
		
		JLabel lblRam = new JLabel("");
		lblRam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRam.setBounds(173, 85, 81, 14);
		contentPane.add(lblRam);
		
		JLabel lblPrecio = new JLabel("");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecio.setBounds(173, 131, 81, 14);
		contentPane.add(lblPrecio);

		lblMarca.setText(view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 0).toString());
		lblModelo.setText(view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 1).toString());
		lblproveedor.setText(view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 2).toString());
		lblMicro.setText(view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 3).toString());
		lblRam.setText(view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 4).toString());
		lblPrecio.setText(view.FrmPrincipal.table.getValueAt(view.FrmPrincipal.table.getSelectedRow(), 5).toString());

	}

}
