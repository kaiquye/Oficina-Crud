package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMysql {

	public static final ConexaoMysql CONEXAO = new ConexaoMysql();

	private ConexaoMysql() {

	}

	public static ConexaoMysql mysql() {
		return CONEXAO;

	}

	public Connection ligarMysql() {
		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/oficinadata?useTimezone=true&serverTimezone=UTC",
					"root", "1234");
			System.out.print("Conectado ao banco de dados");

		} catch (SQLException e) {
			System.out.print(". Erro ao conectar ao banco de dados " + e);
		}
		return con;
	}

}
