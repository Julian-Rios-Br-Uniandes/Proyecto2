package Interfaz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VistaNuevaCuenta extends JPanel implements ActionListener {

	private JLabel labelPeticion;
	private JLabel labelUsuario;
	private JLabel labelContrasena;
	private JLabel labelNombre;
	private JLabel labelApellido;
	private JLabel labelFechaNacimiento;
	private JLabel labelNacionalidad;
	private JLabel labelImagenID;
	private JLabel labelDatosLicencia;
	private JLabel labelNumero;
	private JLabel labelPaisExpedicion;
	private JLabel labelFechaVencimiento;
	private JLabel labelImagen;
	private JLabel labelDatosContacto;
	private JLabel labelTelefono;
	private JLabel labelDireccion;
	private JLabel labelEmail;
	private JLabel labelDatosPago;
	private JLabel labelNumeroTarjeta;
	private JLabel labelExpiracion;
	private JLabel labelCVV;
	
	private JTextField tUsuario;
	private JTextField tContrasena;
	private JTextField tNombre;
	private JTextField tApellido;
	private JTextField tFechaNacimiento;
	private JTextField tNacionalidad;
	private JTextField tImagenID;
	private JTextField tNumero;
	private JTextField tPaisExpedicion;
	private JTextField tFechaVencimiento;
	private JTextField tImagen;
	private JTextField tTelefono;
	private JTextField tDireccion;
	private JTextField tEmail;
	private JTextField tNumeroTarjeta;
	private JTextField tExpiracion;
	private JTextField tCVV;
	
	private JButton confirmar;
	private JButton ImagenID;
	private JButton Imagen;
	
	private InterfazEmpresa interfaz;
	
	public VistaNuevaCuenta(InterfazEmpresa interfaz) {

		this.interfaz = interfaz;
		
		TitledBorder border = new TitledBorder("Inicio Sesión");
		setBorder(border);
		setPreferredSize(new Dimension(300,100));
		
		labelPeticion = new JLabel("Para crear un usuario ingrese los siguientes datos:");
		labelUsuario = new JLabel("Usuario:");
		labelContrasena = new JLabel("Contraseña:");
		labelNombre = new JLabel("Nombre:");
		labelApellido = new JLabel("Apellido:");
		labelFechaNacimiento = new JLabel("Fecha nacimiento:");
		labelNacionalidad = new JLabel("Nacionalidad:");
		labelImagenID = new JLabel("Imagen ID:");
		labelDatosLicencia = new JLabel("Datos Licencia");
		labelNumero = new JLabel("Numero de licencia:");
		labelPaisExpedicion = new JLabel("Pais de expedicion:");
		labelFechaVencimiento = new JLabel("Fecha de vencimiento:");
		labelImagen = new JLabel("Foto de licencia:");
		labelDatosContacto = new JLabel("Datos Contacto");
		labelTelefono = new JLabel("Telefono:");
		labelDireccion = new JLabel("Direccion:");
		labelEmail = new JLabel("Email:");
		labelDatosPago = new JLabel("Datos Pago");
		labelNumeroTarjeta = new JLabel("Numero Tarjeta:");
		labelExpiracion = new JLabel("Expiracion:");
		labelCVV = new JLabel("CVV:");
		
		
		tUsuario = new JTextField();
		tUsuario.setPreferredSize(new Dimension(120,20));
		
		tContrasena = new JTextField();
		tContrasena.setPreferredSize(new Dimension(120,20));
		
		tNombre = new JTextField();
		tNombre.setPreferredSize(new Dimension(120,20));
		
		tApellido = new JTextField();
		tApellido.setPreferredSize(new Dimension(120,20));
		
		tFechaNacimiento = new JTextField();
		tFechaNacimiento.setPreferredSize(new Dimension(120,20));
		
		tNacionalidad = new JTextField();
		tNacionalidad.setPreferredSize(new Dimension(120,20));
		
		tNumero = new JTextField();
		tNumero.setPreferredSize(new Dimension(120,20));
		
		tPaisExpedicion = new JTextField();
		tPaisExpedicion.setPreferredSize(new Dimension(120,20));
		
		tFechaVencimiento = new JTextField();
		tFechaVencimiento.setPreferredSize(new Dimension(120,20));
		
		tTelefono = new JTextField();
		tTelefono.setPreferredSize(new Dimension(120,20));
		
		tDireccion = new JTextField();
		tDireccion.setPreferredSize(new Dimension(120,20));
		
		tEmail = new JTextField();
		tEmail.setPreferredSize(new Dimension(120,20));
		
		tNumeroTarjeta = new JTextField();
		tNumeroTarjeta.setPreferredSize(new Dimension(120,20));
		
		tExpiracion = new JTextField();
		tExpiracion.setPreferredSize(new Dimension(120,20));
		
		tCVV = new JTextField();
		tCVV.setPreferredSize(new Dimension(120,20));

		confirmar = new JButton("Confirmar");
		confirmar.setActionCommand("Confirmar");
		confirmar.addActionListener(this);
		
		ImagenID = new JButton("ImagenID");
		ImagenID.setActionCommand("ImagenID");
		ImagenID.addActionListener(this);
		
		Imagen = new JButton("Imagen");
		Imagen.setActionCommand("Imagen");
		Imagen.addActionListener(this);
		
		
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		add(labelPeticion);
		add(labelUsuario);
		add(tUsuario);
		add(labelContrasena);
		add(tContrasena);
		add(labelContrasena);
		add(tContrasena);
		add(labelNombre);
		add(tNombre);
		add(labelApellido);
		add(tApellido);
		add(labelFechaNacimiento);
		add(tFechaNacimiento);
		add(labelNacionalidad);
		add(tNacionalidad);
		add(labelImagenID);
		add(ImagenID);
		add(labelDatosLicencia);
		add(labelNumero);
		add(tNumero);
		add(labelPaisExpedicion);
		add(tPaisExpedicion);
		add(labelFechaVencimiento);
		add(tFechaVencimiento);
		add(labelImagen);
		add(Imagen);
		add(labelDatosContacto);
		add(labelTelefono);
		add(tTelefono);
		add(labelDireccion);
		add(tDireccion);
		add(labelEmail);
		add(tEmail);
		add(labelDatosPago);
		add(labelNumeroTarjeta);
		add(tNumeroTarjeta);
		add(labelExpiracion);
		add(tExpiracion);
		add(labelCVV);
		add(tCVV);
		add(confirmar);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String grito = e.getActionCommand();
		
		String usuario = tUsuario.getText();
		String contrasena = tContrasena.getText();
		String nombre = tNombre.getText();
		String apellido = tApellido.getText();
		String fechaNacimiento = tFechaNacimiento.getText();
		String nacionalidad = tNacionalidad.getText();
		String numero = tNumero.getText();
		String paisExpedicion = tPaisExpedicion.getText();
		String fechaVencimiento = tFechaVencimiento.getText();

		String telefono = tTelefono.getText();
		String direccion = tDireccion.getText();
		String email = tEmail.getText();
		String numeroTarjeta = tNumeroTarjeta.getText();
		String expiracion = tExpiracion.getText();
		String CVV = tCVV.getText();

		if (grito.equals("Confirmar")) {
			// crear nuevo usuario a interfaz
			
			interfaz.InicioCliente();
		}
		
	}
	
}
