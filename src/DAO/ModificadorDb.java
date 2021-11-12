package DAO;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import Model.Cliente;

public class ModificadorDb {

	public static void CadastarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

		Connection con = ConexaoMysql.mysql().ligarMysql();
		try {

			String sql = "INSERT INTO cliente (nomeCliente, telefoneCliente)" + "VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getTelefone());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Erro, não foi possivel adiciona um novo cliente  : " + e);
		}

	}

	public static ResultSet BuscarCliente(String nome) {
		// TODO Auto-generated method stub

		Connection con = ConexaoMysql.mysql().ligarMysql();
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM cliente " + "WHERE nomeCliente='" + nome + "'";
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			// NÃO SE ESQUEÇA DE CONTRUIR O WHILE NA OUTRA CLASSE PARA BUSCA OS RESULTADOS
			// DO BANCO DE DADOS
			// WHILE (RS.NEXT)
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Erro ao tenta buscar um usuario no banco de dados_ " + e);
		}
		return rs;
	}

	public static void DeletarCliente(String nome) {
		// TODO Auto-generated method stub

		Connection con = ConexaoMysql.mysql().ligarMysql();
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public static String buscarID(String telefone) {
		Connection con = ConexaoMysql.mysql().ligarMysql();
		ResultSet rs = null;
		String id = null;
		try {
			String sql = "SELECT idCliente FROM cliente " +
					"WHERE telefoneCliente='" + telefone + "'";
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				id = rs.getString("idCliente");
			}
			// NÃO SE ESQUEÇA DE CONTRUIR O WHILE NA OUTRA CLASSE PARA BUSCA OS RESULTADOS
			// DO BANCO DE DADOS
			// WHILE (RS.NEXT)
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Erro ao tenta buscar um usuario no banco de dados_ " + e);
		}
		return id;
	}
	

}
