package interfaces;

public class Geladeira implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Geladeira Ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Geladeira Desligada");		
	}

}
