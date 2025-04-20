package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAgregarP;
	private JButton btnBoleta;
	private JButton btnBorrarP;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnAgregarP = new JButton("Agregar Producto");
			btnAgregarP.setBounds(53, 117, 172, 23);
			contentPane.add(btnAgregarP);
		}
		{
			btnBoleta = new JButton("Boleta");
			btnBoleta.setBounds(53, 83, 172, 23);
			contentPane.add(btnBoleta);
		}
		{
			btnBorrarP = new JButton("Borrar Producto");
			btnBorrarP.setBounds(53, 151, 172, 23);
			contentPane.add(btnBorrarP);
		}
		{
			lblNewLabel = new JLabel("PANADERIA \r\nLUCHO'S");
			lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 27));
			lblNewLabel.setBounds(10, 11, 282, 48);
			contentPane.add(lblNewLabel);
		}
	}
}
