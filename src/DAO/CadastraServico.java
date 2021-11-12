package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastraServico {

	
	public void CadastraService(Service service, String orcamento) {
			
		String idOrcamento = Orcamento.buscarIdOrcamento(orcamento);
		
		
		Connection con = ConexaoMysql.mysql().ligarMysql();
		
		
		try {
		
		String sql = "INSERT INTO servico "
						+ "(valorPeca, orcamento_idorcamento) VALUES (?,?)";	
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.execute();
		
		System.out.println("Servico cadastro com susseço");
					
		} catch (SQLException erro) {
			System.out.print("Erro ao cadastro um serviço : "  +  erro);
			// TODO: handle exception
		
		}
	}
	
	public ResultSet buscarService(String idOrcamento) {
		
		Connection con = ConexaoMysql.mysql().ligarMysql();
					
		try {
			 
		
			
			
		} catch (SQLException e) {
			System.out.print("Erro ao buscar um ResultSet de Service" + e);
			// TODO: handle exception
		}
		
		
		 
	}
	
	
	
	
	
}
