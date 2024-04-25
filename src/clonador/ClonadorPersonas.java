package clonador;

import java.util.ArrayList;
import java.util.List;
import Persona.Persona;
import Persona.PersonaData;

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
			int edad = (int) (Math.random()*PersonaData.EDAD_MAX);
			float altura = (float) (Math.random()*PersonaData.ALTURA_MAX);
			float peso = (float) (Math.random()*PersonaData.PESO_MAX);

		}
		
		return personas;
	}
	
	
}
