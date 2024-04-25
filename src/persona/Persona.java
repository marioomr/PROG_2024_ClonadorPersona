package persona;

/**
 * Clase persona
 */
public class Persona {

	private String nombre;
	private int edad;
	private float peso;
	private float altura;
	
	/**
	 * constructor persona
	 * @param nombre
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * Getter del nombre
	 * @return el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Getter de edad
	 * @return la edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Setter de la edad
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * Getter del peso
	 * @return el peso de la persona
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * Setter del peso
	 * @param peso
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}


	/**
	 * Getter de la altura
	 * @return la altura de la persona
	 */
	public float getAltura() {
		return altura;
	}


	/**
	 * Setter de la altura
	 * @param altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	/**
	 * to String con los parámetros de la persona
	 */
	@Override
	public String toString() {
		return "Persona {" + nombre + "} - <" + edad + "> - (" + peso + ") - -" + altura + "-]";
	}
	
	
	
	
}
