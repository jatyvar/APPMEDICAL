/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistencia.ConexionBD;

/**
 *
 * @author G2-S36
 */

public class paciente {
    private int id;
    private String nombre;
    private String apellido;
    private String identificacion;
    private String telefono;
    private String direccion;
    private String email;
    private int ciudad;
    
    /*Metodo constructor recibiendo parametros*/
    public void paciente(int id, String nombre, String apellido, String identificacion, String telefono, String direccion, String email, int ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.ciudad = ciudad;
    }
     
    /*Metodo constructor vacio*/
    public paciente(){
    }
    
    /*Metodo que permite guardar elregistro del paciente*/
    public boolean guardarPaciente(){
        ConexionBD conexion = new ConexionBD();
        String query = "INSERT INTO tbl_paciente (per_id, per_nombre, per_apellido, per_identificacion, per_telefono, per_direccion, per_email, tbl_ciudad_ciu_ciudad) VALUES ('"+this.id+"', '"+this.nombre+"', '"+this.apellido+"', '"+this.identificacion+"', '"+this.telefono+"', '"+this.direccion+"', '"+this.email+"', '"+this.ciudad+"');";
        if (conexion.setAutoCommitBD(false)){
            if (conexion.insertarBD(query)){
                conexion.commitBD();
                conexion.cerrarConexion();
                return true;
            }else{
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        }else{
            conexion.cerrarConexion();
            return false;
        }
    }
    
    /*Metodo que permite eliminar un paciente*/
    public boolean borarPaciente(String identificacion){
        String query = "DELETE FROM tbl_paciente WHERE per_identificacion = '"+ identificacion+"'";
        ConexionBD conexion = new ConexionBD();
        if (conexion.setAutoCommitBD(false)){
            if (conexion.actualizarBD(query)){
                conexion.commitBD();
                conexion.cerrarConexion();
                return true;
            }else{
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        }else{
            conexion.cerrarConexion();
            return false;
        }
    }
    
    /*Metodo que permite actualiza el registro de paciente*/
    public boolean actualizaPaciente(String identificacion){
        ConexionBD conexion = new ConexionBD();
        String query = "UPDATE tbl_paciente SET per_nombre = '"+ this.nombre+"',per_apellido ='"+this.apellido+"', per_identificacion = '"+this.identificacion+"', per_telefono = '"+this.telefono+"', per_direccion= '"+this.direccion+"', per_email= '"+this.email+"', tbl_ciudad_ciu_ciudad= '"+this.ciudad+"'";
        if (conexion.setAutoCommitBD(false)){
            if (conexion.actualizarBD(query)){
                conexion.commitBD();
                conexion.cerrarConexion();
                return true;
            }else{
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        }else{
            conexion.cerrarConexion();
            return false;
        }
    }
    
    /*Metodo que permite listar los pacientes registrados*/
    public List<paciente> listarPaciente() throws SQLException{
        ConexionBD conexion = new ConexionBD();
        List<paciente> listaPaciente = new ArrayList<>();
        String query = "SELECT * FROM tbl_paciente order by per_identificacion";
        ResultSet rs = conexion.consultarBD(query);
        paciente c;
        while (rs.next()) {
           c = new paciente();
           c.setId(rs.getInt("id"));
           c.setNombre(rs.getString("nombre"));
           c.setApellido(rs.getString("apellido"));
           c.setIdentificacion(rs.getString("identificacion"));
           c.setTelefono(rs.getString("telefono"));
           c.setDireccion(rs.getString("direccion"));
           c.setEmail(rs.getString("email"));
           c.setCiudad(rs.getInt("ciudad")); 
        }
        conexion.cerrarConexion();
        return listaPaciente;
    }
    
   
    /*Metodo que permite buscar un paciente por su numero de identificacion*/
    public paciente getPaciente() throws SQLException {
        ConexionBD conexion = new ConexionBD();
        String query = "select * from tbl_paciente where per_identificacion = '"+ this.identificacion+"'";
        ResultSet rs = conexion.consultarBD(query);
        if (rs.next()){
            this.id = rs.getInt("id");
            this.nombre = rs.getString("nombre");
            this.apellido = rs.getString("apellido");
            this.identificacion = rs.getString("identificacion");
            this.telefono = rs.getString("telefono");
            this.direccion = rs.getString("direccion");
            this.email = rs.getString("email");
            this.ciudad = rs.getInt("ciudad");
            return this;
        }else{
            conexion.cerrarConexion();
            return null;
        }
        
    }
    
    @Override
    public String toString(){
        return "paciente {"+"id="+ id + ",nombre="+nombre+",apellido="+apellido+",identificacion="+identificacion+",telefono="+telefono+",direccion="+direccion+",email="+email+",ciudad="+ciudad+"}";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
    
}
