package introducao;

public class AlunoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno alfredo = new Aluno();
		alfredo.nome = "Alfredo Souza";
		alfredo.idade = 30;
		alfredo.sexo = 'M';
		alfredo.rg = "45.64.789-52";
		
		System.out.println(alfredo);
		System.out.println(alfredo.nome);
		System.out.println(alfredo.idade);
		System.out.println(alfredo.sexo);
		System.out.println(alfredo.rg);
	}

}
