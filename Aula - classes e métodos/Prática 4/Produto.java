package Atividade;

public class Produto {
	private String nome;
	private double estoque;
	private double preço;

	public Produto(String nome, double estoque, double preço) {
		this.nome = nome;
		this.estoque = estoque;
		this.preço = preço;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getEstoque() {
		return estoque;
	}

	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", estoque=" + estoque + ", preço=" + preço + "]";
	}
	
}

