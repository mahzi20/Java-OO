package metodos;

public class Cap6_Lab1 {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		int num1 = 6;
		int num2 = 3;
		
		System.out.println("calc.somar(" + num1 + ", " + num2 + ") = " + calc.somar(num1, num2));
		//System.out.println("calc.subtrair(" + num1 + ", " + num2 + ") = " + calc.subtrair(num1, num2));
		System.out.println("calc.multiplicar(" + num1 + ", " + num2 + ") = " + calc.multiplicar(num1, num2));
		System.out.println("calc.dividir(" + num1 + ", " + num2 + ") = " + calc.dividir(num1, num2));
		

	}

}
