package DAO;

import java.sql.ResultSet;

import Model.Cliente;

public interface MetodosInterface {
	
	static void cadastra(Cliente cliente) {
		ModificadorDb.CadastarCliente(cliente);
	}
	static ResultSet buscar(String nome) {
		return ModificadorDb.BuscarCliente(nome);
	}
	static void deletar(String nome) {
		ModificadorDb.DeletarCliente(nome);
	}
	static String buscarID(String telefone){
		return ModificadorDb.buscarID(telefone);
	}
}
