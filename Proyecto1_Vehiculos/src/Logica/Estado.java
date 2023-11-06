//import java.sql.Date;
package Logica;

public abstract class Estado {

//	private Date fecha
	private Sede sede;

	public Estado(Sede sede) {
		super();
		this.sede = sede;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
}
