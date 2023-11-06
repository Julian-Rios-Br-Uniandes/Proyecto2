package Logica;

public class Conductor extends Usuario {

	private DatosContacto datosContacto;
	private DatosLicencia datosLicencia;
	
	public Conductor(String usuario, String contraseña, String nombre, DatosContacto datosContacto,
			DatosLicencia datosLicencia) {
		super(usuario, contraseña, nombre);
		this.datosContacto = datosContacto;
		this.datosLicencia = datosLicencia;
	}

	public DatosContacto getDatosContacto() {
		return datosContacto;
	}

	public void setDatosContacto(DatosContacto datosContacto) {
		this.datosContacto = datosContacto;
	}

	public DatosLicencia getDatosLicencia() {
		return datosLicencia;
	}

	public void setDatosLicencia(DatosLicencia datosLicencia) {
		this.datosLicencia = datosLicencia;
	}

}
