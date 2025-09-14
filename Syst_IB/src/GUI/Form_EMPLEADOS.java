package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Form_EMPLEADOS extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtApe;
	private JTextField txtUs;
	private JTextField txtCon;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_EMPLEADOS frame = new Form_EMPLEADOS();
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
	public Form_EMPLEADOS() {
		setTitle("Empleados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNom = new JTextField();
		txtNom.setBounds(66, 8, 86, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtApe = new JTextField();
		txtApe.setBounds(66, 33, 86, 20);
		contentPane.add(txtApe);
		txtApe.setColumns(10);
		
		txtUs = new JTextField();
		txtUs.setBounds(66, 58, 86, 20);
		contentPane.add(txtUs);
		txtUs.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setBounds(10, 86, 56, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCon = new JTextField();
		txtCon.setBounds(66, 83, 86, 20);
		contentPane.add(txtCon);
		txtCon.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(190, 21, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Lista");
		btnNewButton_3.setBounds(190, 57, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(190, 86, 89, 23);
		contentPane.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 121, 414, 129);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		
	}
}
