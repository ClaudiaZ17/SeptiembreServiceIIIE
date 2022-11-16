package EC3_ClaudiaZeta.service;

import java.util.List;

import EC3_ClaudiaZeta.model.Cliente;


public interface ClienteService {
	
	
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);


}
