
public class Triangulo {
	public double base;
	public double altura;
	
	public Triangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	public double CalcularArea() {
		double area = (base*altura)/2;
		return area;
	}
	public String toString() {
		return "Triângulo [base= " + base + " |altura= " + altura + "]";
		
	}
}

