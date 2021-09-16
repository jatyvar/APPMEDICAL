
public abstract class Personas {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected int identificacion;
	protected String horallegada;
	
	public Personas(String nombre, String apellido, int edad, int identificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.identificacion = identificacion;
	}
	
	
	public abstract String toString();
	public abstract void horaDeLlegada(String hora);
	
	public String getHorallegada() {
		return horallegada;
	}
	public void setHorallegada(String horallegada) {
		this.horallegada = horallegada;
	}

	
	
	
}
