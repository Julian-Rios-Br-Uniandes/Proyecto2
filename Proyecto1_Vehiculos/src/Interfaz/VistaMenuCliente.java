package Interfaz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class VistaMenuCliente extends JPanel implements ActionListener {

	private JLabel labelNombre;
	private JLabel labelApellido;
	private JLabel labelUsuario;
	private JLabel labelRealizarReserva;
	private JLabel labelModificarReserva;
	private JLabel labelHistorial;
	
	private JButton RealizarReserva;
	private JButton ModificarReserva;
	private JButton Historial;
	
	private InterfazEmpresa interfaz;
	
	public VistaMenuCliente(InterfazEmpresa interfaz) {

		this.interfaz = interfaz;
		
		TitledBorder border = new TitledBorder("Inicio Sesión");
		setBorder(border);
		setPreferredSize(new Dimension(300,100));
		
		labelNombre = new JLabel("Pepito");
		labelApellido = new JLabel("Perez");
		labelUsuario = new JLabel("Velo_Sir_Raptor0000");
		labelRealizarReserva = new JLabel("Realizar reserva");
		labelModificarReserva = new JLabel("Modificar reserva");
		labelHistorial = new JLabel("Ver historial de alquileres");
		
		RealizarReserva = new JButton("Reserva");
		RealizarReserva.setActionCommand("Reserva");
		RealizarReserva.addActionListener(this);
		
		ModificarReserva = new JButton("Modificar");
		ModificarReserva.setActionCommand("Modificar");
		ModificarReserva.addActionListener(this);
		
		Historial = new JButton("Historial");
		Historial.setActionCommand("Historial");
		Historial.addActionListener(this);
		
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		add(labelNombre);
		add(labelApellido);
		add(labelUsuario);
		add(labelRealizarReserva);
		add(RealizarReserva);
		add(labelModificarReserva);
		add(ModificarReserva);
		add(labelHistorial);
		add(Historial);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
