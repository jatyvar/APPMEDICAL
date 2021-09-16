package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Vista.Front;

public class Modelo extends DBConnect{
	
	public ArrayList<Producto> consultar(){   //Metodo que permite Realizar consultas a base de datos
		DBConnect con = new DBConnect();
		ArrayList<Producto> productos = new ArrayList<Producto>();
		ResultSet result = null;
		try {
			String sentencia = "SELECT * FROM productos";
			ResultSet rest= leerDatos(sentencia);
			while (rest.next()){
					                Producto producto = new Producto(rest.getInt(1), rest.getString(2),rest.getInt(3),rest.getString(4),rest.getDouble(5));
					                productos.add(producto);
					            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productos;				

	}
	
	public void Guardar(String nombre,String cantidad, String categoria, double precio){	//Metodo que permite guardar un nuevo registro en base de datos
		DBConnect con = new DBConnect();
		String sentencia = "INSERT INTO productos  (nombre, cantidad, categoria, precio) VALUES ('"+nombre+"','"+cantidad+"','"+categoria+"','"+precio+"');";
		agregarDatos(sentencia);
	}
	
	public void Eliminar(String id){			//Metodo que permite eliminar un registro de base de datos
		DBConnect con = new DBConnect();
		String sentencia = "DELETE FROM productos WHERE id='"+id+"';";
		eliminar(sentencia);
	}
	
	public void Actualizar(String id, String nombre,String cantidad, String categoria, double precio){		//Metodo que permite actualizar loso registro de la tabla
		DBConnect con = new DBConnect();
		String sentencia = "UPDATE productos SET nombre ='"+nombre+"', cantidad='"+cantidad+"', categoria='"+categoria+"' ,precio = '"+precio+"'  WHERE id='"+id+"';";
		agregarDatos(sentencia);
	}
	
	
}
