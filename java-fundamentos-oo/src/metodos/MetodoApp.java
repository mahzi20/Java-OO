package metodos;

public class MetodoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExemploMetodos01 obj = new ExemploMetodos01();
		
		obj.exibirMensagem();
		
		obj.exibirValorEnviado("Java Programmer"); //Java programmer = argumento
		
		obj.exibirInformacoes("Marilia Lopes", 26);
		System.out.println();
		
		int numero = obj.sortearNumerosAleatorios(1, 60);
		System.out.println(numero);
		
		double[] salarios = {2520.50, 8630.70, 7564.30, 5784.60};
		obj.exibirArray(salarios);
		
		obj.exibirAlunos("João", "Marcos", "Lucas", "Fernanda", "Diego");
	}

}
