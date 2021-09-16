import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JTextField;

//import sun.tools.jstat.ExpressionExecuter;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimerAppDB {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private Connection con=null;
	private boolean ban1,ban2;
	private Statement stmt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimerAppDB window = new PrimerAppDB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimerAppDB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(177, 47, 96, 19);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(65, 50, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(65, 97, 45, 13);
		frame.getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(177, 94, 96, 19);
		frame.getContentPane().add(txtApellido);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url = "jdbc:sqlite:Personas.db";
				
				try {
					con = DriverManager.getConnection(url);
					System.out.print("Conexion Exitosa");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					con.setAutoCommit(false);
					ban1=true;
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					ban1=false;
				}
				if(ban1) {
					try {
						stmt = con.createStatement();
						//stmt.execute("INSERT INTO Personas (Nombre, Apellido) VALUES ('"+txtNombre.getText()+"','"+txtApellido.getText()+"';");
						stmt.execute("INSERT INTO Personas (Nombre, Apellido) VALUES ('Juan','Flores');");
						ban2 = true;
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						ban2 = false;
						if (ban2) {
							try {
								con.commit();
							} catch (SQLException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							
							try {
								con.close();
							} catch (SQLException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
						}
					}
				}
			}
		});
		btnAgregar.setBounds(104, 176, 85, 21);
		frame.getContentPane().add(btnAgregar);
	}
}
