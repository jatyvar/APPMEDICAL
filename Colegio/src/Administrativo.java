
public class Administrativo extends Personas{
	
	private double salario;
	private String tipoContrato;
	
	
	public Administrativo(String nombre, String apellido, int edad, int identificacion, double salario,
			String tipoContrato) {
		super(nombre, apellido, edad, identificacion);
		this.salario = salario;
		this.tipoContrato = tipoContrato;
	}


	@Override
	public String toString() {
		return "Administrativo [salario=" + salario + ", tipoContrato=" + tipoContrato + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", edad=" + edad + ", identificacion=" + identificacion + ", horallegada="
				+ horallegada + "]";
	}
	@Override
	public void horaDeLlegada(String hora) {
		if(hora.equals("10:00")) {
			this.setHorallegada(hora);
		}
		
	}
	
		
}
