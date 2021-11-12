package Model;

public class Cliente {

	private final String nome;
	private final String telefone;
	private String sobreNome;
	private String CPF;
 
		public static class Builder{
			
			//metodos obrigatorios
			private final String nome;
			private final String telefone;
			
			
			//valores nao obrigatorios
			private String sobreNome;
			private String CPF;
			
			public Builder(String nome, String telefone) {
				this.nome = nome;
				this.telefone = telefone;
			}
			public Builder sobreNome(String sobreNome) {
				this.sobreNome = sobreNome;
				return this;
			}
			public Builder CPF(String cpf) {
				this.CPF = cpf;
				return this;
			}
			public Cliente cliente () {
				return new Cliente(this);
			}
		}
		
		private Cliente(Builder builder) {
			this.nome = builder.nome;
			this.telefone = builder.telefone;
			this.CPF = builder.CPF;
			this.sobreNome = builder.sobreNome;
		}
 
		
		public String getNome() {
			return this.nome;
		}
		public String getTelefone() {
			return this.telefone;
		}
		public String getSobreNome() {
			return this.sobreNome;
		}
		public String getCpf() {
			return this.CPF;
		}
		
}
