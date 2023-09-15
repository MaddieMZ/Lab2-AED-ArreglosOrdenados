package UIs;

import java.awt.Container;
import javax.swing.*;

import Funciones.Interfaz;



public class Ventana extends JFrame implements Interfaz{

	private static final long serialVersionUID = -207441735480942911L;
	
	private Container panelActual;
	private int contenidoActual;

	public Ventana(int prog) {
		if(prog==1)
			getContentPane().add(new Programa1(this));
		
		else if(prog==2)
			getContentPane().add(new Programa2(this));
		setBounds(0,0,750,600);
		setTitle("Laboratorio 2 AED JoseMZ - Camilo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	@Override
	public void cambiarPrograma(int programa) {
		panelActual=getContentPane();
		panelActual.removeAll();
		
		switch(programa) {
			case 1:
				getContentPane().add(new Programa1(this));
				//panelActual.add(new Programa1(this));
				break;
				
			case 2:
				getContentPane().add(new Programa2(this));
				//panelActual.add(new Programa2(this));
				break;
			
		}
		invalidate();
		repaint();
		
	}
	@Override
	
	public int getContenido() {
		
		return contenidoActual;
	}
	@Override
	public void setContenido(int contenido) {
		
		this.contenidoActual=contenido;
	}

	@Override
	public void restart1() {
		setVisible(false);
		new Ventana(1);
	}
	@Override
	public void restart2() {
		setVisible(false);
		new Ventana(2);
	}
}
