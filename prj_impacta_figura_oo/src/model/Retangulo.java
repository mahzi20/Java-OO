package model;

import domain.BiDimensional;

public class Retangulo extends Figura implements BiDimensional {
	
	public Retangulo() {
		super(5, 9 , "T");
	}
	
	public void setAltura(int altura) {
		super.setAltura(altura);
	}
	
	public void setLargura(int largura) {
		super.setLargura(largura);
	}
	
	public String desenhar() {
		StringBuilder desenho = new StringBuilder();
		desenho.append(getClass().getSimpleName() + " (" + getAltura() + " x " + getLargura() + ")\n");
		for (int linha = 1; linha <= getAltura() ; linha++) {
			for (int coluna = 1; coluna <= getLargura(); coluna++) {
				if (linha == 1 || linha == getAltura() || coluna == 1 || coluna == getLargura())
					desenho.append(getSimbolo());
				else
					desenho.append(getFundo());
			}
			desenho.append("\n");
		}				
		return desenho.toString();
	}
}
