package DAO;

import java.sql.ResultSet;

import Model.Carro;

public interface MysqlCarro {

	static void Cadastra(Carro obj, String telefone) {
		CarroCadastro.cadastraCarro(obj, telefone);
	}

	static ResultSet buscar(String chassi) {
		return CarroCadastro.buscarCarro(chassi);
	}

	static void Deletar(String chassi) {

	}

	static void Atualizar(Carro obj) {

	}
	static void cadastraServico(Servico servico) {
		return CadastroServico.cadastra(servico);
	}

}
