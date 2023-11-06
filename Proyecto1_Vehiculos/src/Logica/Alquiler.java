package Logica;
import java.sql.Date;
import java.util.ArrayList;

public class Alquiler extends Estado{

	private Date fechaEntrega;
	private double tarifa;
	private Sede sedeEntrega;
	private Vehiculo vehiculo;
	private Seguro seguro;
	private ArrayList<Conductor> conductoresAdicionales;
	
	public Alquiler(Sede sede, Date fechaEntrega, double tarifa, Sede sedeEntrega, Vehiculo vehiculo, Seguro seguro,
			ArrayList<Conductor> conductoresAdicionales) {
		super(sede);
		this.fechaEntrega = fechaEntrega;
		this.tarifa = tarifa;
		this.sedeEntrega = sedeEntrega;
		this.vehiculo = vehiculo;
		this.seguro = seguro;
		this.conductoresAdicionales = conductoresAdicionales;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public Sede getSedeEntrega() {
		return sedeEntrega;
	}

	public void setSedeEntrega(Sede sedeEntrega) {
		this.sedeEntrega = sedeEntrega;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public ArrayList<Conductor> getConductoresAdicionales() {
		return conductoresAdicionales;
	}

	public void setConductoresAdicionales(ArrayList<Conductor> conductoresAdicionales) {
		this.conductoresAdicionales = conductoresAdicionales;
	}
	
}
