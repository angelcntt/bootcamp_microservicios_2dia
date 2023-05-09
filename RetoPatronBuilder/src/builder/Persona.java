package builder;

public class Persona {
   private String name;
   private int age;
		
	   	
   
   		public Persona(PersonaBuilder p) {
				this.name = p.getNombre();
				this.age = p.getEdad();
   		}
   		
   		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Persona [name=" + name + ", age=" + age + "]";
		}
   	
			
}
