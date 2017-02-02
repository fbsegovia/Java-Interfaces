package Entidades;

import interfaces.Movible;

public abstract class Animal implements Movible{
	
	//Tenemos visibilidad en la propia clase.
	//Las clases que extiendan de ella las clases dentro del propio paquete de unidades.
	//"protected" solo permite usar sus datos a la clase, a sus herederas y del package.
	protected double peso;
	protected Tamaño tamaño;
	protected String nombre;
	
	public abstract void comer(Object comida);
	
	public double getPeso(){
		return peso;
	}
	public Tamaño getTamaño() {
		return tamaño;
	}
	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	@Override
	public void moverseLento() {
		System.out.println("Soy un animal y me muevo 5 metros");
	}
	@Override
	public void moverserRapido() {
		System.out.println("Soy un animal y me muevo 15 metros");
	}
	
	
	
}
