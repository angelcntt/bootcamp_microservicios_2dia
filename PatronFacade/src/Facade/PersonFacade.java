package Facade;

import java.util.List;
import java.util.ArrayList;
public class PersonFacade {
	private List<Persona> personas = new ArrayList<Persona>();

	public PersonFacade() {
		
		this.personas.add(new Persona("Angel",23));
		this.personas.add(new Persona("Pepe",23));
		this.personas.add(new Persona("Pepe2",29));
	}
	
	public List<Persona> getPersonas() {
		return this.personas;
	}
	
	/**
	 * Añade persona si edad es mayor o igual a 20 y menor  o igual 30
	 * devuelve verdadero o falso si ha podido
	 * @return
	 */
	public boolean anyadepersona(Persona per) {
		if(per.getAge()>=20 && per.getAge()<=30) {
			this.personas.add(per);
			return true;
		}
		return false;
	}
	
}
