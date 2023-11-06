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

public class VistaInicioSesionCliente extends JPanel implements ActionListener {
	
	private JLabel labelUsuario;
	private JLabel labelContrasena;
	private JLabel labelNuevaCuenta;
	
	private JTextField textUsuario;
	private JTextField textContrasena;
	
	private JButton confirmar;
	private JButton nuevaCuenta;
	
	private InterfazEmpresa interfaz;
	
	public VistaInicioSesionCliente(InterfazEmpresa interfaz) {

		this.interfaz = interfaz;
		
		TitledBorder border = new TitledBorder("Inicio Sesión");
		setBorder(border);
		setPreferredSize(new Dimension(300,100));
		
		
		labelUsuario = new JLabel("Usuario");
		labelContrasena = new JLabel("Contraseña");
		labelNuevaCuenta = new JLabel("Sing In");
		
		textUsuario = new JTextField();
		textUsuario.setPreferredSize(new Dimension(120,20));
		
		textContrasena = new JTextField();
		textContrasena.setPreferredSize(new Dimension(120,20));

		confirmar = new JButton("Confirmar");
		confirmar.setActionCommand("Confirmar");
		confirmar.addActionListener(this);
		
		nuevaCuenta = new JButton("nuevaCuenta");
		nuevaCuenta.setActionCommand("nuevaCuenta");
		nuevaCuenta.addActionListener(this);
		
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		add(labelUsuario);
		add(textUsuario);
		add(labelContrasena);
		add(textContrasena);
		add(confirmar);
		add(labelNuevaCuenta);
		add(nuevaCuenta);
	}
		
	
	//FLOWLAYOUT, BORDERLAYOUT, GRIDLAYOUT


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String grito = e.getActionCommand();
		String usuario = textUsuario.getText();
		String contrasena = textContrasena.getText();
		
		if (grito.equals("Confirmar")) {
			boolean cUsuarioReg = interfaz.buscarUsuario();
			if (cUsuarioReg == true) {
				interfaz.menuCliente();
			}
			else {
				JOptionPane.showMessageDialog(this,"El usuario o contraseña son incorrectos", "Usuario no encontrado", JOptionPane.INFORMATION_MESSAGE );
			}
		}
		else if (grito.equals("nuevaCuenta")) {
				interfaz.nuevaCuenta();
		}
		
	}
	
}
