package Controller;

import java.util.List;

public interface Controller<object> {
	
	void Cadastra(object obj, String telefone);
	List Buscar(String obj);
	void Apagar(String chassi);
	void Atualiza(object obj);

}
