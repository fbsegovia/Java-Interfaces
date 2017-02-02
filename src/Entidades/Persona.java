package Entidades;

import interfaces.Movible;

/*Queremos implementar los metodos del interfaz a la clase Persona*/
/*al no ser interfaz una clase abtracta se deben implementar los métodos de la misma*/
public class Persona implements Movible{
	private String nombre;
	private int capacidadMovimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/*Implementamos los métodos del interfaz Movible*/
	/*importando el interfaz primero*/
	@Override
	public void moverseLento() {
		System.out.println("Soy la persona "+nombre+" y me muevo "+capacidadMovimiento+" metros.");
	}
	@Override
	public void moverserRapido() {
		System.out.println("Soy la persona "+nombre+" y me muevo "+(capacidadMovimiento*2)+" metros.");
	}
	
	public int getCapacidadMovimiento() {
		return capacidadMovimiento;
	}
	public void setCapacidadMovimiento(int capacidadMovimiento) {
		this.capacidadMovimiento = capacidadMovimiento;
	}
	
	
	
}
