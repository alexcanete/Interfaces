package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class FrmBorrar extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private FrmBorrar FrmBorrar;


	public FrmBorrar() {

		FrmBorrar = this;
		setTitle("Borrar");
		setBounds(100, 100, 323, 198);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMensaje = new JLabel("\u00BFRealmente desea borrar el chaleco?");
			lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
			lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblMensaje.setBounds(0, 11, 307, 69);
			contentPanel.add(lblMensaje);
		}
		JButton btnCancelar = new JButton("Cancelar");
		JButton btnAceptar = new JButton("Aceptar");


		setVisible(true);

		
		btnCancelar.addActionListener(e -> {
			dispose();

		});

		
		btnCancelar.setBounds(44, 108, 89, 23);
		contentPanel.add(btnCancelar);
		
		btnAceptar.setBounds(166, 108, 89, 23);
		contentPanel.add(btnAceptar);

		btnAceptar.addActionListener(e -> {
			String Query= "DELETE FROM CHALECO WHERE id_chaleco = " + view.FrmPrincipal.sSeleccionado ;
			try {
				controller.Controlador.executeQuery(Query);
				controller.Controlador.executeQuery("COMMIT");
				dispose();



			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		
	}
}
