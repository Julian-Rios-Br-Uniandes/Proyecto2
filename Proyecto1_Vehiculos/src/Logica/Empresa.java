package Logica;
import java.util.ArrayList;

public class Empresa {

	private Administrador administrador;
//	private ArrayList<Reserva> reservas;
	private ArrayList<Sede> sedes;
	private ArrayList<Categoria> categorias;
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Cliente> clientes;
	
	public Empresa(Administrador administrador, ArrayList<Sede> sedes, ArrayList<Categoria> categorias,
			ArrayList<Vehiculo> vehiculos, ArrayList<Cliente> clientes) {
		super();
		this.administrador = administrador;
		this.sedes = sedes;
		this.categorias = categorias;
		this.vehiculos = vehiculos;
		this.clientes = clientes;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public ArrayList<Sede> getSedes() {
		return sedes;
	}

	public void setSedes(ArrayList<Sede> sedes) {
		this.sedes = sedes;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
}
