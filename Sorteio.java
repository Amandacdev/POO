import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		Random sorteio = new Random();
		int numero;
		for(int i=1; i<=6; i++) {
			numero = sorteio.nextInt(10);
			System.out.println(numero);
		}

	}

}
