package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloProducto;
import Clases.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_PRODUCTOS extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_4;
	private JTextField txtCod;
	private JTextField txtNomP;
	private JTextField txtPreV;
	private JTextField txtPreC;
	private JTextField txtCate;
	private JTextField txtCant;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnLista;
	private JButton btnAgregar;
	private JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_PRODUCTOS frame = new Form_PRODUCTOS();
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
	public Form_PRODUCTOS() {
		setTitle("Registro Productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(23, 28, 16, 2);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(63, 88, 46, 19);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre Producto");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(63, 113, 130, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Precio Venta");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(299, 76, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("Precio costo");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(299, 108, 83, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Categoria");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(61, 138, 83, 24);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Cantidad");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(299, 139, 83, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_4 = new JLabel("Productos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(33, 26, 130, 38);
		contentPane.add(lblNewLabel_4);
		
		txtCod = new JTextField();
		txtCod.setBounds(178, 89, 86, 20);
		contentPane.add(txtCod);
		txtCod.setColumns(10);
		
		txtNomP = new JTextField();
		txtNomP.setColumns(10);
		txtNomP.setBounds(178, 112, 86, 20);
		contentPane.add(txtNomP);
		
		txtPreV = new JTextField();
		txtPreV.setColumns(10);
		txtPreV.setBounds(388, 75, 86, 20);
		contentPane.add(txtPreV);
		
		txtPreC = new JTextField();
		txtPreC.setColumns(10);
		txtPreC.setBounds(388, 107, 86, 20);
		contentPane.add(txtPreC);
		
		txtCate = new JTextField();
		txtCate.setColumns(10);
		txtCate.setBounds(178, 138, 86, 20);
		contentPane.add(txtCate);
		
		txtCant = new JTextField();
		txtCant.setColumns(10);
		txtCant.setBounds(388, 137, 86, 20);
		contentPane.add(txtCant);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 268, 554, 152);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnLista = new JButton("Lista");
		btnLista.addActionListener(this);
		btnLista.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnLista.setBounds(23, 199, 89, 23);
		contentPane.add(btnLista);
		
		btnAgregar = new JButton("Añadir");
		btnAgregar.addActionListener(this);
		btnAgregar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnAgregar.setBounds(121, 199, 89, 23);
		contentPane.add(btnAgregar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnBuscar.setBounds(220, 199, 89, 23);
		contentPane.add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnEliminar.setBounds(319, 199, 89, 23);
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnModificar.setBounds(418, 199, 89, 23);
		contentPane.add(btnModificar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == btnLista) {
			do_btnLista_actionPerformed(e);
		}
	}
	int LeerCodigo() {
		return Integer.parseInt(txtCod.getText());
	}
	String LeerProductos() {
		return txtNomP.getText();
	}
	String LeerCategoria() {
		return txtCate.getText();
	}
	double LeerPrecioV() {
		return Double.parseDouble(txtPreV.getText());
	}
	double LeerPrecioC() {
		return Double.parseDouble(txtPreC.getText());
	}
	int LeerCantidad() {
		return Integer.parseInt(txtCant.getText());
	}
	void Imprimir(String s) {
		 txtS.append(s+"\n");
	}
	
	ArregloProducto prod=new ArregloProducto();
	private JButton btnEliminar;
	private JButton btnModificar;
	void Listado() {
		Imprimir("Codigo\tNombre\tCategoria\tPrecio Ven.\tPrecio Cos.\tCantidad");
		for(int i=0;i <prod.Tamaño();i++){
			Imprimir(""+prod.Obtener(i).getCod()+"\t"+prod.Obtener(i).getNomp()+
					"\t"+prod.Obtener(i).getCate()+"\t"+prod.Obtener(i).getPreven()+
					"\t"+prod.Obtener(i).getPrecos()+"\t"+prod.Obtener(i).getCant());
			}		
	}
	protected void do_btnLista_actionPerformed(ActionEvent e) {
	txtS.setText("");
	Listado();
	Imprimir("\nCantidad de Productos: "+prod.Tamaño());
}
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		
	
		Producto pro =prod.Buscar(LeerProductos(),LeerCategoria());
	if(pro==null) {
		Producto pr1 = new Producto(LeerCodigo(),LeerProductos(),LeerCategoria(), 
				LeerPrecioV(), LeerPrecioC(),LeerCantidad());
		prod.Añadir(pr1);
	}
	else {
		JOptionPane.showMessageDialog(this, "Producto existente");		
}
	
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Producto pr =prod.Buscar(LeerProductos(),LeerCategoria());
		if(pr!=null) 
		{
			Imprimir("Codigo\tNombre\tCategoria\tPrecio Ven.\tPrecio Cos.\tCantidad");
			Imprimir(""+pr.getCod()+"\t"+pr.getNomp()+
					"\t"+pr.getCate()+"\t"+pr.getPreven()+
					"\t"+pr.getPrecos()+"\t"+pr.getCant());
		}
		else {
			JOptionPane.showMessageDialog(this, "No existe el producto ");
	}
		}

	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		Producto pr= prod.Buscar(LeerProductos(),LeerCategoria());
		if(pr !=null)
		{
		 pr.setCod(LeerCodigo());	
		 pr.setNomp(LeerProductos());
		 pr.setCate(LeerCategoria());	
		 pr.setPrecos(LeerPrecioC());
		 pr.setPreven(LeerPrecioV());
		 pr.setCant(LeerCantidad());	
		}
		else 
			JOptionPane.showConfirmDialog(this, "No existe el Producto");
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		Producto pr = prod.Buscar(LeerProductos(),LeerCategoria());
		if(pr !=null) 
		{
			prod.Eliminar(pr);
		}
		else 
			JOptionPane.showConfirmDialog(this, "No existe el Producto");
	}
}
