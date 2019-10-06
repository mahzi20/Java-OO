package heranca.laboratorio;

import heranca.Aluno;

public class Cap9_Lab1 {
	public static void main(String[] args) {
		Pessoa rafael, manuel, claudia;
		rafael = new Professor("Rafael", 38, 'M', 261454789, "05/02/1974", 2500.0F, "Português");
		manuel = new Aluno("Manoel", 19, 'M', 521234567, "15/06/1993", 1099.0F, "Ciência da Computação");
		claudia = new Aluno("Cláudia", 22, 'F', 415678912, "12/08/1990", 799.0F, "Administração");
		
		rafael.falar("Manuel?");
		manuel.falar("Presente");
		rafael.falar("Cláudia?");
		claudia.falar("Presente");
		
		System.out.println("...");
		
		rafael.mostrarDados();
		System.out.println();
		manuel.mostrarDados();
		System.out.println();
		claudia.mostrarDados();
	}
}
