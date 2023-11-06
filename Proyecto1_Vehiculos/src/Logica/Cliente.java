package Logica;
import java.io.File;
import java.sql.Date;

public class Cliente extends Usuario{
	
	private Date fechaNacimiento;
	private String nacionalidad;
	private File imagenID;
	private DatosContacto datosContacto;
	private DatosLicencia datosLicencia;
	private DatosPago datosPago;
	
	public Cliente(String usuario, String contraseña, String nombre, Date fechaNacimiento, String nacionalidad,
			File imagenID, DatosContacto datosContacto, DatosLicencia datosLicencia, DatosPago datosPago) {
		super(usuario, contraseña, nombre);
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.imagenID = imagenID;
		this.datosContacto = datosContacto;
		this.datosLicencia = datosLicencia;
		this.datosPago = datosPago;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public File getImagenID() {
		return imagenID;
	}

	public void setImagenID(File imagenID) {
		this.imagenID = imagenID;
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

	public DatosPago getDatosPago() {
		return datosPago;
	}

	public void setDatosPago(DatosPago datosPago) {
		this.datosPago = datosPago;
	}
	
	

}
