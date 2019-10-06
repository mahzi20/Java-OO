package construtores;

public class Carro extends Veiculo{

	String modelo;
	String placa;
	
	public Carro() {
		super();
	}
	
	public Carro(String modelo) {
		this.modelo = modelo;
		this.placa = "N/I";
	}
	
	public Carro(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public Carro(String marca, String modelo, String chassis, String placa) {
		super(chassis,marca);
		this.modelo = modelo;
		this.placa = placa;
	}
}
