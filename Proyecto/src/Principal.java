import Controlador.Controlador;
import Modelo.DBConnect;
import Modelo.Modelo;
import Vista.Front;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DBConnect con = new DBConnect();
		Modelo modelo = new Modelo();
		Front front = new Front();
		front.setVisible(true);	
		Controlador controlador = new Controlador(front,modelo);

	}
	
	
}
