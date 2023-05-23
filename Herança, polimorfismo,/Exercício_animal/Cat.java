
public class Cat extends Animal{
	private double jump;
	
	public Cat(String name, double weight, double jump) {
		super(name,weight);
		this.jump = jump;
	}

	public String makeSound() {
		return "Miau";
	};
	
	public double getJump() {
		return jump;
	}
	
	public String toString() {
		return super.toString() + ", jump=" + getJump();
	}
	
}
	
