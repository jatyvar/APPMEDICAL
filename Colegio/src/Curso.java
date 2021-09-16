import java.util.ArrayList;

public class Curso {
	private String nombreCurso;
	private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
	private Docente profesor;
	
	public Curso(String nombreCurso, String nombreD, String apellido, int edad, int identificacion, double salario, int añosExperiencia) {
		this.nombreCurso = nombreCurso;
		profesor = new Docente(nombreD,apellido,edad,identificacion,salario,añosExperiencia);
	}
	
	public void agregarEstudiantes(Estudiante nuevoEstudiante) {
		listaEstudiantes.add(nuevoEstudiante);
		
	}
	
	public void reporteNotas() {
		listaEstudiantes = profesor.reporteNotas(listaEstudiantes);
	}
	
	public void listaNotas() {
		for(int x=0; x<listaEstudiantes.size(); x++) {
			System.out.print(listaEstudiantes.get(x).toString());
		}
	}
	
}
