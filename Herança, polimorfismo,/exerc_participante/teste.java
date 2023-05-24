package exerc_participante;

public class teste {
	
	public static void main(String[] args) {
		Participante joao = 	new Participante("joao@gmail.com", "João", 17);
		Participante maria = 	new Participante("maria@gmail.com", "Maria", 30);
		Participante pedro = 	new Participante("pedro@gmail.com", "Pedro", 70);
		
		Convidado paulo = 		new Convidado("paulo@gmail.com", "Paulo",  17, "empresa1");
		Convidado katia = 		new Convidado("katia@gmail.com", "Katia",  30, "empresa2");
		Convidado antonio =		new Convidado("antonio@gmail.com", "Antônio",  70, "empresa2");

		System.out.println("\n----participantes");
		System.out.println(joao);
		System.out.println(maria);
		System.out.println(pedro);

		System.out.println("\n----convidados");
		System.out.println(paulo);
		System.out.println(katia);
		System.out.println(antonio);

		System.out.println("\nvalores pagos pelos participantes para um evento de 1000 reais");
		System.out.println("joao =R$"+joao.getValorPago(1000.0));
		System.out.println("maria=R$"+maria.getValorPago(1000.0));
		System.out.println("pedro=R$"+pedro.getValorPago(1000.0));

		System.out.println("\nvalores pagos pelos convidados para um evento de 1000 reais");
		System.out.println("paulo=R$"+paulo.getValorPago(1000.0));
		System.out.println("katia=R$"+katia.getValorPago(1000.0));
		System.out.println("antonio=R$"+antonio.getValorPago(1000.0));;
	

	}
	
}
