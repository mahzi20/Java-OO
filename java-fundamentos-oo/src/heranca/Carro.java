package heranca;

public class Carro extends Veiculo{
	String tipoVolante;
	
	public Carro() {
		super();
	}
	
	public Carro(String modelo, double potenciaMotor, boolean bluetooth, boolean aux, String tipoVolante) {
		super(modelo, potenciaMotor, new Radio(bluetooth, aux));
		this.tipoVolante = tipoVolante;
	}
	
	public String toString() {
		return modelo;
	}
}
