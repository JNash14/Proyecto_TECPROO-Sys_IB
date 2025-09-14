package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Form_CLIENTES extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_CLIENTES frame = new Form_CLIENTES();
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
	public Form_CLIENTES() {
		setTitle("CLIENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Apellidos:");
		lblNewLabel.setBounds(25, 43, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(25, 71, 64, 14);
		contentPane.add(lblNombres);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(25, 14, 64, 14);
		contentPane.add(lblDni);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(25, 99, 64, 14);
		contentPane.add(lblCelular);
		
		JLabel lblDireccin = new JLabel("Dirección");
		lblDireccin.setBounds(25, 124, 64, 14);
		contentPane.add(lblDireccin);
		
		textField = new JTextField();
		textField.setBounds(99, 40, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 68, 200, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 11, 122, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(99, 96, 162, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(99, 121, 283, 20);
		contentPane.add(textField_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 243, 503, 186);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(395, 49, 103, 49);
		contentPane.add(btnRegistrar);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setBounds(25, 183, 89, 31);
		contentPane.add(btnReportar);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(124, 183, 89, 31);
		contentPane.add(btnAdicionar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(223, 183, 89, 31);
		contentPane.add(btnBuscar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(330, 183, 89, 31);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(439, 183, 89, 31);
		contentPane.add(btnEliminar);

	}
}
