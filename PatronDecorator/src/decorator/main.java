package decorator;

public class main {
	 public static void main(String[] args) {
		
		 IPerson pinterfaz= new Persona("Angel",23);
		 
		IPerson persona = new PersonaDecorator(pinterfaz, 0);
		PersonaDecorator p = new PersonaDecorator(pinterfaz, 0);
		
		 System.out.println("Persona"+pinterfaz+" estado laboral "+persona.estadoLaboral()+" años trabajados "+p.getEdadLaboral());
	 }
}
