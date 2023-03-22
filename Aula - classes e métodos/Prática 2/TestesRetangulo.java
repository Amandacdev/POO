
public class TestesRetangulo {
	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		
		//Since the attributes are private (encapsulated), we need the set/get methods
		r1.setId(1);
		r1.setLargura(2);
		r1.setComprimento(7);
		
		System.out.println("A área do retângulo r1 é: " + r1.calcularArea());
		
		Retangulo r2 = new Retangulo(2,4,8);
		
		//Testing methods
		System.out.println("A área do retângulo r2 é: " + r2.calcularArea());
		r2.enquadrar();
		System.out.println("É quadrado? => " + r1.ehQuadrado());
		System.out.println("É quadrado? => " + r2.ehQuadrado());
		System.out.println(r1.toString());
		
		System.out.println("São equivalentes? => " + r1.ehEquivalente(r2));
		
		//Overload method, with a number as a parameter
		System.out.println("A área do retângulo r1 é: " + r1.calcularArea());
		r1.redimensionar(0.8);
		System.out.println("A área do retângulo r1 é: " + r1.calcularArea());
		
		//Overload method, now with an object as a parameter
		System.out.println("A área do retângulo r2 é: " + r2.calcularArea());
		r2.redimensionar(r1);
		System.out.println("A área do retângulo r2 é: " +r2.calcularArea());
		
		
		Retangulo r3 = new Retangulo(5);
		System.out.println(r3.toString());
		System.out.println("A área do retângulo r3 é: " + r3.calcularArea());
		}
	
}
