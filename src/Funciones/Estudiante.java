package Funciones;

import java.util.Date;

public class Estudiante {
	public String Carnet;
	public String Nombre;
	public String NomProyecto;
	public Date FechaEntrega;
	public Date FechaLimite;
	public double Calificacion;
	
	public Estudiante(String carnet, String nombre, String nomProyecto, Date fechaEntrega, Date fechaLimite,
			double calificacion) {

		Carnet = carnet;
		Nombre = nombre;
		NomProyecto = nomProyecto;
		FechaEntrega = fechaEntrega;
		FechaLimite = fechaLimite;
		Calificacion = calificacion;
		
	}
	
	
}
