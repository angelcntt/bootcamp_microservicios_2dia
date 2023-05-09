package Singleton;

public class Persona implements InterfazPersona {
   private String name;
   private int age;
		
   
   		public Persona(String name, int age) {
				this.name = name;
				this.age = age;
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
   
		public Persona clone() {
			return new Persona(this.getName(),this.getAge());
		}
		
		
		
}
