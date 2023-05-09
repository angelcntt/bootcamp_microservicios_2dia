package decorator;

public class PersonaDecorator implements IPerson{

	
	private IPerson persona;
	private int edadLaboral;
	
	
	public PersonaDecorator(IPerson person,int edadLaboral) {
		this.persona = person;
		this.edadLaboral=edadLaboral;
	}


	public IPerson getPersona() {
		return persona;
	}



	public void setPersona(IPerson persona) {
		this.persona = persona;
	}



	public int getEdadLaboral() {
		return edadLaboral;
	}



	public void setEdadLaboral(int edadLaboral) {
		this.edadLaboral = edadLaboral;
	}

   

	@Override
	public String estadoLaboral() {
		return "Estudiante";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
