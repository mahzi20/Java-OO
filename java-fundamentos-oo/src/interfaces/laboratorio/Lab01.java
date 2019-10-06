package interfaces.laboratorio;

public class Lab01 {
	public static void main(String[] args) {
		Imprimivel relatorio = new Relatorio();
		Imprimivel grafico = new Grafico();
		
		relatorio.imprimir();
		grafico.imprimir();
	}
}
