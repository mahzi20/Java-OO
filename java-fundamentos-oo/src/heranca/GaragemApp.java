package heranca;

public class GaragemApp {

	public static void main(String[] args) {
		Carro c = new Carro();
		
		System.out.println("Carro c");
		System.out.println(c.modelo);
		System.out.println(c.potenciaMotor);
		System.out.println(c.tipoVolante);
		
		System.out.println("------------------------------");
		
		System.out.println("Carro c2");
		Carro c2 = new Carro("Compass", 2.0, true, false, "Esportivo");
		System.out.println(c2.modelo);
		System.out.println(c2.potenciaMotor);
		System.out.println(c2.tipoVolante);
		
		System.out.println("------------------------------");
		
		System.out.println("Moto m");
		Moto m = new Moto();
		m.modelo = "CB1000r";
		m.potenciaMotor = 1000;
		m.tipoGuidao.tipo = "Agressivo";
		m.tipoGuidao.modelo = "Progressive 154";
		m.tipoGuidao.cor = "Dourado";
		System.out.println(m.modelo);
		System.out.println(m.potenciaMotor);
		System.out.println(m.tipoGuidao);
		
		System.out.println("------------------------------");
		
		System.out.println("Moto m2");
		Guidao tipoGuidao = new Guidao("Esportivo", "CF895", "Vermelho");
		Moto m2 =  new Moto("Hornet", 600, tipoGuidao);
		System.out.println(m2.modelo);
		System.out.println(m2.potenciaMotor);
		System.out.println(m2.tipoGuidao);
		
		System.out.println("------------------------------");
		Moto m3 = new Moto("M107", 700, new Guidao("Esportivo", "YH145", "Prata"));
		System.out.println(m3.modelo);
		System.out.println(m3.potenciaMotor);
		System.out.println(m3.tipoGuidao);
	}

}
