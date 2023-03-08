import java.util.Arrays;

public class AlunoFlex {
	private String nome;
	private double[] notas;
	
	public AlunoFlex(String nome, double...notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public int calcularMedia() {
		double soma=0;
		for(double valor: notas)
			soma = soma + valor; 
		
		double media = soma/notas.length;
		return (int)Math.round(media);
	}
	
	@Override
	public String toString() {
		return "AlunoFlex [nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}

	public static void main(String[] args) {
	Aluno a4 = new Aluno("Julia", 95, 75);
	System.out.println(a4);
	Aluno a5 = new Aluno("Lucas",75,90); 
	System.out.println(a5);
	}

}
