package cap5lab1;

public class Cap5_Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario func = new Funcionario();
		
		func.nome = "Marcos";
		func.sobrenome = "Alberto";
		func.cargo = "Gerente de Projetos";
		func.salario = 8750.80;
		
		System.out.println("Nome: " + func.nome);
		System.out.println("Sobrenome: " + func.sobrenome);
		System.out.println("Cargo: " + func.cargo);
		System.out.println("Salario: " + func.salario);
	}

}
