package Banco;

public class Conta {
	private int numero;
	private String cpf;
	private double saldo;
		
	//Constructor method
	//Note: Method names must start with a lowercase letter
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;	
	}
	
	//Note: "this" can be implied
	//It is possible for a method to take more than one argument.
	
	public void creditar(double... lista) {
		for(double valor: lista)
			saldo += valor;
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) {
		this.debitar(valor);
		destino.creditar(valor);
	}
	
	public String toString() {
		return "Conta:[numero = " + numero + " |cpf = " + cpf + " |saldo = " + saldo + "]";
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//If the account has "saldo = 0", it returns true, otherwise it returns false.
	public boolean vazia() {
		//double total = getSaldo();
		if(saldo == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
