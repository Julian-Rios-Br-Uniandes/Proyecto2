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

public class VistaMenuInicial  extends JPanel implements ActionListener {
		
	private JLabel saludos;
	
	private JButton empleado;
	private JButton cliente;
		
	private InterfazEmpresa interfaz;
		
	public VistaMenuInicial(InterfazEmpresa interfaz) {

		this.interfaz = interfaz;
			
		TitledBorder border = new TitledBorder("Empresa Vehiculos");
		setBorder(border);
		setPreferredSize(new Dimension(300,100));
			
			
		saludos = new JLabel("Bienvenido! Como desea ingresar?");
			
		empleado = new JButton("Empleado");
		empleado.setActionCommand("Empleado");
		empleado.addActionListener(this);
		
		cliente = new JButton("Cliente");
		cliente.setActionCommand("Cliente");
		cliente.addActionListener(this);
			
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
			
		add(saludos);
		add(empleado);
		add(cliente);
	}
			
		
	//FLOWLAYOUT, BORDERLAYOUT, GRIDLAYOUT


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String grito = e.getActionCommand();
			
		if (grito.equals("Empleado")) {
			interfaz.InicioEmpleado();	
		}
		else if (grito.equals("Cliente")) {
			interfaz.InicioCliente();
		}
			
	}
		
}
