package interfaces;

public interface Eletrodomestico {
	public static final int VOLTAGEM = 110;
	
	void ligar();
	void desligar();
	
	static void ligarTudo(Eletrodomestico ... eletrodomesticos) {
		for (Eletrodomestico eletro: eletrodomesticos) {
			eletro.ligar();
		}
	}
	
	default void acionarTimer(int minutos) {
		try {
			Thread.sleep(minutos * 60000);
			exibirStatus();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		desligar();
	}
	private void exibirStatus() {
		System.out.println("Aguardando o termino do timer");
	}
}
