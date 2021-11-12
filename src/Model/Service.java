package Model;

import Model.Cliente.Builder;

public class Service {
	
	String valorPeca;

	
	private Service(builder srv) {
		this.valorPeca = srv.valorPeca;
	}
	
	static class builder{
		
		String valorPeca;
		
		public builder(String valoPeca) {
			this.valorPeca = valoPeca;
		}
		public Service svc() {
			return new Service(this);
		}
			
	}
	
	public String getValorPeca() {
		return this.valorPeca;
	}

	 

}
