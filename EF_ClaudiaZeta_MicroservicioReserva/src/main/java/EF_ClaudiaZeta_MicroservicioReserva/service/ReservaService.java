package EF_ClaudiaZeta_MicroservicioReserva.service;

import java.util.List;

import EF_ClaudiaZeta_MicroservicioReserva.dto.ReservaDTO;

public interface ReservaService {

	List<ReservaDTO> listar();
	ReservaDTO obtenerxId(Integer id);
	void guardar(ReservaDTO hospedaje);
	void eliminar(Integer id);
	void actualizar(ReservaDTO hospedaje);
}
