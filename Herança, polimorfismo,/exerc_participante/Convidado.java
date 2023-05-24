package exerc_participante;

public class Convidado extends Participante{
	private String empresa;
	
	public Convidado(String email, String nome, int idade, String empresa) {
		super(email,nome,idade);
		this.empresa = empresa;
	}

	//Desconto da idade + 50% de desconto
	public double getPercentual() {
		if(getIdade()<18) {
			return (0.50+0.50);
		}
		else if(getIdade()<60) {
			return (0+0.50);
		}
		else {
			return (0.20+0.50);
		}
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public String toString() {
		return super.toString( ) + " |Empresa: " + getEmpresa();
	}
	
}
