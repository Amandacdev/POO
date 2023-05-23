package exerc_conta;

//A contaEspecial difere da conta "padrão" por ter um limite de valor negativo permitido.

public class ContaEspecial extends Conta {
	private double limite; 
	
	public ContaEspecial(String numero, String cpf,double limite) {
		super(numero, cpf);
		this.limite = limite;	
	}
	
	public double getLimite() {
		return limite;
	}
	
	public String toString() {
		return super.toString() + ", limite= " + getLimite();
	}
	
	public void debitar(double valor) throws Exception {
		if(valor > getSaldo() + getLimite()){
			throw new Exception("Excede o limite de " + getLimite());
		}	
		setSaldo(getSaldo()- valor);
	}
}
