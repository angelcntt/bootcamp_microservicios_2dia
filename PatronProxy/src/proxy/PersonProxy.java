package proxy;

public class PersonProxy implements IPersonProxy{
	protected Persona persona=new Persona("p",1);

	@Override
	public boolean cumpleanyos() {
		this.beforecumpleanios();
		persona.cumpleanyos();
		this.aftercumlpeanios();
		return true;
		
	}
	
	
	
	private void beforecumpleanios() {
		System.out.println("Le cantan cumpleaños feliz");
	}
	
	private void aftercumlpeanios() {
		System.out.println("Se acaba la fiesta");
	}



	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
}
