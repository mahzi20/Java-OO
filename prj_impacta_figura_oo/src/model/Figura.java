package model;

public abstract class Figura {
	private int altura;
	private int largura;
	private String simbolo;
	private String fundo;
	
	//CONSTRUTOR DE QUADRADO
	public Figura(int lado, String simbolo) {
		this(lado, lado, simbolo);
	}
	
	//CONSTRUTOR DE RETANGULO/TRIANGULO
	public Figura(int altura, int largura, String simbolo) {
		this(altura, largura, simbolo, "  ");
	}
	
	//CONSTRUTOR PADRÃO DA SUPERCLASSE
	public Figura(int altura, int largura, String simbolo, String fundo) {
		super(); //CONSTRUTOR PADRÃO DA CLASSE
		this.altura = altura;
		this.largura = largura;
		this.simbolo = simbolo;
		this.fundo = fundo;
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public String getSimbolo() {
		return simbolo;
	}
	
	public void setSimbolo(String simbolo) {
		this.simbolo = (simbolo + " ");
	}
	
	public String getFundo() {
		return fundo;
	}
	
	public void setFundo(String fundo) {
		this.fundo = fundo;
	}
	
	public abstract String desenhar();
	
	public String toString() {
		return String.format("%s(%d x %d)", getClass().getSimpleName(), getAltura(), getLargura());
	}
}
