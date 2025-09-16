package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloEmpleados;
import Clases.Empleados;
import clase.Estudiante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_EMPLEADOS extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtApe;
	private JTextField txtUs;
	private JTextField txtCon;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;

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
		
		btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(190, 21, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Lista");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(190, 57, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(190, 86, 89, 23);
		contentPane.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 121, 414, 129);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Empleados emp=ae.Buscar(LeerNombre(),LeerApellidos());
		if(emp==null)
		{
			Empleados e1=new Empleados(LeerNombre(), LeerApellidos(), LeerUsuario(), LeerContraseña());
			ae.Añadir(e1);
		}
		else JOptionPane.showMessageDialog(this, "Existe el codigo");	
	}
	String LeerNombre() {
		return txtNom.getText();
	}
	String LeerApellidos() {
		return txtApe.getText();
	}
	String LeerUsuario() {
		return txtUs.getText();
	}
	String LeerContraseña() {
		return txtCon.getText();
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	ArregloEmpleados ae=new ArregloEmpleados();
	private JButton btnNewButton_2;
	void Listado() {
		Imprimir("Nombres\tApellido\tUsuario\tContraseña");
		for (int i=0; i<ae.Tamaño(); i++) {
			Imprimir(""+ae.Obtener(i).getNom()+"\t"+ae.Obtener(i).getApe()+
					"t"+ae.Obtener(i).getUs()+"t"+ae.Obtener(i).getCon());
		}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		Empleados emp= ae.Buscar(LeerUsuario(), LeerContraseña());
		if(emp!=null) {
			Imprimir("Nombres\tApellidos\\tUsuario\tContraseña");
			Imprimir(""+emp.getNom()+"\t"+emp.getApe()+"\t"+emp.getUs()+"\t"+emp.getCon());
		}
		else JOptionPane.showMessageDialog(this, "No existe el Usuario");	
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
		Imprimir("Cantidad de empleados es: " + ae.Tamaño());
	}
}
