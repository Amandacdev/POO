package exerc_conta;

public class Conta {
	private String numero;
	private String cpf;
	private double saldo = 0;
	
	public Conta(String numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	};
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String toString() {
		return "Numero= " + getNumero() + ", cpf= " + getCpf() + ", saldo= " + getSaldo();
	}

	public void debitar(double valor) throws Exception {
		if(valor>getSaldo()) {
			throw new Exception("Saldo em conta insuficiente");
		}	
		setSaldo(getSaldo()-valor);	
	}
		
	public void creditar(double valor) {
		double total = getSaldo() + valor;
		setSaldo(total);
	}
	
	public void transferir(double valor, Conta conta) throws Exception{
		this.debitar(valor);
		conta.creditar(valor);	
	}
}
