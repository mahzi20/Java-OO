package introducao.meupacote;

import introducao.CPF;

public class AlunoApp {
	public static void main(String[] args) {
		Aluno alfredo = new Aluno();
		alfredo.nome = "Alfredo Souza";
		alfredo.idade = 52;
		alfredo.sexo = 'M';
		alfredo.rg = "45.64.789-52";
		alfredo.cpf = new CPF();
		alfredo.cpf.numero = "123.456";
		alfredo.setNome("Al");

		System.out.println(alfredo);
		System.out.println(alfredo.nome);
		System.out.println(alfredo.idade);
		System.out.println(alfredo.sexo);
		System.out.println(alfredo.rg);
	}
}
