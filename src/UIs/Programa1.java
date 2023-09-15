 package UIs;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

import Funciones.Cliente;
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
import javax.swing.JRadioButton;

public class Programa1 extends JPanel {

	private static final long serialVersionUID = -9097426163847681658L;

	private JTextField CantidadIng;
	private JTextField IDIng;
	private JTextField NombreIng;
	private JTextField DireccionIng;
	private JTextField TelefonoIng;
	
	public int N,Tam,i,Pos;

	
	public Cliente[] clientes;
	private JTextField DeudaIng;
	JTable table;
	public Programa1(Interfaz interfaz) {
		String[] encabezado= {"ID","Deuda.","Nombre","Dirección","Teléfono","Estado Deuda"};
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
      

		
		
		JLabel CantidadLbl = new JLabel("Cantidad de clientes a ingresar:");
		CantidadLbl.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		CantidadLbl.setBounds(66, 78, 390, 36);
		add(CantidadLbl);
		
		CantidadIng = new JTextField();
		CantidadIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CantidadIng.setBounds(466, 78, 86, 36);
		add(CantidadIng);
		CantidadIng.setColumns(10);
		
		JLabel IDLbl = new JLabel("ID:");
		IDLbl.setHorizontalAlignment(SwingConstants.CENTER);
		IDLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		IDLbl.setBounds(22, 124, 86, 36);
		add(IDLbl);
		
		JLabel NombreLbl = new JLabel("Nombre:");
		NombreLbl.setHorizontalAlignment(SwingConstants.CENTER);
		NombreLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		NombreLbl.setBounds(114, 124, 168, 36);
		add(NombreLbl);
		
		JLabel DireccionLbl = new JLabel("Direccion:");
		DireccionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		DireccionLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		DireccionLbl.setBounds(280, 124, 174, 36);
		add(DireccionLbl);
		
		JLabel TelefonoLbl = new JLabel("Telefono:");
		TelefonoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		TelefonoLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		TelefonoLbl.setBounds(476, 124, 102, 36);
		add(TelefonoLbl);
		
		IDIng = new JTextField();
		IDIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IDIng.setColumns(10);
		IDIng.setBounds(22, 161, 86, 36);
		add(IDIng);
		
		NombreIng = new JTextField();
		NombreIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NombreIng.setColumns(10);
		NombreIng.setBounds(114, 161, 168, 36);
		add(NombreIng);
		
		DireccionIng = new JTextField();
		DireccionIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DireccionIng.setColumns(10);
		DireccionIng.setBounds(288, 162, 176, 36);
		add(DireccionIng);
		
		TelefonoIng = new JTextField();
		TelefonoIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TelefonoIng.setColumns(10);
		TelefonoIng.setBounds(476, 161, 102, 36);
		add(TelefonoIng);
		
		JButton Programa1Boton = new JButton("Programa 1");
		Programa1Boton.setEnabled(false);
		Programa1Boton.setBounds(107, 11, 109, 23);
		add(Programa1Boton);
		
		JButton Programa2Boton = new JButton("Programa 2");

		Programa2Boton.setBounds(507, 11, 109, 23);
		add(Programa2Boton);
		
		JButton IngresarBtn = new JButton("Ingresar");
		IngresarBtn.setBounds(51, 209, 89, 23);
		add(IngresarBtn);
		
		JButton MostrarBtn = new JButton("Mostrar");

		MostrarBtn.setBounds(150, 209, 89, 23);
		add(MostrarBtn);
		
		JButton EstablecerBtn = new JButton("Establecer");
		EstablecerBtn.setBounds(583, 68, 98, 23);
		add(EstablecerBtn);
		
		JButton ReiniciarBtn = new JButton("Reiniciar");

		ReiniciarBtn.setBounds(583, 91, 98, 23);
		add(ReiniciarBtn);
		
		JButton EliminarBtn = new JButton("Eliminar");

		EliminarBtn.setBounds(150, 239, 89, 23);
		add(EliminarBtn);
		
		JButton BuscarBtn = new JButton("Buscar");

		BuscarBtn.setBounds(249, 209, 89, 23);
		add(BuscarBtn);
		
		JButton ConDeudasBtn = new JButton("<html> &ensp; Clientes<br>con deudas</html>");

		ConDeudasBtn.setBounds(348, 209, 102, 37);
		add(ConDeudasBtn);
		
		JLabel DeudaLbl = new JLabel("Deuda:");
		DeudaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		DeudaLbl.setFont(new Font("Tahoma", Font.PLAIN, 24));
		DeudaLbl.setBounds(588, 124, 120, 36);
		add(DeudaLbl);
		
		DeudaIng = new JTextField();
		DeudaIng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DeudaIng.setColumns(10);
		DeudaIng.setBounds(588, 162, 119, 36);
		add(DeudaIng);
		
		ReiniciarBtn.setEnabled(false);
		IngresarBtn.setEnabled(false);
		EliminarBtn.setEnabled(false);
		BuscarBtn.setEnabled(false);
		MostrarBtn.setEnabled(false);
		ConDeudasBtn.setEnabled(false);
		
		JButton ModificarBtn = new JButton("Modificar");

		ModificarBtn.setEnabled(false);
		ModificarBtn.setBounds(51, 239, 89, 23);
		add(ModificarBtn);
		
		JButton AboutBtn = new JButton("?");
		AboutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "<html>Jose Antonio Marin Zelaya 2021-0056U <br> Camilo Sebastián Villalobo Soza 2022-0291U<br>Algoritmizacion y estructura de datos 29/08/2023 </html>","Creditos c:",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/UIs/logoUni.png"));
			}
		});
		AboutBtn.setBounds(342, 11, 59, 23);
		add(AboutBtn);
		
		JButton SinDeudasBtn = new JButton("<html> &ensp; Clientes<br>sin deudas</html>");
		SinDeudasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    DefaultTableModel dm = (DefaultTableModel) table.getModel();
			    dm.getDataVector().removeAllElements();
			    
			    for (int i = 0; i < N; i++) {
			        if (clientes[i].EstadoDeuda) {
			            dm.addRow(new Object[]{
			                clientes[i].ID, clientes[i].Deuda, clientes[i].Nombre,
			                clientes[i].Direccion, clientes[i].Telefono, "Pagada"
			            });
			        }
			    }
			    
			    dm.fireTableDataChanged();
			}
		});
		SinDeudasBtn.setEnabled(false);
		SinDeudasBtn.setBounds(460, 209, 108, 36);
		add(SinDeudasBtn);
		
		JRadioButton PagadaRD = new JRadioButton("Pagada");
		PagadaRD.setEnabled(false);
		PagadaRD.setBackground(new Color(249, 248, 246));
		PagadaRD.setBounds(583, 209, 109, 23);
		add(PagadaRD);
		
		JRadioButton SinPagarRD = new JRadioButton("Sin Pagar");
		SinPagarRD.setSelected(true);
		SinPagarRD.setEnabled(false);
		SinPagarRD.setBackground(new Color(249, 248, 246));
		SinPagarRD.setBounds(583, 235, 109, 23);
		add(SinPagarRD);
		
		ButtonGroup G = new ButtonGroup();
		G.add(SinPagarRD);
		G.add(PagadaRD);
		
		EstablecerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tam= Integer.parseInt(CantidadIng.getText());
				
				clientes= new Cliente[Tam];
				N=0;
				ReiniciarBtn.setEnabled(true);
				IngresarBtn.setEnabled(true);
				EliminarBtn.setEnabled(true);
				BuscarBtn.setEnabled(true);
				MostrarBtn.setEnabled(true);
				ConDeudasBtn.setEnabled(true);
				SinDeudasBtn.setEnabled(true);
				ModificarBtn.setEnabled(true);
				SinPagarRD.setEnabled(true);
				PagadaRD.setEnabled(true);
			}
		});
		
		IngresarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(N <=Tam-1) {

					if(BuscarOrdenado(Integer.parseInt(IDIng.getText())))
						JOptionPane.showMessageDialog(null, "El ID "+IDIng.getText()+ " ya existe.");
					else {
					clientes[N]=new Cliente(Integer.parseInt(IDIng.getText()),Double.parseDouble(DeudaIng.getText()),NombreIng.getText(),DireccionIng.getText(),Integer.parseInt(TelefonoIng.getText()),PagadaRD.isSelected());
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
				int x;
				
				x= Integer.parseInt(IDIng.getText());
				while(i<N && x!=clientes[i].ID) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El ID "+x+" no esta registrado");
				
				else {

					clientes[i].ID=Integer.parseInt(IDIng.getText());
					clientes[i].Deuda=Double.parseDouble(DeudaIng.getText());
					clientes[i].Nombre=NombreIng.getText();
					clientes[i].Direccion=DireccionIng.getText();
					clientes[i].Telefono=Integer.parseInt(TelefonoIng.getText());
					clientes[i].EstadoDeuda=PagadaRD.isSelected();
					
					JOptionPane.showMessageDialog(null, "La persona con carnet "+x+" se ha actualizado.");
					
				}
			}
		});
		
		EliminarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				int x;
				
				x= Integer.parseInt(IDIng.getText());
				while(i<N && x!=clientes[i].ID) {
					i++;
				}
				
				if(i>=N) JOptionPane.showMessageDialog(null, "El ID "+x+" no esta registrado");
				
				else {
					for(int k=i;k<N-1;k++) {
						clientes[k]=clientes[k+1];
					}
					N--;

					JOptionPane.showMessageDialog(null, "La persona con ID "+x+" se ha eliminado.");
					
				}
			}
		});
		
		MostrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ordenamiento();
				DefaultTableModel dm = (DefaultTableModel)table.getModel();
				dm.getDataVector().removeAllElements();
				for(i=0;i<N;i++) {
					dm.addRow(new Object[] {clientes[i].ID,clientes[i].Deuda,clientes[i].Nombre,clientes[i].Direccion,clientes[i].Telefono,clientes[i].EstadoDeuda?"Pagada":"Sin pagar"});
				}
				dm.fireTableDataChanged();
			}
		});
		
		BuscarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				int x;
				
				x= Integer.parseInt(IDIng.getText());
				while(i<N && x!=clientes[i].ID) {
					i++;
				}
				if(i>=N) JOptionPane.showMessageDialog(null, "El ID "+x+" no esta registrado");
				
				else {
					DefaultTableModel dm = (DefaultTableModel)table.getModel();
					dm.getDataVector().removeAllElements();
					dm.addRow(new Object[] {clientes[i].ID,clientes[i].Deuda,clientes[i].Nombre,clientes[i].Direccion,clientes[i].Telefono,clientes[i].EstadoDeuda?"Pagada":"Sin pagar"});					
					dm.fireTableDataChanged();
				}
			}
		});
		
		ConDeudasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    DefaultTableModel dm = (DefaultTableModel) table.getModel();
			    dm.getDataVector().removeAllElements();
			    
			    for (int i = 0; i < N; i++) {
			        if (!clientes[i].EstadoDeuda) {
			            dm.addRow(new Object[]{
			                clientes[i].ID, clientes[i].Deuda, clientes[i].Nombre,
			                clientes[i].Direccion, clientes[i].Telefono, "Sin pagar"
			            });
			        }
			    }
			    
			    dm.fireTableDataChanged();
			}
		});
		
		ReiniciarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.restart1();
			}
		});
		
		Programa2Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaz.restart2();
			}
			
		});
	}
	
	public boolean BuscarOrdenado(int x) {
		i=0;
		boolean encontrado=false;
		while(i<N) {
			if(clientes[i].ID==x)
				encontrado=true;
			i++;
		}
		
		return encontrado;
	}
	
	public void Ordenamiento() {
	    Arrays.sort(clientes, 0, N, new Comparator<Cliente>() {
	        public int compare(Cliente c1, Cliente c2) {
	            return Double.compare(c1.Deuda, c2.Deuda);
	        }
	    });		
	}
	
}
