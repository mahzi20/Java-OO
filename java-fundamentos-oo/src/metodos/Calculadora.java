package metodos;

public class Calculadora {
	
	public int somar (int valor1, int valor2) {
		int resultado;
		
		resultado = valor1 + valor2;
		return resultado;
	}
	
	public double subtrair (double valor1, double valor2) {
		double resultado;
		
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double subtrair (int valor1, double valor2) {
		double resultado;
		
		resultado = (double) (valor1) - valor2;
		return resultado;
	}
	
	public double subtrair (double valor1, int valor2) {
		double resultado;
		
		resultado = valor1 - (double) (valor2);
		return resultado;
	}
	
	public int multiplicar (int valor1, int valor2) {
		int resultado;
		
		resultado = valor1 * valor2;
		return resultado;
	}
	
	public int dividir (int valor1, int valor2) {
		int resultado;
		
		resultado = valor1 / valor2;
		return resultado;
	}
	
	
	
}
