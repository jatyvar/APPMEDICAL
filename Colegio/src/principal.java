
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso cuartoB = new Curso("4-B", "Camilo","Mendoza", 28, 321324, 53543, 4);
		Estudiante juan = new Estudiante("juan", "perez", 8, 32424234, 15);
		Estudiante Camila = new Estudiante("Camila", "perez", 8, 32424234, 2);
		Estudiante Melisa = new Estudiante("Melisa", "perez", 8, 32424234, 4);
		Estudiante Andres = new Estudiante("Andres", "perez", 8, 32424234, 6);
		cuartoB.agregarEstudiantes(juan);
		cuartoB.agregarEstudiantes(Melisa);
		cuartoB.agregarEstudiantes(Camila);
		cuartoB.agregarEstudiantes(Andres);
		cuartoB.reporteNotas();
		cuartoB.listaNotas();
	}

}
