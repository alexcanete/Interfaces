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

public class FrmSalir extends JDialog {

	private final JPanel contentPanel = new JPanel();


	FrmSalir frmSalir = new FrmSalir();

	public FrmSalir() {
		setTitle("Salir");
		setBounds(100, 100, 323, 198);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMensaje = new JLabel("\u00BFRealmente desea salir?");
			lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
			lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblMensaje.setBounds(0, 11, 307, 69);
			contentPanel.add(lblMensaje);
		}
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmSalir.setVisible(false);
			}
		});
		btnCancelar.setBounds(44, 108, 89, 23);
		contentPanel.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(166, 108, 89, 23);
		contentPanel.add(btnAceptar);
	}
}
