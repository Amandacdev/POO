import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestarSenha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//System.out.println("Digite a senha");
		
		String senha = JOptionPane.showInputDialog("Qual a senha?");
		//String senha = teclado.nextLine();
		
		while(!senha.equals("ifpb")) {
			//System.out.println("Tente outra vez!");
			//senha = teclado.nextLine();
			senha = JOptionPane.showInputDialog("Tente outra vez..");
		}
		teclado.close();
		JOptionPane.showInputDialog("Parabéns");
		System.out.println("Você acertou.");

	}

}
