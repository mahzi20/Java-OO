package introducao.meupacote;

import introducao.CPF;

public class Aluno {
	//ATRIBUTOS
	public String nome;
	public int idade;
	public char sexo;
	public String rg;
	CPF cpf;
	
	public void setNome(String nome) {
		if(nome.length() >= 3) {
			this.nome = nome;
		} else {
			System.out.println("Nome muito curto");
		}
	}
	
	public String toString() {
		return getClass().getSimpleName();
	}
}
