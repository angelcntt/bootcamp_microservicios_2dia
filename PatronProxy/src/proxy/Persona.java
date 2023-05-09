package proxy;

public class Persona implements IPersonProxy{
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


			/**
			 * Cuando cumple años edad +1
			 */
			@Override
			public boolean cumpleanyos() {
				this.setAge(this.getAge()+1);
				return true;
			}

			
}
