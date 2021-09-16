import java.util.ArrayList;
import java.util.Scanner;

public class Docente extends Personas implements Empleado{
	private double salario;
	private int añosExperiencia;
	private double nota;
	private double[] listaNotas = new double [4];
	
	Scanner in=new Scanner(System.in);
	
	public Docente(String nombre, String apellido, int edad, int identificacion, double salario, int añosExperiencia) {
		super(nombre, apellido, edad, identificacion);
		this.salario = salario;
		this.añosExperiencia = añosExperiencia;
	}

	
	public ArrayList<Estudiante> reporteNotas(ArrayList<Estudiante> listaEstudiantes ) {
		for(int x=0;x<listaEstudiantes.size();x++) {
			for(int j=0; j<4; j++) {
				System.out.print("Ingrese la nota"+ (j+1) +": ");
				listaEstudiantes.get(j).setNotas();
				nota = in.nextDouble();
				listaNotas[j]=nota;
			}
			listaEstudiantes.get(x).setNotas(listaNotas);
		}
			return listaEstudiantes;
	}
	public void modificarNotas(ArrayList<Estudiante> listaEstudiantes,int id) {
		System.out.print("Ingrese las notas que desea cambiar para el estudiante: "+ id +": ");
		for(int j=0; j<4; j++) {
			System.out.print("Ingrese la nota"+ (j+1) +": ");
			listaEstudiantes.get(j).setNotas();
			nota = in.nextDouble();
			listaNotas[j]=nota;
		}
		listaEstudiantes.get(id).setNotas(listaNotas);
	}
	
	@Override
	public String toString() {
		return "Docente [salario=" + salario + ", añosExperiencia=" + añosExperiencia + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", edad=" + edad + ", identificacion=" + identificacion + ", horallegada="
				+ horallegada + "]";
	}

	public void incrementarSalario() {
		
	}
	
	@Override
	public void horaDeLlegada(String hora) {
		if(hora.equals("10:00")) {
			this.setHorallegada(hora);
		}
	}
}
