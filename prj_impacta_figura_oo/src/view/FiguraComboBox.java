package view;

import javax.swing.JComboBox;

import model.Figura;
import model.Quadrado;
import model.Retangulo;
import model.Triangulo;

public class FiguraComboBox extends JComboBox<Figura>{
	private static final long serialVersionUID = 1L;
	
	public FiguraComboBox() {
		super(new Figura[] {new Quadrado(),
				new Retangulo(),
				new Triangulo()});
	}
}
