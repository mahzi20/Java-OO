package model;

import domain.UniDimensional;

public class Quadrado extends Figura implements UniDimensional {

	public Quadrado() {
		super(5, "Q");
	}
	
	@Override
	public void setLado(int lado) {
		super.setAltura(lado);
		super.setLargura(lado);
	}
	
	public String desenhar() {
		StringBuilder desenho = new StringBuilder();
		desenho.append(getClass().getSimpleName() + "(" + getAltura() + " x " + getLargura() + ")\n");
		for (int linha = 1; linha <= getAltura(); linha++) {
			for (int coluna = 1; coluna <= getLargura(); coluna++) {
				desenho.append(getSimbolo());
			}
			desenho.append("\n");
		}
		return desenho.toString();
	}
}
