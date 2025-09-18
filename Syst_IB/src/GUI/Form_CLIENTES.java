package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloClientes;
import Clases.Clientes;
import Clases.UbicacionUbigeo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Form_CLIENTES extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtDNI;
	private JTextField txtCelular;
	private JTextField txtDireccion;
	private JButton btnReportar;

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
		setBounds(100, 100, 577, 588);
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
		lblDireccin.setBounds(25, 127, 64, 14);
		contentPane.add(lblDireccin);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(99, 40, 200, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(99, 68, 200, 20);
		contentPane.add(txtNombres);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(99, 11, 122, 20);
		contentPane.add(txtDNI);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(99, 96, 162, 20);
		contentPane.add(txtCelular);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(99, 124, 283, 20);
		contentPane.add(txtDireccion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 276, 503, 186);
		contentPane.add(scrollPane);
		
		txtarea = new JTextArea();
		scrollPane.setViewportView(txtarea);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(401, 43, 103, 55);
		contentPane.add(btnRegistrar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(25, 226, 89, 31);
		contentPane.add(btnReportar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(124, 226, 89, 31);
		contentPane.add(btnAdicionar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(223, 226, 89, 31);
		contentPane.add(btnBuscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(330, 226, 89, 31);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(439, 226, 89, 31);
		contentPane.add(btnEliminar);
		
		cbDepartamento = new JComboBox();
		cbDepartamento.addActionListener(this);
		cbDepartamento.setModel(new DefaultComboBoxModel(new String[] {"", "LIMA", "ICA", "JUNIN"}));
		cbDepartamento.setBounds(53, 176, 113, 22);
		contentPane.add(cbDepartamento);
		
		cbProv = new JComboBox();
		cbProv.addActionListener(this);
		cbProv.setBounds(176, 176, 132, 22);
		contentPane.add(cbProv);
		
		cbDist = new JComboBox();
		cbDist.setBounds(318, 176, 132, 22);
		contentPane.add(cbDist);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setBounds(78, 158, 88, 14);
		contentPane.add(lblDepartamento);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(209, 158, 64, 14);
		contentPane.add(lblProvincia);
		
		JLabel lblDistrito = new JLabel("Distrito");
		lblDistrito.setBounds(365, 158, 64, 14);
		contentPane.add(lblDistrito);

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbProv) {
			do_cbProv_actionPerformed(e);
		}
		if (e.getSource() == cbDepartamento) {
			do_cbDepartamento_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(e);
		}
		if (e.getSource() == btnReportar) {
			do_btnReportar_actionPerformed(e);
		}
	}
	protected void do_btnReportar_actionPerformed(ActionEvent e) 
	{
		txtarea.setText("");
		listado();
	}
	
	//Metodos
		int leerDNI()
		{
			return Integer.parseInt(txtDNI.getText());
		}
		String leerNombre()
		{
			return txtNombres.getText();
		}
		String leerApellido()
		{
			return txtApellidos.getText();
		}
		String leerCelular()
		{
			return txtCelular.getText();
		}
		String leerDireccion()
		{
			return txtDireccion.getText();
		}
		void Imprimir(String s)
		{
			txtarea.append(s+"\n");
		}
	
	//Crear un objeto para acceder a la clase arregloClientes
		ArregloClientes ac = new ArregloClientes();		
		private JTextArea txtarea;
		private JButton btnAdicionar;
		private JButton btnBuscar;
		private JButton btnModificar;
		private JButton btnEliminar;
		private JComboBox cbDepartamento;
		private JComboBox cbProv;
		private JComboBox cbDist;
		void listado()
		{
			Imprimir("DNI\tAPELLIDO\tNOMBRE\tCELULAR\tDIRECCIÓN");
			for (int i=0; i<ac.Tamaño() ; i++)
			{			
				Imprimir(""+ac.Obtener(i).getDni()+"\t"+ac.Obtener(i).getApellidos()+"\t"+
						ac.Obtener(i).getNombres()+"\t"+ac.Obtener(i).getCelular()+"\t"+ac.Obtener(i).getDireccion());			
			}
		}
		
	protected void do_btnAdicionar_actionPerformed(ActionEvent e) 
	{
		Clientes cl = ac.Buscar(leerDNI());
		if(cl == null)
		{
			Clientes c1 = new Clientes(leerDNI(), leerApellido(), leerNombre(), leerCelular(), leerDireccion());
			ac.Adicionar(c1);
		}
		else
			JOptionPane.showMessageDialog(this, "DNI existente");		
	}
	
	protected void do_btnBuscar_actionPerformed(ActionEvent e) 
	{
		txtarea.setText("");
		Clientes cl = ac.Buscar(leerDNI());
		if(cl != null)
		{
			Imprimir("DNI\tAPELLIDO\tNOMBRE\tCELULAR\tDIRECCIÓN");
			Imprimir(""+cl.getDni()+"\t"+cl.getApellidos()+"\t"+cl.getNombres()+"\t"+cl.getCelular()+"\t"+cl.getDireccion());
		}
		else		
			JOptionPane.showMessageDialog(this, "No existe el DNI"); //mensaje de error
		
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) 
	{
		Clientes cl = ac.Buscar(leerDNI());
		if(cl != null)	
		{
			cl.setApellidos(leerApellido());
			cl.setNombres(leerNombre());
			cl.setCelular(leerCelular());
			cl.setDireccion(leerDireccion());
		}			
		else
			JOptionPane.showMessageDialog(this, "No existe el DNI");
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) 
	{
		Clientes cl = ac.Buscar(leerDNI());
		if(cl != null)		
			ac.Eliminar(cl);		
		else
			JOptionPane.showMessageDialog(this, "No existe el DNI");
		
	}
	
	protected void do_cbDepartamento_actionPerformed(ActionEvent e) 
	{		
		String departamento = cbDepartamento.getSelectedItem().toString();
	    cbProv.setModel(UbicacionUbigeo.getProvincias(departamento));	
	}
	
	protected void do_cbProv_actionPerformed(ActionEvent e) 
	{
		String provincia = cbProv.getSelectedItem().toString();
	    cbDist.setModel(UbicacionUbigeo.getDistritos(provincia));
	}
}
