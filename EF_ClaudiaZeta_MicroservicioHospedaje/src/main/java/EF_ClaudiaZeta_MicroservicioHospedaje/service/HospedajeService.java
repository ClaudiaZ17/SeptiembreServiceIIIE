package EF_ClaudiaZeta_MicroservicioHospedaje.service;

import java.util.List;

import EF_ClaudiaZeta_MicroservicioHospedaje.model.Hospedaje;


public interface HospedajeService {

	List<Hospedaje> listar();
	Hospedaje obtenerxId(Integer id);
	void guardar(Hospedaje hospedaje);
	void eliminar(Integer id);
	void actualizar(Hospedaje hospedaje);
	public void AsignaTuristaAHotel();
}
