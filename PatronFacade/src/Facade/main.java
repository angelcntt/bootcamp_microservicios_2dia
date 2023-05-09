package Facade;

public class main {
	 public static void main(String[] args) {
		PersonFacade personFacade = new PersonFacade();
		 
		personFacade.getPersonas().forEach(n->System.out.println(n+"\n"));
		
		System.out.println("Esto da false "+(personFacade.anyadepersona(new Persona("x",10))));
		
		System.out.println("Esto da true "+(personFacade.anyadepersona(new Persona("x",30))));
		
		personFacade.getPersonas().forEach(n->System.out.println(n+"\n"));
		//usar 
	 }
}
