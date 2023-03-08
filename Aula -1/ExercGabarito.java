import javax.swing.JOptionPane;

public class ExercGabarito {
	public static void main(String[] args) {
		String gabarito = "abceedadca";
		String[] gabaritoPartes = gabarito.split("");
 		
		String resposta = JOptionPane.showInputDialog("Quais foram suas respostas?");
		JOptionPane.showMessageDialog(null, "Sua resposta: " + resposta);
		String[] respostaPartes = resposta.trim().split("");
		
		int acerto = 0;
		for(int quest=0; quest<=9; quest++) {
			if (gabaritoPartes[quest].equals(respostaPartes[quest]))
				acerto += 1;
		}
		JOptionPane.showMessageDialog(null, "Você acertou " + acerto + " questões.");

	}
}
