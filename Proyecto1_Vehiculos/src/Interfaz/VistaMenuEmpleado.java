package Interfaz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VistaMenuEmpleado extends JPanel implements ActionListener {
	
	private JLabel labelNombre;
	private JLabel labelRol;
	private JLabel labelConfirmarReserva;
	private JLabel labelCambiarEstadoV;
	
	private JButton ConfirmarReserva;
	private JButton CambiarEstadoV;
	
	private InterfazEmpresa interfaz;
	
	public VistaMenuEmpleado(InterfazEmpresa interfaz) {

		this.interfaz = interfaz;
		
		TitledBorder border = new TitledBorder("Inicio Sesión");
		setBorder(border);
		setPreferredSize(new Dimension(300,100));
		
		labelNombre = new JLabel("Pepito");
		labelRol = new JLabel("Rol");
		labelConfirmarReserva = new JLabel("Confirmar reserva");
		labelCambiarEstadoV = new JLabel("Cambiar estado vehiculo");
		
		ConfirmarReserva = new JButton("Confirmar");
		ConfirmarReserva.setActionCommand("Confirmar");
		ConfirmarReserva.addActionListener(this);
		
		CambiarEstadoV = new JButton("Cambiar");
		CambiarEstadoV.setActionCommand("Cambiar");
		CambiarEstadoV.addActionListener(this);
		
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		add(labelNombre);
		add(labelRol);
		add(labelConfirmarReserva);
		add(ConfirmarReserva);
		add(labelCambiarEstadoV);
		add(CambiarEstadoV);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
