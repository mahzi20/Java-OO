package construtores;

public class CarroApp {

	public static void main(String[] args) {
		
		Carro renegade = new Carro(); //INSTANCIA��O (UTILIZANDO CONSTRUTOR PADR�O)
		System.out.println("Informa��es do objeto renegade");
		System.out.println(renegade.modelo);
		System.out.println(renegade.placa);
		
		Carro jetta = new Carro("Jetta");//INSTANCIA��O (UTILIZANDO CONSTRUTOR CUSTOMIZADO)
		System.out.println("\nInforma��es do objeto jetta");
		System.out.println(jetta.modelo);
		System.out.println(jetta.placa);
		
		Carro ceratto = new Carro("Ceratto", "UTG1234");//INSTANCIA��O (UTILIZANDO CONSTRUTOR CUSTOMIZADO)
		System.out.println("\nInforma��es do objeto Ceratto");
		System.out.println(ceratto.modelo);
		System.out.println(ceratto.placa);
		
		Carro gla200 = new Carro("VW", "Gol", "BAS165465132", "FDS4567");
		System.out.println(gla200);
	}

}
