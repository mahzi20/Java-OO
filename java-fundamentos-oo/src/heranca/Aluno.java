package heranca;

import heranca.laboratorio.Pessoa;
import heranca.laboratorio.RG;

public class Aluno extends Pessoa{
	private float mensalidade;
	private String curso;
	
	public Aluno(String nome, int idade, char sexo, int numeroRG, String dataNasc, float mensalidade, String curso) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.mensalidade = mensalidade;
		this.curso = curso;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void falar(String fala) {
		System.out.println(getNome() + ": "  + fala);
	}

	@Override
	public void mostrarDados() {
		System.out.printf("--- %s: %s ---\n"
						+ "Idade: %d\n"
						+ "Sexo: %s\n"
						+ "Mensalidade: %.2f\n"
						+ "Curso: %s\n"
						+ "Número RG: %d\n"
						+ "Data de Nascimento: %s\n",
						getClass().getSimpleName(),
						getNome(),
						getIdade(),
						getSexo(),
						getMensalidade(),
						getCurso(),
						getRg().getNumero(),
						getRg().getDataNasc());
	}
	
	
}
