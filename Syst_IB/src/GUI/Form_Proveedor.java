package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloProducto;
import Arreglos.ArregloProveedor;
import Clases.Producto;
import Clases.Proveedor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Proveedor extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDescripcion;
	private JTextField txtProveedor;
	private JButton btnLista;
	private JButton btnAñadir;
	private JTextField txtEncargado;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtNumero;
	private JTextArea txtS;
	private JButton btnModificar;
	private JButton btnBuscar;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Proveedor frame = new Form_Proveedor();
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
	public Form_Proveedor() {
		setTitle("Formulario de Proveedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agregar Proveedores");
		lblNewLabel.setBounds(10, 10, 101, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Agrega una descripción");
		lblNewLabel_1.setBounds(10, 33, 120, 12);
		contentPane.add(lblNewLabel_1);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(140, 30, 96, 18);
		contentPane.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtProveedor = new JTextField();
		txtProveedor.setBounds(140, 7, 96, 18);
		contentPane.add(txtProveedor);
		txtProveedor.setColumns(10);
		
		btnLista = new JButton("Lista");
		btnLista.addActionListener(this);
		btnLista.setBounds(10, 110, 61, 20);
		contentPane.add(btnLista);
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(this);
		btnAñadir.setBounds(81, 110, 70, 20);
		contentPane.add(btnAñadir);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(161, 110, 76, 20);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 140, 405, 113);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(247, 110, 76, 20);
		contentPane.add(btnModificar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(329, 110, 84, 20);
		contentPane.add(btnBuscar);
		
		txtEncargado = new JTextField();
		txtEncargado.setBounds(140, 52, 96, 18);
		contentPane.add(txtEncargado);
		txtEncargado.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Encargado");
		lblNewLabel_2.setBounds(10, 55, 101, 12);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Numero");
		lblNewLabel_3.setBounds(10, 77, 61, 13);
		contentPane.add(lblNewLabel_3);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(140, 82, 96, 18);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnAñadir) {
			do_btnAñadir_actionPerformed(e);
		}
		if (e.getSource() == btnLista) {
			do_btnLista_actionPerformed(e);
		}
	}
	String LeerProvedor() {
		return txtProveedor.getText();
	}
	String LeerDescripcion() {
		return txtDescripcion.getText();
	}
	String LeerEncargado() {
		return txtEncargado.getText();
	}
	String LeerNumero() {
		return txtNumero.getText();
	}
	void Imprimir(String s) {
		 txtS.append(s+"\n");
	}
	protected void do_btnLista_actionPerformed(ActionEvent e) {//BOTON LISTAR
			try {
				for (int i = 0; i < ArregloProveedor.Tamaño(); i++) {
				    txtS.append(ArregloProveedor.Obtener(i).toString());
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	}
	protected void do_btnAñadir_actionPerformed(ActionEvent e) { //BOTON AÑADIR
		txtS.setText("");
		ArregloProveedor.Añadir(new Proveedor(txtProveedor.getText(), 
                txtEncargado.getText(),
                txtDescripcion.getText(),
                txtNumero.getText()));

		
		}
		protected void do_btnBuscar_actionPerformed(ActionEvent e) {//BOTON BUSCAR
			txtS.setText("");
			Proveedor pr = ArregloProveedor.Buscar(txtProveedor.getText(), txtEncargado.getText());
			if (pr != null) {
			    JOptionPane.showMessageDialog(this, "Proveedor encontrado: " + pr.toString());
			} else {
			    JOptionPane.showMessageDialog(this, "Proveedor no encontrado");
			}

		//AÑADIR
	}

	protected void do_btnModificar_actionPerformed(ActionEvent e) {//BOTON MODIFICAR
		 String proveedorKey = txtProveedor.getText().trim();
		    String encargadoKey = txtEncargado.getText().trim();

		    if (proveedorKey.isEmpty() || encargadoKey.isEmpty()) {
		        JOptionPane.showMessageDialog(this, "Ingrese proveedor y encargado para buscar.");
		        return;
		    }

		    Proveedor p = ArregloProveedor.Buscar(proveedorKey, encargadoKey);
		    if (p != null) {
		        p.setProveedor(txtProveedor.getText().trim());
		        p.setDescripcion(txtDescripcion.getText().trim());
		        p.setEncargado(txtEncargado.getText().trim());
		        p.setNumero(txtNumero.getText().trim());

		        JOptionPane.showMessageDialog(this, "Proveedor modificado.");
		        listarProveedores(); 
		    } else {
		        JOptionPane.showMessageDialog(this, "Proveedor no encontrado.");
		    }
	}
	private void listarProveedores() {
	}

	protected void do_btnEliminar_actionPerformed(ActionEvent e) {//BOTON ELIMINAR
		String proveedorKey = txtProveedor.getText().trim();
	    String encargadoKey = txtEncargado.getText().trim();

	    if (proveedorKey.isEmpty() || encargadoKey.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Ingrese proveedor y encargado para eliminar.");
	        return;
	    }

	    Proveedor p = ArregloProveedor.Buscar(proveedorKey, encargadoKey);
	    if (p != null) {
	        int resp = JOptionPane.showConfirmDialog(this, "¿Eliminar este proveedor?", "Confirmar", JOptionPane.YES_NO_OPTION);
	        if (resp == JOptionPane.YES_OPTION) {
	            ArregloProveedor.Eliminar(p); // o arreglo.EliminarPorDatos(proveedorKey, encargadoKey);
	            JOptionPane.showMessageDialog(this, "Proveedor eliminado.");
	            // Limpiar campos
	            txtProveedor.setText("");
	            txtDescripcion.setText("");
	            txtEncargado.setText("");
	            txtNumero.setText("");
	            listarProveedores(); // refrescar JTextArea o JTable
	        }
	    } else {
	        JOptionPane.showMessageDialog(this, "Proveedor no encontrado.");
	    }
	}
}
