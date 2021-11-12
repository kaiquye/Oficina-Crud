package Model;

public class Carro {

	String modelo;
	String nome;
	String placa;
	String chassi; 
	String proprietario;
	Cliente cliente;
	
	//CLASSE  BUILDER. CLASSE STATIC QUE RECEBE OS VALORES E DEPOIS PASSA PARA AS VARIAVES DA CLASSE PRINCIPAL CARRO
	
	public static class BuilderCar{
		private final String placa;
		private  String nome;
		private String chassi;
		private String proprietario;
		private String modelo;
		private Cliente cliente;
		
		public BuilderCar(String placa) {
			this.placa = placa;

		}
		
		public BuilderCar chassi (String chassi) {
			this.chassi = chassi;
			return this;				
		}
		public BuilderCar proprietario (String pro) {
			this.proprietario = pro;
			return this;
		}
		public BuilderCar modelo (String modelo) {
			this.modelo = modelo;
			return this;
		}
		public BuilderCar responsavel(String responsavel, String telefone) {
		 this.cliente =	new Cliente.Builder(responsavel, telefone).cliente();			 
			return this;
		}
		
	//PASSANDO OS VALORES DA CLASSE BUILDERCAR PARA AS VARIAVEIS PRINCIPAIS DA CLASSE CARRO
		public Carro carro() {
			return new Carro(this);
		}
	
		}
		
	private Carro(BuilderCar car) {
		this.chassi =  car.chassi;
		this.nome = car.nome;
		this.modelo = car.modelo;
		this.proprietario = car.proprietario;
		this.placa = car.placa;		
		this.cliente = car.cliente;
	}
	
	//METODOS GET
	
	public String getPlaca() {
		return this.placa;
	}
	public String getNome() {
		return this.nome;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getProprietario() {
		return this.proprietario;
	}
	public String getChassi() {
		return this.chassi;
	}
	public Cliente cliente() {
		return this.cliente;
	}
}
	
	

