package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public   class Orcamento {

	public static String buscarIdOrcamento(String idVeiculo) {
		
		String idOrcamento = null;
		Connection con = ConexaoMysql.mysql().ligarMysql();
		try {
			String sql ="SELECT idorcamento FROM orcamento WHERE  "
					+ "veiculo_idveiculo ='"+ idVeiculo +"'";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				idOrcamento = rs.getString("idorcamento");
			}
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao buscar um IdOrcamento   " + e);
			// TODO: handle exception
		}
		
		return idOrcamento;
	}

	
	
	
	
	

}
