
public class Teste {
	
	public static void main(String[] argas) {
		Dog pluto = new Dog("pluto",12);
		Cat lila = new Cat("lila",6,2);

		System.out.println(pluto);
		System.out.println(lila);
				
		Animal a;   //polymorphic variable
		a = new Cat("blue",4,3);
		System.out.println(a.makeSound());
		a = new Dog("gust",9);
		System.out.println(a.makeSound());
		
		veterinarian pedro = new veterinarian("Pedro");
		System.out.println(pedro.injection(pluto));
		
	}
	
}
