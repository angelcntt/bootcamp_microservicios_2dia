package Singleton;

public class Persona {
   private String name;
   private int age;
		
   
   		private Persona(String name, int age) {
				this.name = name;
				this.age = age;
   		}
   		
   		public static Persona getInstance() {
   			return new Persona("Angel",23);
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
   
		
		/*
		 * Para que el singleton tenga una operacion he creado el cumpleaños de la persona que suma un año a la persona alojada en el singleton
		 */
		public Boolean cumpleAños() {
			this.setAge(this.getAge()+1);
			return true;
		}
		
		
}
