package introducao;

import introducao.meupacote.Aluno;

public class AlunoAtribuicao {
	public static void main(String[] args) {
		Aluno aline = new Aluno();
		Aluno marcel = new Aluno();
		
		aline.nome = "Aline";
		aline.sexo = 'F';
		aline.idade = 17;
		
		marcel.nome = "Marcel";
		marcel.sexo = 'M';
		marcel.idade = 35;
		
		marcel = aline;
		
		System.out.println(marcel.nome);
		System.out.println(marcel.sexo);
		System.out.println(marcel.idade);
		
		marcel.nome = "Marcel";
		marcel.sexo = 'M';
		marcel.idade = 35;
		
		System.out.println(aline.nome);
		System.out.println(aline.sexo);
		System.out.println(aline.idade);
	}
}
