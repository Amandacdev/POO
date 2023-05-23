package exerc_conta;

public class Teste {
	public static void main(String[] args) {
		Conta c1 = new Conta("123","578");
		Conta c2 = new Conta("456","963");
		
		ContaEspecial c3 = new ContaEspecial("789","245",500);
		
		try {
			System.out.println("Conta 1: " + c1.toString());
			
			c1.creditar(200);
			System.out.println("---------Credito de 200 ------------");
			System.out.println("Conta 1: " + c1.toString());
			System.out.println("Conta 2: " + c2);
			
			c1.transferir(20, c2);
			System.out.println("---------Transferência de 20 ------------");
			System.out.println("Conta 1: " + c1.toString());
			System.out.println("Conta 2: " + c2);
			
			System.out.println("---------Testes com contaEspecial ------------");
			c3.creditar(500);
			System.out.println("Conta 3: " + c3.toString());
			
			c3.debitar(900);
			System.out.println("Conta 3: " + c3.toString());
			
			c3.debitar(900);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
