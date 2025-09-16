package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglo.ArregloEstudiantes;
import clase.Estudiante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.awt.event.ActionEvent;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNombre;
	private JLabel lblNota;
	private JLabel lblNota_1;
	private JTextField txtCod;
	private JTextField txtNom;
	private JTextField txtN1;
	private JTextField txtN2;
	private JButton btnNewButton;
	private JButton btnAdicionar;
	private JButton btnBuscar;
	private JButton btnModificar;
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
					v1 frame = new v1();
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
	public v1() {
		setTitle("ESTUDIANTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 36, 46, 14);
		contentPane.add(lblNombre);
		
		lblNota = new JLabel("Nota 1");
		lblNota.setBounds(200, 11, 46, 14);
		contentPane.add(lblNota);
		
		lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(200, 36, 46, 14);
		contentPane.add(lblNota_1);
		
		txtCod = new JTextField();
		txtCod.setBounds(90, 8, 86, 20);
		contentPane.add(txtCod);
		txtCod.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(90, 33, 86, 20);
		contentPane.add(txtNom);
		
		txtN1 = new JTextField();
		txtN1.setColumns(10);
		txtN1.setBounds(287, 8, 86, 20);
		contentPane.add(txtN1);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(287, 33, 86, 20);
		contentPane.add(txtN2);
		
		btnNewButton = new JButton("LISTAR");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(0, 61, 67, 23);
		contentPane.add(btnNewButton);
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(66, 61, 100, 23);
		contentPane.add(btnAdicionar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(165, 61, 73, 23);
		contentPane.add(btnBuscar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(238, 61, 104, 23);
		contentPane.add(btnModificar);
		
		btnNewButton_1 = new JButton("ELIMINAR");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(335, 61, 89, 23);
		contentPane.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 414, 155);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		Estudiante es= ae.Buscar(LeerCodigo());
		if(es!=null)
		{
			Imprimir ("Codigo\tNombre\tNota 2\tPromedio");
			Imprimir (""+es.getCod()+"\t" + es.getNom() + "\t" + es.getN1()+
					"\t" + es.getN2()+ "\t" + es.Promedio());
		}
		else JOptionPane.showMessageDialog(this, "No existe el codigo");
		
	}
	int LeerCodigo() {
		return Integer.parseInt(txtCod.getText());
	}
	String LeerNombre() {
		return txtNom.getText();
	}
	double LeerN1() {
		return Double.parseDouble(txtN1.getText());
	}
	double LeerN2() {
		return Double.parseDouble(txtN2.getText());
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	ArregloEstudiantes ae=new ArregloEstudiantes();
	void Listado() {
		Imprimir("Codigo\tNombre\tNota 1\tNota 2\tPromedio");
		for (int i=0;i<ae.Tamaño();i++) {
			Imprimir(""+ae.Obtener(i).getCod()+ "\t" +ae.Obtener(i).getNom()+
					"\t" +ae.Obtener(i).getN1()+"\t" +ae.Obtener(i).getN2()+
					"\t" +ae.Obtener(i).Promedio());
		}
	}
	
	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
		Imprimir("Cantidad de estudiantes" + ae.Tamaño());
	    
		Imprimir("El promedio general es:" + ae.PromedioGeneral());
		
	}
	
	
	protected void do_btnAdicionar_actionPerformed(ActionEvent e) {
		Estudiante es=ae.Buscar(LeerCodigo());
		if(es==null)
		{
			Estudiante e1=new Estudiante(LeerCodigo(), LeerNombre(), LeerN1(), LeerN2());
			ae.Adicionar(e1);
		}
		else JOptionPane.showMessageDialog(this, "Existe el codigo");
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		Estudiante es=ae.Buscar(LeerCodigo());
		if(es!=null) ae.Eliminar(es);
		else JOptionPane.showMessageDialog(this, "No existe el codigo");
		
		
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		Estudiante es=ae.Buscar(LeerCodigo());
		if(es!=null)
		{
			es.setNom(LeerNombre());
			es.setN1(LeerN1());
			es.setN2(LeerN2());
		}
		else JOptionPane.showMessageDialog(this, "No existe el codigo");
	}
}





