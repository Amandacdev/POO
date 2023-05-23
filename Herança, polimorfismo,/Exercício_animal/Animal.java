
public abstract class Animal {
	private String name;
	private double weight;
	
	public Animal(String name, double weight) {
		super();                          //Constructor of the subclass, option here
		this.name = name;
		this.weight = weight;
	}
	
	
	public abstract String makeSound(); //abstract method(has no body)
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return "name= " + getName() + ", weight= " + getWeight() + ", sound= " + makeSound();
	} 
	
	
}
