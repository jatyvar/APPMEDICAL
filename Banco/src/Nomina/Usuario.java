package Nomina;

public class Usuario {
	//Atributos
	private final double salarioMinimo = 908526;
	private final double salarioDesarrollador = 4500000;
	private String nombre;
	private int identificacion;
	private String email;
	private int edad;
	private String area;
	private boolean cargo;
	private double nomina;

	//Constructor
	public Usuario(String nombre, int identificacion, String email, int edad, String area, boolean cargo) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.email = email;
		this.edad = edad;
		this.area = area;
		this.cargo = cargo;
		//Obtener el salario
		if (area.equals("desarrollo")) {
			nomina=salarioDesarrollador;
			if(cargo) {
				nomina=nomina+2500000;
			}
		}else {
			nomina=3500000;
			if (cargo) {
				nomina=nomina+3000000;	
			}
			
		}
		//Descuento de seguridad social
		if (nomina>4*salarioMinimo) {
			nomina=nomina-nomina*0.09;
		}else {
			nomina=nomina-nomina*0.08;
		}
	}
	
	//Metodos
	public void info() {
		System.out.println("[Usuario]:"); 
		System.out.println("Nombre: "+nombre);
		System.out.println("Identificacion: "+identificacion);
		System.out.println("Email: "+email);
		System.out.println("Edad: "+edad);
		System.out.println("Area: "+area);
		System.out.println("Salario: "+nomina);
	}
	
}


