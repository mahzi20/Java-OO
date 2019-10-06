package metodos;

public class AlunoApp {

	public static void main(String[] args) {
		//DEFININDO UMA VARIÁVEL
		Aluno joao, maria, marcos;
		
		//INSTANCIANDO OS OBJETOS DO TIPO ALUNO
		joao = new Aluno();
		maria = new Aluno();
		marcos = new Aluno();
		
		joao.setNome("João");
		joao.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("Contagem no objeto joao: " + joao.contadorDeAlunos);
		
		maria.setNome("Maria");
		maria.contadorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("Contagem no objeto maria: " + maria.contadorDeAlunos);
		
		marcos.setNome("Marcos");
		marcos.contadorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println("Contagem no objeto marcos: " + marcos.contadorDeAlunos);
		
		System.out.println("\nContador acessado diretamente pela classe: " + Aluno.contadorDeAlunos);
		
	}

}
