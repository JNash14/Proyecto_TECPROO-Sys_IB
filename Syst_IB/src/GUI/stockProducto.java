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

public class stockProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStock;
	private JTextField txtProducto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stockProducto frame = new stockProducto();
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
	public stockProducto() {
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
		txtStock.setBounds(75, 39, 96, 19);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
		
		JButton btnNewButton = new JButton("Modificar Stock");
		btnNewButton.setBounds(197, 38, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Producto");
		lblNewLabel_1.setBounds(10, 10, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(75, 7, 96, 19);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);

	}
}
