package heranca;

public class Guidao {
	String cor;
	String tipo;
	String modelo;
	
	public Guidao(String tipo, String modelo, String cor) {
		this.tipo = tipo;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public Guidao() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return String.format("%s, %s, %s", tipo, modelo, cor);
	}
}
