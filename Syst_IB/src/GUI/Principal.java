package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setTitle("Sistema de Inventario Bodega - ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 342);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Registros");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Clientes");
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Empleados");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Productos");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mnNewMenu_1 = new JMenu("Operaciones");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_3 = new JMenuItem("Stock de Producto");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mnNewMenu_2 = new JMenu("Movimientos");
		menuBar.add(mnNewMenu_2);
		
		mnNewMenu_3 = new JMenu("Reportes");
		menuBar.add(mnNewMenu_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem) {
			do_mntmNewMenuItem_actionPerformed(e);
		}
	}
	protected void do_mntmNewMenuItem_actionPerformed(ActionEvent e) {
		FormCliente cli=new FormCliente();
		cli.setVisible(true);
	}
}
