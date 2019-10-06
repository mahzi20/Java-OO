package heranca.laboratorio;

public class Professor extends Pessoa {

	private float salario;
	private String disciplina;
	
	public Professor(String nome, int idade, char sexo, int numeroRG, 
					String dataNasc, float salario, String disciplina) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void falar(String fala) {
		System.out.println(getNome() + ": " + fala);		
	}

	@Override
	public void mostrarDados() {
		System.out.printf("--- %s: %s ---\n"
						+ "Idade: %d\n"
						+ "Sexo: %s\n"
						+ "Salário: %.2f\n"
						+ "Número RG: %d\n"
						+ "Data de Nascimento: %s\n",
						getClass().getSimpleName(),
						getNome(),
						getIdade(),
						getSexo(),
						getSalario(),
						getRg().getNumero(),
						getRg().getDataNasc());
	}
	

}
