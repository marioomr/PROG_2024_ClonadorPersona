package clonador;

import java.util.ArrayList;
import java.util.List;

import persona.Persona;
import persona.PersonaData;

public class ClonadorPersonas {

	private String nombre;
	
	/**
	 * 
	 * @param nombre
	 * @return 
	 */
	public ClonadorPersonas(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */
	public List<Persona> generarClones() {
		
		List<Persona> personas = new ArrayList<Persona>();
		
		for(int i=0; i<10; i++) {
			try {
				int edad = (int) (Math.random()*PersonaData.EDAD_MAX);
				float altura = (float) (Math.random()*PersonaData.ALTURA_MAX);
				float peso = (float) (Math.random()*PersonaData.PESO_MAX);
				Persona p1 = new Persona(nombre, edad, peso, altura);
				personas.add(p1);
			}
			
			catch (Exception e) {
				System.out.println("Error "+ e.getMessage());
			}
		}
		
		return personas;
	}
	
	
}
