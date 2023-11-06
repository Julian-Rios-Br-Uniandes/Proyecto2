package Logica;

public class Limpieza extends Estado{

	private String descripcion;
	private Empleado limpiador;
	
	public Limpieza(Sede sede, String descripcion, Empleado limpiador) {
		super(sede);
		this.descripcion = descripcion;
		this.limpiador = limpiador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empleado getLimpiador() {
		return limpiador;
	}

	public void setLimpiador(Empleado limpiador) {
		this.limpiador = limpiador;
	}
	
}
