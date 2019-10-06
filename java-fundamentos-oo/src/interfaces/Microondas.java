package interfaces;

public class Microondas implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Microondas Ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Microondas Desligado");
	}

}
