package Singleton;

public class main {
	 public static void main(String[] args) throws CloneNotSupportedException {
		
		 Persona p1=new Persona("Angel",23);
		 System.out.println("Persona dada "+p1);
		 
		 Persona p2=p1.clone();
		 System.out.println("Copia de la primera persona"+p2);
		 
		 PersonaCloneable personaClone= new PersonaCloneable("Pepe", 90);
		 System.out.println("Persona Clone"+personaClone);
		 
		 PersonaCloneable prClone2=personaClone.clone();
		 
		 System.out.println("Pr Clone 2"+prClone2);
		 
	 }
}
