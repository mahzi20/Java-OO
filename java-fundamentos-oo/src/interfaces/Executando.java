package interfaces;

public class Executando {

	public static void main(String[] args) {
		Eletrodomestico eletro;
		
		eletro = new Geladeira();
		eletro.ligar();
		
		eletro = new Televisao();
		eletro.ligar();
		
		eletro = new Microondas();
		eletro.ligar();
				
		System.out.println("\nUsando o método estático da interface");
		Eletrodomestico a, b, c, d, e;
		
		a= new Geladeira();
		b= new Microondas();
		c= new Geladeira();
		d= new Televisao();
		e= new Microondas();
		
		Eletrodomestico.ligarTudo(a, b, c, d, e);
		
		System.out.println("\nUsando Thread.sleep");
		a.ligar();
		a.acionarTimer(1);
	}

}
