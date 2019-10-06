package heranca;

public class Moto extends Veiculo{
	Guidao tipoGuidao;
	
	public Moto() {
		super();
		this.tipoGuidao = new Guidao();
	}
	
	public Moto(String modelo, double potenciaMotor, Guidao tipoGuidao) {
		super(modelo, potenciaMotor);
		this.tipoGuidao = tipoGuidao;
	}

}
