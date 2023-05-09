package Singleton;

public class main {
	 public static void main(String[] args) {
		
		 Persona p = Persona.getInstance();
		 System.out.println("Persona dada "+p);
		 
		 p.setName("PEPE");
		 p.setAge(90);
		 System.out.println("Cambiado la instancia dada"+p);
		 
		 p.cumpleAños();
		 
		 System.out.println("Ha cumplido años "+p);
	 }
}
