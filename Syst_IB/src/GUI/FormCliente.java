package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloClientes;
import Clases.Clientes;
import Clases.UbicacionUbigeo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class FormCliente extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblDni;
	private JTextField txtDNI;
	private JTextField txtApellido;
	private JLabel lblNewLabel;
	private JLabel lblNombres;
	private JTextField txtNombre;
	private JTextField txtCelular;
	private JLabel lblCelular;
	private JLabel lblDireccin;
	private JTextField txtDireccion;
	private JLabel lblDepartamento;
	private JLabel lblProvincia;
	private JLabel lblDistrito;
	private JButton btnRegistrar;
	private JComboBox cbDist;
	private JComboBox cbProv;
	private JComboBox cbDepartamento;
	private JButton btnReportar;
	private JButton btnAdicionar;
	private JButton btnBuscar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormCliente dialog = new FormCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormCliente() {
		setModal(true);
		setTitle("Registro Cliente");
		setBounds(100, 100, 582, 549);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(28, 26, 64, 14);
		contentPanel.add(lblDni);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(102, 23, 122, 20);
		contentPanel.add(txtDNI);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(102, 52, 200, 20);
		contentPanel.add(txtApellido);
		
		lblNewLabel = new JLabel("Apellidos:");
		lblNewLabel.setBounds(28, 55, 64, 14);
		contentPanel.add(lblNewLabel);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(28, 83, 64, 14);
		contentPanel.add(lblNombres);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(102, 80, 200, 20);
		contentPanel.add(txtNombre);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(102, 108, 162, 20);
		contentPanel.add(txtCelular);
		
		lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(28, 111, 64, 14);
		contentPanel.add(lblCelular);
		
		lblDireccin = new JLabel("Dirección");
		lblDireccin.setBounds(28, 139, 64, 14);
		contentPanel.add(lblDireccin);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(102, 136, 283, 20);
		contentPanel.add(txtDireccion);
		
		lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setBounds(81, 170, 88, 14);
		contentPanel.add(lblDepartamento);
		
		lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(219, 170, 64, 14);
		contentPanel.add(lblProvincia);
		
		lblDistrito = new JLabel("Distrito");
		lblDistrito.setBounds(368, 170, 64, 14);
		contentPanel.add(lblDistrito);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(404, 55, 103, 55);
		contentPanel.add(btnRegistrar);
		
		cbDist = new JComboBox();
		cbDist.setBounds(321, 188, 132, 22);
		contentPanel.add(cbDist);
		
		cbProv = new JComboBox();
		cbProv.addActionListener(this);
		cbProv.setBounds(179, 188, 132, 22);
		contentPanel.add(cbProv);
		
		cbDepartamento = new JComboBox();
		cbDepartamento.addActionListener(this);
		cbDepartamento.setModel(new DefaultComboBoxModel(new String[] {"", "LIMA", "ICA", "JUNIN"}));
		cbDepartamento.setBounds(56, 188, 113, 22);
		contentPanel.add(cbDepartamento);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(28, 238, 89, 31);
		contentPanel.add(btnReportar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(127, 238, 89, 31);
		contentPanel.add(btnAdicionar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(226, 238, 89, 31);
		contentPanel.add(btnBuscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(333, 238, 89, 31);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(442, 238, 89, 31);
		contentPanel.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 290, 505, 190);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
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
	protected void do_btnReportar_actionPerformed(ActionEvent e) {
		txtS.setText("");
		listado();
	}
	
	//Metodos para leer
			int leerDNI()
			{
				return Integer.parseInt(txtDNI.getText());
			}
			String leerNombre()
			{
				return txtNombre.getText().toUpperCase();
			}
			String leerApellido()
			{
				return txtApellido.getText().toUpperCase();
			}
			int leerCelular()
			{
				return Integer.parseInt(txtCelular.getText());
			}
			String leerDireccion()
			{
				return txtDireccion.getText().toUpperCase();
			}
			void Imprimir(String s)
			{
				txtS.append(s+"\n");
			}
			
	//Crear un objeto para acceder a la clase arregloClientes
	ArregloClientes ac = new ArregloClientes();
	
	void listado()
	{
		Imprimir("DNI\tAPELLIDO\tNOMBRE\tCELULAR\tDIRECCIÓN");
		for (int i=0; i<ac.Tamaño() ; i++)
		{			
			Imprimir(""+ac.Obtener(i).getDni()+"\t"+ac.Obtener(i).getApellidos()+"\t"+
					ac.Obtener(i).getNombres()+"\t"+ac.Obtener(i).getCelu()+"\t"+ac.Obtener(i).getDireccion());			
		}
	}
	
	void limpiar()
	{
		txtApellido.setText("");
		txtNombre.setText("");
		txtCelular.setText("");
		txtDireccion.setText("");
		txtDNI.setText("");	
		txtS.setText("");
	}
	
	protected void do_btnAdicionar_actionPerformed(ActionEvent e) {
		Registrar_Adicionar();
	}
	
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		try 
		{			
			Clientes cl = ac.Buscar(leerDNI());
			if(cl != null)
			{
				limpiar();
				Imprimir("DNI\tAPELLIDO\tNOMBRE\tCELULAR\tDIRECCIÓN");
				Imprimir(""+cl.getDni()+"\t"+cl.getCelu()+"\t"+cl.getApellidos()+"\t"+cl.getNombres()+"\t"+cl.getDireccion());
			}
			else	
			{
				JOptionPane.showMessageDialog(this, "No existe el DNI"); //mensaje de error
				limpiar();
				txtDNI.requestFocusInWindow();
			}
							
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Ingrese un DNI válido.");
		}				
	}
	
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		try 
		{
			Clientes cl = ac.Buscar(leerDNI());
			if(cl != null)	
			{	
				if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCelular.getText().isEmpty() ||
						txtDireccion.getText().isEmpty()) 
				{
				    JOptionPane.showMessageDialog(this, "Complete todos los campos obligatorios");
				    return;
				}
				else
				{
					cl.setApellidos(leerApellido());
					cl.setNombres(leerNombre());					
					cl.setDireccion(leerDireccion());
					try {
						if (String.valueOf(leerCelular()).length() != 9) {
				            JOptionPane.showMessageDialog(this, "El celular debe tener 9 dígitos");
				            return;
				        }
						else
							cl.setCelu(leerCelular());
						JOptionPane.showMessageDialog(this, "Modificado correctamente");
						limpiar();
						listado();

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(this, "El celular debe contener solo números.");
					}
				}												
			}			
			else
				JOptionPane.showMessageDialog(this, "No existe el DNI");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Ingrese un DNI válido.");
		}
		
	}
	
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		try 
		{
			int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar al cliente?");
			if (opcion == JOptionPane.YES_OPTION)
			{
				Clientes cl = ac.Buscar(leerDNI());
				if(cl != null)
				{
					ac.Eliminar(cl);
					JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente");
					limpiar();
					listado();
				}
				else
					JOptionPane.showMessageDialog(this, "No existe el DNI");
			}			
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Ingrese un DNI válido.");
		}
		
	}
	
	protected void do_cbDepartamento_actionPerformed(ActionEvent e) {
		String departamento = cbDepartamento.getSelectedItem().toString();
	    cbProv.setModel(UbicacionUbigeo.getProvincias(departamento));
	}
	protected void do_cbProv_actionPerformed(ActionEvent e) {
		String provincia = cbProv.getSelectedItem().toString();
	    cbDist.setModel(UbicacionUbigeo.getDistritos(provincia));
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		Registrar_Adicionar();				
	}
	
	private void Registrar_Adicionar()
	{
		try 
		{			
			if (txtDNI.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || 
				txtCelular.getText().isEmpty() || txtDireccion.getText().isEmpty()) 
			{
	            JOptionPane.showMessageDialog(this, "Complete todos los campos obligatorios");
	            return;
	        }
						
			// Validar longitud de DNI 
	        if (String.valueOf(leerDNI()).length() != 8) {
	            JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos");
	            return;
	        }
	        
	        // Validar longitud de Celular
	        if (String.valueOf(leerCelular()).length() != 9) {
	            JOptionPane.showMessageDialog(this, "El celular debe tener 9 dígitos");
	            return;
	        }
	        
	        Clientes cl = ac.Buscar(leerDNI());
			if(cl == null)
			{
				Clientes c1 = new Clientes(leerDNI(), leerCelular(), leerApellido(), leerNombre(), leerDireccion());
				ac.Adicionar(c1);
				JOptionPane.showMessageDialog(this, "Registrado correctamente");
				limpiar();
				listado();
			}
			else
				JOptionPane.showMessageDialog(this, "DNI existente");
		} 
		catch (Exception ex) 
		{
			JOptionPane.showMessageDialog(this, "El DNI y el celular deben contener solo números.");
		}
	}
}
