import java.util.HashSet;
import java.util.TreeSet;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashSet<String> nombres = new HashSet<>();
	nombres.add("Juan");
	nombres.add("Nicolas");
	nombres.add("Camila");
	nombres.add("Daniela");
	nombres.add("Carlos");
	nombres.add("Nicolas");
	nombres.add("Nicolas");
	System.out.print(nombres);
	
	TreeSet<String> telefonos = new TreeSet<>();
	telefonos.add("1");
	telefonos.add("5");
	telefonos.add("2");
	System.out.print(telefonos);
	
	}
	
	
	
}
