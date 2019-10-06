package construtores;

public class CarroApp {

	public static void main(String[] args) {
		
		Carro renegade = new Carro(); //INSTANCIAÇÃO (UTILIZANDO CONSTRUTOR PADRÃO)
		System.out.println("Informações do objeto renegade");
		System.out.println(renegade.modelo);
		System.out.println(renegade.placa);
		
		Carro jetta = new Carro("Jetta");//INSTANCIAÇÃO (UTILIZANDO CONSTRUTOR CUSTOMIZADO)
		System.out.println("\nInformações do objeto jetta");
		System.out.println(jetta.modelo);
		System.out.println(jetta.placa);
		
		Carro ceratto = new Carro("Ceratto", "UTG1234");//INSTANCIAÇÃO (UTILIZANDO CONSTRUTOR CUSTOMIZADO)
		System.out.println("\nInformações do objeto Ceratto");
		System.out.println(ceratto.modelo);
		System.out.println(ceratto.placa);
		
		Carro gla200 = new Carro("VW", "Gol", "BAS165465132", "FDS4567");
		System.out.println(gla200);
	}

}
