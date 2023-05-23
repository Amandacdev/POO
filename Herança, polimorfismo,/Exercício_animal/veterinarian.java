
public class veterinarian {
	private String name;
	
	public veterinarian(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String injection(Animal a) { //a is a exemplo of a polymorphic variable
		return "Doctor " + getName() + " gave an injection in " + a.getName() + " that said " + a.makeSound();
	}

}
