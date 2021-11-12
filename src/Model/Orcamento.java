package Model;

public class Orcamento {

	private String idOrcamento;
	private String dataInicio;
	private String dataFim;
	private String valor;
	private String mecanico;

	static class builder {

		private String idOrcamento;
		private final String dataInicio;
		private final String dataFim;
		private String valor;
		private final String mecanico;

		public builder(String Inicio, String fim, String mecanico) {
			this.dataInicio = Inicio;
			this.dataFim = fim;
			this.mecanico = mecanico;
		}

		public builder valor(String valor) {
			this.valor = valor;
			return this;
		}

		public builder idOrcamento(String id) {
			this.idOrcamento = id;
			return this;
		}

		public Orcamento orc() {
			return new Orcamento(this);
		}

	}

	private Orcamento(builder bld) {
		this.idOrcamento = bld.idOrcamento;
		this.dataFim = bld.dataFim;
		this.dataInicio = bld.dataInicio;
		this.valor = bld.valor;
		this.mecanico = bld.mecanico;
	}

	public String getIdOrcamento() {
		return idOrcamento;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public String getValor() {
		return valor;
	}

	public String getMecanico() {
		return mecanico;
	}

}
