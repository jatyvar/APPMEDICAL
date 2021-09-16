package Vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Front extends JFrame {

	private JPanel contentPane;
	public JTextField textNombre;
	public JTextField textCantidad;
	public JTextField textPrecio;
	public JTextField textPrecioC;
	public JTextField textCantidadC;
	public JTextField textNombreC;
	public  JTextField textId;
	public JTable tabla;
	public JButton btnActualizarC;
	public JButton btnEliminarC;
	public JButton btnConsultarC;
	public JButton btnGuardar;
	public JComboBox combobox;
	public JComboBox comboGuardar;
	public JLabel lblNewLabel;
	public JLabel lblNewLabelGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front frame = new Front();
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
	public Front() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel Registrar = new JPanel();
		tabbedPane.addTab("Registrar", null, Registrar, null);
		Registrar.setLayout(null);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNombre_1.setBounds(55, 100, 54, 30);
		Registrar.add(lblNombre_1);
		
		JLabel lblCantidad_1 = new JLabel("Cantidad");
		lblCantidad_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblCantidad_1.setBounds(50, 150, 60, 30);
		Registrar.add(lblCantidad_1);
		
		JLabel lblPrecio_1 = new JLabel("Precio");
		lblPrecio_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblPrecio_1.setBounds(65, 200, 60, 30);
		Registrar.add(lblPrecio_1);
		
		JLabel lblCategoria_1 = new JLabel("Categoria");
		lblCategoria_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblCategoria_1.setBounds(47, 250, 63, 30);
		Registrar.add(lblCategoria_1);
		
		textNombre = new JTextField();
		textNombre.setBounds(150, 100, 200, 19);
		Registrar.add(textNombre);
		textNombre.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(150, 150, 200, 19);
		Registrar.add(textCantidad);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(150, 200, 200, 19);
		Registrar.add(textPrecio);
		
	
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(169, 362, 85, 21);
		Registrar.add(btnGuardar);
		
		comboGuardar = new JComboBox();
		comboGuardar.setModel(new DefaultComboBoxModel(new String[] {"ASEO", "VIVERES"}));
		comboGuardar.setBounds(150, 257, 92, 21);
		Registrar.add(comboGuardar);
		
		lblNewLabelGuardar = new JLabel("Por favor registe los datos del formulario y presione \"Guardar\"");
		lblNewLabelGuardar.setBounds(35, 393, 362, 13);
		lblNewLabelGuardar.setHorizontalAlignment(SwingConstants.CENTER);
		Registrar.add(lblNewLabelGuardar);
		
		JPanel ConsultarC = new JPanel();
		tabbedPane.addTab("Consultar", null, ConsultarC, null);
		ConsultarC.setLayout(null);
		
		JLabel lblNombreC = new JLabel("Nombre");
		lblNombreC.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNombreC.setBounds(89, 230, 54, 30);
		ConsultarC.add(lblNombreC);
		
		JLabel lblCantidadC = new JLabel("Cantidad");
		lblCantidadC.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblCantidadC.setBounds(84, 260, 60, 30);
		ConsultarC.add(lblCantidadC);
		
		JLabel lblPrecio_1_1 = new JLabel("Precio");
		lblPrecio_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblPrecio_1_1.setBounds(99, 290, 60, 30);
		ConsultarC.add(lblPrecio_1_1);
		
		JLabel lblCategoriaC = new JLabel("Categoria");
		lblCategoriaC.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblCategoriaC.setBounds(81, 321, 63, 30);
		ConsultarC.add(lblCategoriaC);
		
		textPrecioC = new JTextField();
		textPrecioC.setColumns(10);
		textPrecioC.setBounds(184, 290, 200, 19);
		ConsultarC.add(textPrecioC);
		
		textCantidadC = new JTextField();
		textCantidadC.setColumns(10);
		textCantidadC.setBounds(184, 260, 200, 19);
		ConsultarC.add(textCantidadC);
		
		textNombreC = new JTextField();
		textNombreC.setColumns(10);
		textNombreC.setBounds(184, 230, 200, 19);
		ConsultarC.add(textNombreC);
		
		btnActualizarC = new JButton("Actualizar");
		btnActualizarC.setBounds(31, 373, 97, 21);
		ConsultarC.add(btnActualizarC);
		
		btnConsultarC = new JButton("Consultar");
		btnConsultarC.setBounds(184, 373, 97, 21);
		ConsultarC.add(btnConsultarC);
		
		btnEliminarC = new JButton("Eliminar");
		btnEliminarC.setBounds(325, 373, 85, 21);
		ConsultarC.add(btnEliminarC);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblId.setBounds(89, 200, 54, 30);
		ConsultarC.add(lblId);
		
		textId = new JTextField();
		textId.setColumns(10);
		textId.setBounds(184, 200, 50, 19);
		ConsultarC.add(textId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 451, 180);
		ConsultarC.add(scrollPane);
		tabla = new JTable();
		tabla.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nombre", "Cantidad", "Categoria", "Precio"
			}
		));
		tabla.addMouseListener(new MouseAdapter() {
			 public void mousePressed(MouseEvent Mouse_evt) {
			 JTable table =(JTable) Mouse_evt.getSource();
			 Point point = Mouse_evt.getPoint();
			 int seleccionar = table.rowAtPoint(point);
				 if (Mouse_evt.getClickCount() == 1) {
					 //System.out.println(""+tabla.getValueAt(tabla.getSelectedRow(), 1));
					 textId.setText(String.valueOf(tabla.getValueAt(seleccionar, 0)));
					 textNombreC.setText(String.valueOf(tabla.getValueAt(seleccionar, 1)));
					 textCantidadC.setText(String.valueOf(tabla.getValueAt(seleccionar, 2)));
					 combobox.setSelectedItem(String.valueOf(tabla.getValueAt(seleccionar, 3)));
					 textPrecioC.setText(String.valueOf(tabla.getValueAt(seleccionar, 4)));
					 
				 }
			 }
			 });
		scrollPane.setViewportView(tabla);
		
		combobox = new JComboBox();
		combobox.setModel(new DefaultComboBoxModel(new String[] {"ASEO", "VIVERES"}));
		combobox.setSelectedIndex(0);
		combobox.setBounds(184, 328, 85, 21);
		ConsultarC.add(combobox);
		
		lblNewLabel = new JLabel("Clic en \"Consultar\" para ver la tabla de productos");
		lblNewLabel.setBounds(99, 403, 311, 13);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ConsultarC.add(lblNewLabel);
	}



}
