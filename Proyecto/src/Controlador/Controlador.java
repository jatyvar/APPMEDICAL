package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import Modelo.Modelo;
import Vista.Front;


public class Controlador implements ActionListener{
	private Front front;
	private Modelo modelo;
	
	//Constructor
	public Controlador(Front front, Modelo modelo) {
		this.front = front;
		this.modelo = modelo;
		this.front.btnGuardar.addActionListener(this);
		this.front.btnActualizarC.addActionListener(this);
		this.front.btnConsultarC.addActionListener(this);
		this.front.btnEliminarC.addActionListener(this);

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton actionSource = (JButton) e.getSource();
		if (actionSource.equals(front.btnGuardar)) {							//Guardar
			String nombre = front.textNombre.getText();
			String cantidad = front.textCantidad.getText();
			String preciocadena = front.textPrecio.getText();
			String categoria = front.comboGuardar.getSelectedItem().toString();
			if (nombre.equals("")||cantidad.equals("")||preciocadena.equals("")) {
				front.lblNewLabelGuardar.setText("Por favor llene todos los datos del formulario");
			}else {
				double precio = Double.parseDouble(preciocadena);
				modelo.Guardar(nombre,cantidad, categoria, precio); //LLamada al metodo del modelo que permite guardar
				front.lblNewLabelGuardar.setText("Registro Guardado");
			}

			
		}else if (actionSource.equals(front.btnActualizarC)) {
			String id = front.textId.getText();									//Actualizar 
			String nombre = front.textNombreC.getText();
			String cantidad = front.textCantidadC.getText();
			String preciocadena = front.textPrecioC.getText();
			String categoria = front.combobox.getSelectedItem().toString();
			if (preciocadena.equals("")) {
				front.lblNewLabel.setText("Por favor seleccione un item de la tabla");
			}else {
				double precio = Double.parseDouble(preciocadena);
				modelo.Actualizar(id, nombre, cantidad, categoria, precio);		//LLamada al metodo del modelo que permite actualizar la tabla
				front.lblNewLabel.setText("Producto Actualizado");
			}

			
		}else if (actionSource.equals(front.btnConsultarC)) {    //Consultar
			DefaultTableModel model = (DefaultTableModel) front.tabla.getModel();
			model.setRowCount(0);
			modelo.consultar().forEach((line) -> {model.addRow(new Object[]{line.getId(), line.getNombre(), line.getCantidad(), line.getCategoria(), line.getPrecio()});});	//LLamada al metodo del modelo	
			front.lblNewLabel.setText("Tabla Actualizada" );
			
		}else if (actionSource.equals(front.btnEliminarC)) {	//Eliminar	
			String id = front.textId.getText();
			if (id.equals("")) {
				front.lblNewLabel.setText("Por favor seleccione un item de la tabla");
			}else {
			modelo.Eliminar(id);		//LLamada al metodo del model
			front.lblNewLabel.setText("Consulta Eliminada");
			}
		}
		
	
		
	}

	
	
}
