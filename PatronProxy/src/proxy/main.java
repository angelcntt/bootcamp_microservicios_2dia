package proxy;

public class main {

	public static void main(String[] args) {
		PersonProxy prsProx = new PersonProxy();
		
		System.out.println("Persona pro"+prsProx.getPersona());

		prsProx.cumpleanyos();
		
		System.out.println("Persona pro"+prsProx.getPersona());
	}

}
