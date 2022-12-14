package EF_ClaudiaZeta_MicroservicioTurista.service;

import java.util.List;

import EF_ClaudiaZeta_MicroservicioTurista.dto.TuristaDTO;



public interface TuristaService {

	List<TuristaDTO> listar();
	TuristaDTO obtenerxId(Integer id);
	void guardar(TuristaDTO hospedaje);
	void eliminar(Integer id);
	void actualizar(TuristaDTO hospedaje);
}

