package Funciones;

public class Cliente {
	
	public int ID;
	public double Deuda;
	public String Nombre;
	public String Direccion;
	public int Telefono;
	public boolean EstadoDeuda;
	
	public Cliente(int iD, double deuda, String nombre, String direccion, int telefono, boolean estadoDeuda) {

		ID = iD;
		Deuda = deuda;
		Nombre = nombre;
		Direccion = direccion;
		Telefono = telefono;
		EstadoDeuda = estadoDeuda;
	}
	

}
