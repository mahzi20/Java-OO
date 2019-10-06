package metodos;

public abstract class Pessoa {
	private String nome;
	private int idade;
	char sexo;
	static int rg;
	

	//Getters and setters
	public String getNome() {
		return null;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if (idade >= 0) {
		this.idade = idade;
		} else {
			System.out.println("Valor inválido para idade");
		}
		
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//DEVE SER IMPLEMENTADO POR TODOS OS FILHOS CONCRETOS DA CLASSE PESSOA
	public abstract void falar (String fala);
	
	//NÃO PODE SER SOBRESCRITO
	public final void exibirInformacoes() {
		System.out.println("Exibindo informações da pessoa!");
	}

}
