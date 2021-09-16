
public class Estudiante extends Personas {
	private int codigo;
	private double[] notas=new double[4];

	public Estudiante(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Estudiante(String nombre, String apellido, int edad, int identificacion, int codigo) {
		super(nombre, apellido, edad, identificacion);
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", identificacion=" + identificacion + ", horallegada=" + horallegada + "]";
	}
	
	private void setNotas() {
		this.notas=notas;
	}
	
	
}
