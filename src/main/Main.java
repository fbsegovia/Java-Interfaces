package main;

import java.util.ArrayList;
import interfaces.Movible;

import Entidades.*;

public class Main {

	public static void main(String[] args) {
		Trucha trucha = new Trucha();
		trucha.setNombre("Tomasa");
		trucha.setPeso(7.0);

		Ballena ballena = new Ballena();
		ballena.setNombre("Moby Dick");
		ballena.setPeso(180000.125);
		
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Robustiano");
		tiburon.setPeso(300.5);
		
		Oso oso = new Oso(TipoOso.PARDO);
		oso.setNombre("Yogi");
		oso.setPeso(400);
		oso.setTamaño(Tamaño.GRANDE);
		
		ArrayList<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(trucha);
		listaAnimales.add(ballena);
		listaAnimales.add(tiburon);
		listaAnimales.add(oso);
		
		Object comida = new Placton();
		for(Animal animal : listaAnimales){
			animal.comer(comida);
		}
		
		Trucha truchaComida = new Trucha();
		truchaComida.setNombre("Pepe");
		System.out.println("-------------");
		for(Animal animal : listaAnimales){
			animal.comer(truchaComida);
		}
		
		Pez ballenaComida = new Ballena();
		ballenaComida.setNombre("Pinocho");
		System.out.println("-------------");
		for(Animal animal : listaAnimales){
			animal.comer(ballenaComida);
		}
		
		System.out.println("*********Carrera*********");
		Persona carleguis = new Persona();
		carleguis.setNombre("Carl Laguis");
		carleguis.setCapacidadMovimiento(15);
		
		ArrayList<Movible> listaParticipantes = new ArrayList<>();
		listaParticipantes.add(carleguis);
		listaParticipantes.add(ballena);
		listaParticipantes.add(oso);
		listaParticipantes.add(tiburon);
		
		/*Un string al noser un objeto Movible
		 no puede ser añadido al array
		String s = new String();
		listaParticipantes.add(s);
		*/
		
		for(Movible movible : listaParticipantes){
			movible.moverserRapido();
		}
		
		
		
	}

}
