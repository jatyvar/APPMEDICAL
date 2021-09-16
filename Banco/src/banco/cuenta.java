package banco;

public class cuenta {
	//Atributos
	private String titular;
	private double cantidad;
	
	//Constructores
	public cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}
	public cuenta(String titular, double cantidad) {
		this.titular = titular;
		if (cantidad<0) {
			this.cantidad=0;
		}else {
			this.cantidad = cantidad;
		}
	}
	
	//Metodos Especiales
	public void ingresar (double abono) {
		if (abono>0) {
			this.cantidad += abono;
		}
	}
	
	public void retirar (double abono) {
		if (abono>0) {
			if(this.cantidad-abono>=0) {
				this.cantidad -= abono;
			}
					
		}
	}

	
	//Get, Set y ToString
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	

}
