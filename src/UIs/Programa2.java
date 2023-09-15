 package UIs;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.util.Arrays;
import java.util.Comparator;

import Funciones.Estudiante;
import Funciones.Interfaz;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.toedter.calendar.JDateChooser;


public class Programa2 extends JPanel {

	private static final long serialVersionUID = -9097426163847681658L;

	private JTextField CantidadIng;
	private JTextField CarnetIng;
	private JTextField NombreIng;
	private JTextField ProyectoIng;
	
	public int N,Tam,i,Pos;

	
	public Estudiante[] estudiantes;
	private JTextField CalificacionIng;
	JTable table;
	public Programa2(Interfaz interfaz) {
		String[] encabezado= {"Carnet","Nomb. & Apell.","Nomb. Proyecto","Fecha Entrega","Fecha Límite","Calificación"};
		setBounds(0,0,750,600);
		setVisible(true);
		setBackground(new Color(249, 248, 246));
		setLayout(null);
		
        DefaultTableModel model = new DefaultTableModel();
        
        for(String st:encabezado) {
        	model.addColumn(st);
        }
        
        table = new JTable(model);

        table.setPreferredScrollableViewportSize(new Dimension(450,63));
        table.setFillsViewportHeight(true);

        JScrollPane js=new JScrollPane(table);
        js.setBounds(47, 273, 660, 265);
        js.setVisible(true);
        add(js);
      

		
		
		JLabel CantidadLbl = new JLabel("Cantidad de estudiantes a ingresar:");
		CantidadLbl.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		CantidadLbl.setBounds(66, 78, 390, 36);
		add(CantidadLbl);
		
		CantidadIng = new JTextField();
		CantidadIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CantidadIng.setBounds(466, 78, 86, 36);
		add(CantidadIng);
		CantidadIng.setColumns(10);
		
		JLabel IDLbl = new JLabel("Carnet:");
		IDLbl.setHorizontalAlignment(SwingConstants.CENTER);
		IDLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		IDLbl.setBounds(19, 125, 130, 36);
		add(IDLbl);
		
		JLabel NombreLbl = new JLabel("Nombre:");
		NombreLbl.setHorizontalAlignment(SwingConstants.CENTER);
		NombreLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		NombreLbl.setBounds(159, 125, 143, 36);
		add(NombreLbl);
		
		JLabel Proyectolbl = new JLabel("Proyecto:");
		Proyectolbl.setHorizontalAlignment(SwingConstants.CENTER);
		Proyectolbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Proyectolbl.setBounds(312, 125, 115, 36);
		add(Proyectolbl);
		
		JLabel FechaLbl = new JLabel("<html> &ensp; Fecha<br>de entrega:</html>");
		FechaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		FechaLbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		FechaLbl.setBounds(437, 125, 98, 45);
		add(FechaLbl);
		
		CarnetIng = new JTextField();
		CarnetIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CarnetIng.setColumns(10);
		CarnetIng.setBounds(19, 162, 130, 36);
		add(CarnetIng);
		
		NombreIng = new JTextField();
		NombreIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NombreIng.setColumns(10);
		NombreIng.setBounds(159, 162, 143, 36);
		add(NombreIng);
		
		ProyectoIng = new JTextField();
		ProyectoIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ProyectoIng.setColumns(10);
		ProyectoIng.setBounds(312, 162, 115, 36);
		add(ProyectoIng);
		
		JButton Programa1Boton = new JButton("Programa 1");
		Programa1Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.restart1();
			}
		});
		Programa1Boton.setBounds(107, 11, 109, 23);
		add(Programa1Boton);
		
		JButton Programa2Boton = new JButton("Programa 2");
		Programa2Boton.setEnabled(false);

		Programa2Boton.setBounds(507, 11, 109, 23);
		add(Programa2Boton);
		
		JButton IngresarBtn = new JButton("Ingresar");
		IngresarBtn.setBounds(41, 209, 89, 23);
		add(IngresarBtn);
		
		JButton MostrarBtn = new JButton("Mostrar");

		MostrarBtn.setBounds(140, 209, 89, 23);
		add(MostrarBtn);
		
		JButton EstablecerBtn = new JButton("Establecer");
		EstablecerBtn.setBounds(583, 68, 98, 23);
		add(EstablecerBtn);
		
		JButton ReiniciarBtn = new JButton("Reiniciar");

		ReiniciarBtn.setBounds(583, 91, 98, 23);
		add(ReiniciarBtn);
		
		JButton EliminarBtn = new JButton("Eliminar");

		EliminarBtn.setBounds(239, 209, 89, 23);
		add(EliminarBtn);
		
		JButton BuscarBtn = new JButton("Buscar");

		BuscarBtn.setBounds(437, 209, 89, 23);
		add(BuscarBtn);
		
		JButton tardiosBtn = new JButton("<html> &ensp; Entregas de<br>proyectos tardías</html>");

		tardiosBtn.setBounds(536, 209, 143, 37);
		add(tardiosBtn);
		
		JLabel CalificacionLbl = new JLabel("Nota:");
		CalificacionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		CalificacionLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		CalificacionLbl.setBounds(620, 125, 66, 36);
		add(CalificacionLbl);
		
		CalificacionIng = new JTextField();
		CalificacionIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CalificacionIng.setColumns(10);
		CalificacionIng.setBounds(620, 162, 68, 36);
		add(CalificacionIng);
		
		ReiniciarBtn.setEnabled(false);
		IngresarBtn.setEnabled(false);
		EliminarBtn.setEnabled(false);
		BuscarBtn.setEnabled(false);
		MostrarBtn.setEnabled(false);
		tardiosBtn.setEnabled(false);
		
		JButton ModificarBtn = new JButton("Modificar");

		ModificarBtn.setEnabled(false);
		ModificarBtn.setBounds(338, 209, 89, 23);
		add(ModificarBtn);
		
		JButton AboutBtn = new JButton("?");
		AboutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Jose Antonio Marin Zelaya 2021-0056U <br> Camilo Sebastián Villalobo Soza 2022-0291U<br>Algoritmizacion y estructura de datos 29/08/2023 </html>","Creditos c:",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/UIs/logoUni.png"));
			}
		});
		AboutBtn.setBounds(342, 11, 59, 23);
		add(AboutBtn);
		
		JLabel lblenspFechaLimite = new JLabel("<html> Fecha<br> limite:</html>");
		lblenspFechaLimite.setHorizontalAlignment(SwingConstants.CENTER);
		lblenspFechaLimite.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblenspFechaLimite.setBounds(537, 125, 73, 45);
		add(lblenspFechaLimite);
		
		JDateChooser FechaEntregaIng = new JDateChooser();
		FechaEntregaIng.getCalendarButton().setIcon(new ImageIcon(Programa2.class.getResource("/UIs/JDateChooser.gif")));
		FechaEntregaIng.setBounds(447, 178, 74, 20);
		add(FechaEntregaIng);
		
		JDateChooser FechaLimiteIng = new JDateChooser();
		FechaLimiteIng.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		FechaLimiteIng.getCalendarButton().setIcon(new ImageIcon(Programa2.class.getResource("/UIs/JDateChooser.gif")));
		FechaLimiteIng.setBounds(536, 178, 74, 20);
		add(FechaLimiteIng);
		
		EstablecerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tam= Integer.parseInt(CantidadIng.getText());
				
				estudiantes= new Estudiante[Tam];
				N=0;
				ReiniciarBtn.setEnabled(true);
				IngresarBtn.setEnabled(true);
				EliminarBtn.setEnabled(true);
				BuscarBtn.setEnabled(true);
				MostrarBtn.setEnabled(true);
				tardiosBtn.setEnabled(true);

				ModificarBtn.setEnabled(true);

			}
		});
		
		IngresarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(N <=Tam-1) {

					if(BuscarOrdenado(CarnetIng.getText()))
						JOptionPane.showMessageDialog(null, "El carnet "+CarnetIng.getText()+ " ya existe.");
					else {
					estudiantes[N]=new Estudiante(CarnetIng.getText(),NombreIng.getText(),ProyectoIng.getText(),FechaEntregaIng.getDate(),FechaLimiteIng.getDate(),Double.parseDouble(CalificacionIng.getText()));
					N++;
					Ordenamiento();
					}
				}
				
				else JOptionPane.showMessageDialog(null, "No hay espacio para mas estudiantes.");
			}
		});
		
		ModificarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CarnetIng.getText();
				while(i<N && !x.equals(estudiantes[i].Carnet)) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El carnet "+x+" no esta registrado");
				
				else {
					
					estudiantes[i].Carnet=CarnetIng.getText();
					estudiantes[i].Nombre=NombreIng.getText();
					estudiantes[i].NomProyecto=ProyectoIng.getText();
					estudiantes[i].FechaEntrega=FechaEntregaIng.getDate();
					estudiantes[i].FechaLimite=FechaLimiteIng.getDate();
					estudiantes[i].Calificacion=Double.parseDouble(CalificacionIng.getText());
					JOptionPane.showMessageDialog(null, "La persona con carnet "+x+" se ha actualizado.");
					
				}
			}
		});
		
		EliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CarnetIng.getText();
				while(i<N && !x.equals(estudiantes[i].Carnet)) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El carnet "+x+" no esta registrado");
				
				else {
					
					for(int k=i;k<N-1;k++) {
						estudiantes[k]=estudiantes[k+1];
					}
					N--;

					JOptionPane.showMessageDialog(null, "La persona con carnet "+x+" se ha eliminado.");					
				}
			}
		});
		
		MostrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ordenamiento();
				DefaultTableModel dm = (DefaultTableModel)table.getModel();
				dm.getDataVector().removeAllElements();
				for(i=0;i<N;i++) {
					dm.addRow(new Object[] {estudiantes[i].Carnet,estudiantes[i].Nombre,estudiantes[i].NomProyecto,estudiantes[i].FechaEntrega,estudiantes[i].FechaLimite,estudiantes[i].Calificacion});
				}
				dm.fireTableDataChanged();
			}
		});
		
		BuscarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String x;
				
				x= CarnetIng.getText();
				while(i<N && !x.equals(estudiantes[i].Carnet)) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El carnet "+x+" no esta registrado");
				
				else {

					DefaultTableModel dm = (DefaultTableModel)table.getModel();
					dm.getDataVector().removeAllElements();
					dm.addRow(new Object[] {estudiantes[i].Carnet,estudiantes[i].Nombre,estudiantes[i].NomProyecto,estudiantes[i].FechaEntrega,estudiantes[i].FechaLimite,estudiantes[i].Calificacion});
					dm.fireTableDataChanged();
				}
			}
		});
		
		tardiosBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    DefaultTableModel dm = (DefaultTableModel) table.getModel();
			    dm.getDataVector().removeAllElements();
			    
			    for (int i = 0; i < N; i++) {
			        if (estudiantes[i].FechaEntrega.compareTo(estudiantes[i].FechaLimite) > 0) {
						dm.addRow(new Object[] {estudiantes[i].Carnet,estudiantes[i].Nombre,estudiantes[i].NomProyecto,estudiantes[i].FechaEntrega,estudiantes[i].FechaLimite,estudiantes[i].Calificacion});

			        }
			    }
			    
			    dm.fireTableDataChanged();
			}
		});
		
		ReiniciarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.restart2();
			}
		});
		
		Programa2Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.restart2();
			}
			
		});
	}
	
	public boolean BuscarOrdenado(String x) {
		i=0;
		boolean encontrado=false;
		while(i<N) {
			if(estudiantes[i].Carnet.toLowerCase()==x.toLowerCase())
				encontrado=true;
			i++;
		}
		
		return encontrado;
	}
	
	public void Ordenamiento() {
	    Arrays.sort(estudiantes, 0, N, new Comparator<Estudiante>() {
	        public int compare(Estudiante e1, Estudiante e2) {
	            return e1.FechaEntrega.compareTo(e2.FechaEntrega);
	        }
	    });		
	}
}
