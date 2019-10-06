package interfaces;

public class Televisao implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Televisao Ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televisao Desligada");
	}

}
