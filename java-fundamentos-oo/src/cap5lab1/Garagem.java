package cap5lab1;

public class Garagem {

	Carro carroPasseio;
	Carro carroUtilitario;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garagem g = new Garagem();
		g.carroPasseio = new Carro();
		g.carroUtilitario = new Carro();
		
		g.carroPasseio.cor = "vermelho";
		g.carroPasseio.modelo = "VW Jetta";
		g.carroPasseio.potenciaMotor = 2.3;
		
		g.carroUtilitario.cor = "branco";
		g.carroUtilitario.modelo = "Renault boxer";
		g.carroUtilitario.potenciaMotor = 3.8;
		
		System.out.println("Carro de Passeio:");
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Potência: " + g.carroPasseio.potenciaMotor);
		System.out.println("--------------------------------------");
		System.out.println("Carro Utilitário:");
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Potência: " + g.carroUtilitario.potenciaMotor);
	}

}
