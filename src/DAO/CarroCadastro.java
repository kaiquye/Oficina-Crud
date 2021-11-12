package DAO;

import java.security.DrbgParameters.Reseed;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Carro;

public class CarroCadastro {

	private static Carro cars[];

	public static void cadastraCarro(Carro carro, String telefone) {
		String idCleinte = MetodosInterface.buscarID(telefone);

		Connection con = ConexaoMysql.mysql().ligarMysql();
		try {

			String sql = "INSERT INTO carro (placaCarro, chassiCarro, modeloCarro, FK_a) VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, carro.getPlaca());
			ps.setString(2, carro.getChassi());
			ps.setString(3, carro.getModelo());
			ps.setString(4, idCleinte);
			ps.execute();
			System.out.println("Cadastrado com susseço");

		} catch (SQLException e) {
			System.out.println("Erro ao tenta cadastra novo carro, : " + e);

			// TODO: handle exception
		}

	}

	public static ResultSet buscarCarro(String chassi) {

		Connection con = ConexaoMysql.mysql().ligarMysql();
		Carro carro = null; 
		
		String chassiCaroo = null;
		String placaCarro = null;
		String modeloCarro = null;
		String vetor [];
		String nome = null;
		String telefone = null;
		ResultSet rs  = null;
			
		try {
			
			String sql = "SELECT * FROM cliente INNER JOIN carro ON idCliente = FK_A WHERE nomeCliente='"+chassi+"'";
			
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("\n buscando carro...");
		 
		} catch (SQLException e) {
			System.out.println("Erro ao dentar buscar um carro do banco de dados (BuscarCarro): "+e);
			// TODO: handle exception
		}

		return rs;
	}

}
