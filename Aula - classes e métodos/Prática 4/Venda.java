package Atividade;

public class Venda {
	private String data;
	private String nome;
	private int quantidade;
	private double valor;

	//Constructor
	public Venda(String data, Produto prod, int quantidade) {
		this.data = data;
		this.nome = prod.getNome();
		this.quantidade = quantidade;
		
		//Getting purchase value
		valor = quantidade * prod.getPreço();
		
		//Updating the stock
		prod.setEstoque(prod.getEstoque() - quantidade);
		
	}


	@Override
	public String toString() {
		return "Venda [data=" + data + ", nome=" + nome + ", quantidade=" + quantidade + "]";
	}

	
}

