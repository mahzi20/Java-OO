package metodos;

public class Cap6_Lab2 {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println("Chamando a versão de subtrair com 2 double: " + calc.subtrair(4.2, 1.1));
		System.out.println("Chamando a versão de subtrair com 1 double e 1 int: " + calc.subtrair(6.2, 2));
		System.out.println("Chamando a versão de subtrair com 1 int e 1 double: " + calc.subtrair(4, 1.2));
	}

}
