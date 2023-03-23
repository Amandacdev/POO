package Banco;

public class TesteConta {
		
	public static void main (String[] args) {
		
		//Testing methods: creditar e debitar
		Conta conta1 = new Conta(101,"123456");
		conta1.creditar(300.0);
		conta1.debitar(100.0);
		conta1.creditar(200.0);
		System.out.println("Saldo conta 1: " + conta1.getSaldo()); //400
		System.out.println("---------------------------------");
		
		//Testing method toString
		System.out.println(conta1);
		
		//Testing method tranferir
		
		Conta conta2 = new Conta(201,"7897");
		System.out.println("Saldo conta 1: " + conta1.getSaldo());
		System.out.println("Saldo conta 2: " + conta2.getSaldo());
		
		conta1.transferir(200, conta2);
		System.out.println("Saldo conta 1: " + conta1.getSaldo());
		System.out.println("Saldo conta 2: " + conta2.getSaldo());
		System.out.println("---------------------------------");
		
		//More than one argument 
		conta1.creditar(200.0, 50.0); //2
		System.out.println("Saldo conta 1: " + conta1.getSaldo());
		conta1.creditar(100.0, 300.0, 100.0);//3
		System.out.println("Saldo conta 1: " + conta1.getSaldo());
		
		//Testing the method vazia(), checks if the account is empty
		System.out.println(conta1.vazia()); //true
		
	}
}




