package EC3_ClaudiaZeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import EC3_ClaudiaZeta.model.Cliente;
import EC3_ClaudiaZeta.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repositorio;
	
	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		repositorio.save(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Cliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

	
}
