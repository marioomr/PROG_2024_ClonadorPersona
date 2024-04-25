package main;

import java.util.List;
import clonador.ClonadorPersonas;
import persona.Persona;

public class Start {

	public static void main(String[] args) {
		

		ClonadorPersonas clonacion = new ClonadorPersonas("Mario");
		List<Persona> personas = clonacion.generarClones();
		
		System.out.println("Personas:");
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
