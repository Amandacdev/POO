import java.util.Scanner;

import javax.swing.JOptionPane;


public class PrimeiroExemplo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Qual é o seu nome?");
		
		//String nome1 = teclado.nextLine();
		String nome1 = JOptionPane.showInputDialog("Qual o seu nome?");
	
		//System.out.println(nome1 + ", de quem vc é amigo?");
		JOptionPane.showMessageDialog(null, nome1 + ", de quem vc é amigo?");
		
		
		//String nome2 = teclado.nextLine();
		String nome2 = JOptionPane.showInputDialog("Qual o nome do seu amigo?");
		
		System.out.println(nome1 + " é amigo de "+ nome2);
		teclado.close();
		

	}

}
