package builder;

public class main {
	 public static void main(String[] args) {
		Persona persona = new Persona(new PersonaBuilder("Angel",23)); 
		
		System.out.println(persona);
		
	 }
}
