package Logica;

public abstract class Empleado extends Usuario {
	
	private Rol rol;

	public Empleado(String usuario, String contraseña, String nombre, Rol rol) {
		super(usuario, contraseña, nombre);
		this.rol = rol;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
}
