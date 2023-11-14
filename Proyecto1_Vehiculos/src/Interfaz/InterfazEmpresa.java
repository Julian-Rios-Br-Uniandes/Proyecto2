package Interfaz;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GestionArchivos.Carga;
import GestionArchivos.Escritura;
import Logica.DatosContacto;
import Logica.DatosLicencia;
import Logica.DatosPago;
import Logica.Empresa;
import Logica.Sede;

public class InterfazEmpresa extends JFrame {
	
	private JPanel contenPanel; 
	private VistaMenuInicial vistaMenuInicial;
	private VistaInicioSesion vistaInicioSesion;
	private VistaInicioSesionCliente vistaInicioSesionCliente;
	private VistaMenuEmpleado vistaMenuEmpleado;
	private VistaNuevaCuenta vistaNuevaCuenta;
	private VistaMenuCliente vistaMenuCliente;
	private VistaModVehiculo vistaModVehiculo;
	
	private Empresa empresa;
	private Escritura escritura;
	private Carga carga;
	
//	holaa
	
	public InterfazEmpresa(){
	
		empresa = new Empresa() ;
		escritura = new Escritura();
		carga = new Carga(this);
//		carga.cargarClientes();
//		carga.cargarAdministrador();
//		carga.cargarSedes();
//		carga.cargarAdminsLocales();
//		carga.cargarCategorias();
//		carga.cargarVehiculos();
//		carga.cargarEmpleados();
//		empresa.getSedes().get(0).getEmpleados().get(0).setNombre("Manolo");
//		try {
//			escritura.escribirClientes(empresa.getClientes());
//			escritura.escribirSedes(empresa.getSedes());
//			escritura.escribirAdministradores(empresa.getSedes(), empresa.getAdministrador());
//			escritura.escribirCategorias(empresa.getCategorias());
//			escritura.escribirVehiculos(empresa.getVehiculos());
//			escritura.escribirEmpleados(empresa.getSedes());
//		} catch (FileNotFoundException | UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl);

		contenPanel = new JPanel();
		contenPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenPanel);
		contenPanel.setLayout(new CardLayout(0,0));
		
		vistaMenuInicial = new VistaMenuInicial(this);
		nuevoPanel(vistaMenuInicial);
		
		vistaInicioSesion = new VistaInicioSesion(this);
		vistaInicioSesionCliente = new VistaInicioSesionCliente(this);
		vistaMenuEmpleado = new VistaMenuEmpleado(this);
		vistaNuevaCuenta = new VistaNuevaCuenta(this);
		vistaMenuCliente = new VistaMenuCliente(this);
		vistaModVehiculo = new VistaModVehiculo(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		setSize(1000, 700);
		
		setResizable(false);
				
		setTitle("Empresa Vehiculos");
				
		setVisible(true);
		
		
	}
	
	/// Vistas
	
	public void nuevoPanel(JPanel vistaNueva) {
		contenPanel.removeAll();
		contenPanel.add(vistaNueva);
		contenPanel.repaint();
		contenPanel.revalidate();
	}
	
	public void InicioCliente() {
		nuevoPanel(vistaInicioSesionCliente);
	}
	
	public void InicioEmpleado() {
		nuevoPanel(vistaInicioSesion);
	}
	
	public void nuevaCuenta() {
		nuevoPanel(vistaNuevaCuenta);
	}
	
	public void menuEmpleado() {
		nuevoPanel(vistaMenuEmpleado);
	}
	
	public void menuCliente() {
		nuevoPanel(vistaMenuCliente);
	}
	
	public void vistaModVehiculo() {
		nuevoPanel(vistaModVehiculo);
	}
	
	// Control
	
	public boolean buscarUsuario() {
		boolean k = true;
		return k;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public static void main(String[] args) {
		InterfazEmpresa IE = new InterfazEmpresa();
	}

}
