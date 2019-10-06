package heranca;

public class Veiculo {
	String modelo;
	double potenciaMotor;
	Radio tipoRadio;
	
	public Veiculo() {
		super();	
	}
	
	public Veiculo(String modelo, double potenciaMotor) {
		super();
		this.modelo = modelo;
		this.potenciaMotor = potenciaMotor;
	}
	
	public Veiculo(String modelo, double potenciaMotor, Radio tipoRadio) {
		this.modelo = modelo;
		this.potenciaMotor = potenciaMotor;
		this.tipoRadio = tipoRadio;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	
}
