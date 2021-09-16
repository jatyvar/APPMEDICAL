package banco;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cuenta usuario1 = new cuenta("Melissa",500000);
		usuario1.retirar(250000);
		System.out.print(usuario1.getCantidad());
	}

}