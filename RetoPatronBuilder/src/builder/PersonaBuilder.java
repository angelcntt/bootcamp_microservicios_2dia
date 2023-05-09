package builder;

public class PersonaBuilder {
		
	private final String nombre;
	
	private final int edad;

	
	
	public PersonaBuilder(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public Persona build() {
		return new Persona(this);
	}
	
	
	
}
