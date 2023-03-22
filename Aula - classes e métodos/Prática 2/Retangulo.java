public class Retangulo {
	private int id;
	private double largura;
	private double comprimento;

	//Constructor
	
	public Retangulo(int id, double largura, double comprimento) {
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	//A second constructor - only one parameter
	public Retangulo(double valor) {
		
		this.id = (int)valor;
		this.largura = valor;
		this.comprimento = valor;
		
	}
	
	public Retangulo() {}
	
	//Method to calculate area
	//Note: variable 'this' can be implied
	public double calcularArea() {
		return largura*comprimento;
	}
	
	//Method to frame
	public void enquadrar() {
		double media = (largura+comprimento) / 2;
		largura = media;
		comprimento = media;
	}
	
	//Method boolean
	public boolean ehQuadrado() {
		if (largura==comprimento)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Retangulo [id=" + id + ", largura=" + largura + ", comprimento=" + comprimento + "]";
	}
	
	//Method that compare areas
	public boolean ehEquivalente(Retangulo outro) {
		if (this.calcularArea() == outro.calcularArea())
			return true;
		else
			return false;
	}
	
	//Method overloading
	public void redimensionar(double number) {
		largura = largura*number;
		comprimento = comprimento*number;
	}
	public void redimensionar(Retangulo objeto) {
		largura = objeto.largura;
		comprimento = objeto.comprimento;
	}
	
	public double calcularPerimetro() {		
		double perimetro = (largura*2) + (comprimento*2);
		return perimetro;
		
	}
	
	// Get/set methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	
	
	

}
