package Model;

public class Servico {

	String Valor;
	String Descricao;

	public static class Builder {

		private final String Valor;
		private final String Descricao;

		public Builder(String valor, String descricao) {
			this.Valor = valor;
			this.Descricao = descricao;

		}

		public Servico servico() {
			return new Servico(this);
		}

 	}

	private Servico(Builder builder) {
		this.Valor = builder.Valor;
		this.Descricao = builder.Descricao;
	}

	public String getValor() {
		return Valor;
	}

	public String getDescricao() {
		return Descricao;
	}

}
