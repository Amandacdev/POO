package exerc_participante;

public class Participante {
	private String email;
	private String nome;
	private int idade;
	//private double preco = 1000;
	
	public Participante(String email, String nome, int idade) {
		this.email = email;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPercentual() {
		if(getIdade()<18) {
			return 0.50;
		}
		else if(getIdade()<60) {
			return 0;
		}
		else {
			return 0.20;
		}
	}
	
	public double getValorPago(double preco) {
		return(preco - (preco*getPercentual()));
	}
	public String toString() {
		return "Nome:" + getNome() + 
				" |Idade:" + getIdade() + 
				" |Email " + getEmail() + 
				" |Desconto:" + getPercentual();
				//" |Valor final de entrada:" + getValorPago();
	}
}
