package Modelo;
import java.sql.*;
public class DBConnect {
	Connection con = null;
	PreparedStatement stmt = null;
	
	public  DBConnect() {
		String url = "jdbc:sqlite:BD/Proyecto.db";
		try {
			con = DriverManager.getConnection(url);
			System.out.println("La conexion fue exitosa");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void cerrar() {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("Conexion Cerrada");
	}
	
	public boolean commitDB() {
		try {
			con.commit();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean rollbackDB() {
		try {
			con.rollback();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean setAutoCommitDB() {
		try {
			con.setAutoCommit(false);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean insertarDB(String sentencia) {
		try {
			//stmt = con.createStatement();
			//stmt.execute(sentencia);
			stmt = con.prepareStatement(sentencia);
			//stmt.setString(1, nombre);
			//stmt.setString(2, apellido);
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public void agregarDatos(String sentencia) {
		if(setAutoCommitDB()) {					
			if(insertarDB(sentencia)) {
				commitDB();
			}else {
				rollbackDB();
				cerrar();
			}			
		}else {
			cerrar();
		}
	}

	public ResultSet leerDatos(String sentencia) {
		try {
			stmt = con.prepareStatement(sentencia);
//			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			cerrar();
		}
		cerrar();
		return null;	
	}
	
	public void eliminar(String sentencia) {
		boolean bandera;
		
		if(setAutoCommitDB()) {
			try {
				stmt = con.prepareStatement(sentencia);
				//stmt.setInt(1, id);
				stmt.executeUpdate();
				bandera = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				bandera = false;
			}
			
			if(bandera) {
				commitDB();
			}else {
				rollbackDB();
				cerrar();
			}
		}else {
			cerrar();
		}
		
	}
}
