package metodos;

public class ExemploMetodos01 {

	public void exibirMensagem() {
		System.out.println("Hello Metodo!");
	}
	
	public void exibirValorEnviado(String texto) {//texto = parametro
		System.out.println("Valor enviado: " + texto);
	}
	
	public void exibirInformacoes(String nome, int idade) {
		System.out.printf("Seu nome é: %s \nSua idade é: %d", nome, idade);
	}
	
	public int sortearNumerosAleatorios(int numMin, int numMax) {
		return (int) (numMin + Math.random() * 60);
	}
	
	public void exibirArray(double[] valores) {
		for (int i = 0; i < valores.length; i++) {
			valores[i] *= 1.1;
			System.out.printf("%.2f\n", valores[i]);
		}
	}
	
	public void exibirAlunos(String ... alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
	}
}
