package model;

import domain.BiDimensional;

public class Triangulo extends Figura implements BiDimensional {

	public Triangulo() {
		super (5, 9, "T");
	}
	
	public void setAltura(int altura) {
		super.setAltura(altura);
	}
	
	public void setLargura(int largura) {
		super.setLargura(largura);
	}
	
	public String desenhar() {
		int meio = getLargura() / 2;
		StringBuilder desenho = new StringBuilder();

		desenho.append(getClass().getSimpleName() + " (" + getAltura() + " x " + getLargura() + ")\n");
		for (int linha = 0; linha < getAltura() ; linha++) {
			for (int coluna = 0; coluna < getLargura(); coluna++) {
				if (coluna <= (meio + linha) && coluna >= (meio - linha))
					desenho.append(getSimbolo());
				else
					desenho.append(getFundo());
			}
			desenho.append("\n");
		}				
		return desenho.toString();
	}
}
