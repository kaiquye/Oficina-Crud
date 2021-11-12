package Controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DAO.CarroCadastro;

import DAO.MysqlCarro;
import Model.Carro;

public class ControllerCarro implements Controller<Carro> {

	@Override
	public void Cadastra(Carro obj, String telefone) {
		// TODO Auto-generated method stub
		MysqlCarro.Cadastra(obj, telefone);

	}

	@Override
	public List Buscar(String obj) {
		// TODO Auto-generated method stub

		List<Carro> carroLista = new ArrayList<>();

		try {
			ResultSet rs = MysqlCarro.buscar(obj);

			while (rs.next()) {
				Carro carro = new Carro.BuilderCar(rs.getString("placaCarro")).chassi(rs.getString("chassiCarro"))
						.modelo(rs.getString("modeloCarro"))
						.responsavel(rs.getString("nomeCliente"), rs.getString("telefoneCliente")).carro();
				carroLista.add(carro);
			}

		} catch (Exception e) {
			System.out.println("Erro ao tenta buscar um carro (buscarCarro-CONTROLLER)");
			// TODO: handle exception
		}

		return carroLista;

	}

	@Override
	public void Apagar(String chassi) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Atualiza(Carro obj) {
		// TODO Auto-generated method stub

	}

}
