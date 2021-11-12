package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.MetodosInterface;
import Model.Cliente;

public class ControllerCadastro  implements Controller<Cliente> {


	@Override
	public void Cadastra(Cliente obj, String nll) {
		// TODO Auto-generated method stub
		MetodosInterface.cadastra(obj);
		
	}

	@Override
	public List Buscar(String obj) {
		// TODO Auto-generated method stub
		ResultSet rs = MetodosInterface.buscar(obj);

		List<Cliente> cliente = new ArrayList<>();

		try {
			while (rs.next()) {
				
				cliente.add(new Cliente.Builder(rs.getString("nomeCliente"), rs.getString("telefoneCliente")).cliente());
				System.out.println("cliente buscado com susseço");
			}
		} catch (SQLException e) {
			System.out.println("Erro ao tenta buscar um cliente (classe ControllerCadastro BuscarCLientes)" + e);
			// TODO: handle exception
		}
		return cliente;
		 
	}

	@Override
	public void Apagar(String chassi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Atualiza(Cliente obj) {
		// TODO Auto-generated method stub
		
	}
 

 }

