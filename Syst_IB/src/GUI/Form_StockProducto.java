package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Form_StockProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_StockProducto frame = new Form_StockProducto();
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
	public Form_StockProducto() {
		setTitle("Stock de Productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 118, 416, 135);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel = new JLabel("Stock");
		lblNewLabel.setBounds(20, 42, 45, 13);
		contentPane.add(lblNewLabel);
		
		txtStock = new JTextField();
		txtStock.setBounds(119, 39, 96, 19);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
		
		JButton btnNewButton = new JButton("Modificar Stock");
		btnNewButton.setBounds(268, 38, 110, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona Producto");
		lblNewLabel_1.setBounds(10, 10, 110, 13);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Huevo", "Carne", "Arroz"}));
		comboBox.setBounds(130, 9, 110, 19);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Ver producto");
		btnNewButton_1.setBounds(258, 6, 122, 20);
		contentPane.add(btnNewButton_1);

	}
}
