<%-- 
    Document   : peticiones
    Created on : 28/09/2021, 6:34:58 p. m.
    Author     : Deiss
--%>


<%@page import="java.util.logging.Level"%>
<%@page import="java.util.List"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.sql.SQLException"%>
<%@page import="logica.paciente"%>
<%@page import="com.google.gson.Gson"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 

String respuesta = "{";

List<String> tareas = Arrays.asList (new String []{
"actualizar",
"eliminar",
"listar",
"guardar"
});

String proceso = " "+ request.getParameter("proceso");
if (tareas.contains(proceso)){
    respuesta += "\" ok \": true,";
    
    if (proceso.equals("guardar")){
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String identificacion = request.getParameter("identificacion");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String email = request.getParameter("email");
        int ciudad = Integer.parseInt(request.getParameter("ciudad"));
        
        paciente p = new paciente();
        p.setId(id);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setIdentificacion(identificacion);
        p.setTelefono(telefono);
        p.setDireccion(direccion);
        p.setEmail(email);
        p.setCiudad(ciudad);
        
        if (p.guardarPaciente()){
            respuesta += "\"" + proceso + "\": true";
            
        }else{
            respuesta += "\"" + proceso + "\": false";
        }
        }else if(proceso.equals("eliminar")){
            paciente p = new paciente();  
            String identificacion = request.getParameter("identificacion");
            if(p.borarPaciente(identificacion)){
                respuesta += "\"" + proceso + "\": true";
            }else{
                respuesta += "\"" + proceso + "\": false";
            }
        }else if(proceso.equals("listar")){
            paciente p = new paciente(); 
            try {
                  List<paciente> lista = p.listarPaciente();
                  respuesta += "\"" + proceso + "\": true,\"paciente\":"+ new Gson().toJson(lista);
                } catch (SQLException e) {
                   respuesta += "\"" + proceso + "\": true,\"paciente\":[]";
                   Logger.getLogger(paciente.class.getName()).log(Level.SEVERE, null, e);
                }
            
        
        
        }else if (proceso.equals("actualizar")){
        
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String identificacion = request.getParameter("identificacion");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");
            String email = request.getParameter("email");
            int ciudad = Integer.parseInt(request.getParameter("ciudad"));
            
            paciente p = new paciente();
            p.setId(id);
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setIdentificacion(identificacion);
            p.setTelefono(telefono);
            p.setDireccion(direccion);
            p.setEmail(email);
            p.setCiudad(ciudad);
            
            if (p.actualizaPaciente(identificacion)){
            respuesta += "\"" + proceso + "\": true";
            
            }else{
                respuesta += "\"" + proceso + "\": false";
            }
        }
       /*Mensaje de proceso desconocido */
    }else{
        respuesta += "\" ok \": false,";
        respuesta += "\" error \":\"INVALID\",";
        respuesta += "\" errorMSG \":\"LO SENTIMOS LOS DATOS,"
                +"SON INALIDAS. CORRIJA E INTENTE DE NUEVO.\",";
        
    }
    
    respuesta = "}";
    response.setContentType("application/json;charset=ISO-8859-1");
    out.println(respuesta);

  
%>

