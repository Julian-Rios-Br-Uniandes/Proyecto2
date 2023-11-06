package Interfaz;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InterfazEmpresa extends JFrame {
	
	private JPanel contenPanel; 
	private VistaMenuInicial vistaMenuInicial;
	private VistaInicioSesion vistaInicioSesion;
	private VistaInicioSesionCliente vistaInicioSesionCliente;
	private VistaMenuEmpleado vistaMenuEmpleado;
	private VistaNuevaCuenta vistaNuevaCuenta;
	private VistaMenuCliente vistaMenuCliente;
	
//	holaaaa no cambia
	
	public InterfazEmpresa(){
		
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		setSize(400, 300);
				
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
	
	// Control
	
	public boolean buscarUsuario() {
		boolean k = true;
		return k;
	}
	
	public static void main(String[] args) {
		InterfazEmpresa IE = new InterfazEmpresa();
	}

}
