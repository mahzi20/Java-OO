package metodos;

public class Aluno {
	private String nome;
	public static int contadorDeAlunos;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimeAluno() {
		System.out.println("\nAluno: " +getNome());;
	}
	
	
	
}
