import javax.swing.JOptionPane;



public class IMC {

	public static void main(String[] args) {
		//double peso = 150;
		
		
		//Recebendo informação do usuário - opção 1
		//Scanner teclado = new Scanner (System.in);
		//String peso1 = teclado.nextLine();
		//double peso = Double.parseDouble(peso1);
		
		//Opção 2
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso?"));
		

		double altura = 1.70;
		double imc = peso / Math.pow(altura, 2);
		
		if (imc < 18.5)
			System.out.println("abaixo do normal");
		else
			if (imc < 25)
				System.out.println("normal");
			else
				if (imc < 30)
					System.out.println("acima do normal");
				else
					if (imc < 35)
						System.out.println("obesidade 1");
					else
						if (imc <40)
							System.out.println("obesidade 2");
						else
							System.out.println("obesidade 3");
		
			

	}

}
