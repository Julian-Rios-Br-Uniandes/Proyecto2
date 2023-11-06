package Logica;
import java.util.ArrayList;

public class Sede {
	
	private String nombre;
	private String direccion;
	private String horarios;
	private AdminLocal admin;
	private ArrayList<Empleado> empleados;
	
	public Sede(String nombre, String direccion, String horarios, AdminLocal admin, ArrayList<Empleado> empleados) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.horarios = horarios;
		this.admin = admin;
		empleados = new ArrayList<Empleado>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public AdminLocal getAdmin() {
		return admin;
	}

	public void setAdmin(AdminLocal admin) {
		this.admin = admin;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
