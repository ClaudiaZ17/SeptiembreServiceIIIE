package EF_ClaudiaZeta_MicroservicioHospedaje.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import EF_ClaudiaZeta_MicroservicioHospedaje.cliente.OpenFeignClient;
import EF_ClaudiaZeta_MicroservicioHospedaje.dto.TuristaDTO;
import EF_ClaudiaZeta_MicroservicioHospedaje.model.Hospedaje;
import EF_ClaudiaZeta_MicroservicioHospedaje.model.HospedajeDetalle;
import EF_ClaudiaZeta_MicroservicioHospedaje.model.HospedajeTurista;
import EF_ClaudiaZeta_MicroservicioHospedaje.repository.DetalleHospRepository;
import EF_ClaudiaZeta_MicroservicioHospedaje.repository.HospedajeRepository;

@Service
public class HospedajeServiceImp implements HospedajeService {

	@Autowired
	private DetalleHospRepository Detallerepository;
	
	@Autowired
	private HospedajeRepository repository;
	
	@Autowired
	private OpenFeignClient client;

	@Override
	public List<Hospedaje> listar() {
		List<Hospedaje> lista = repository.findAll();
		return lista;
	}

	@Override
	public Hospedaje obtenerxId(Integer id) {

		Hospedaje hospedaje = repository.findById(id).orElse(null);
		return hospedaje;
	}

	@Override
	public void guardar(Hospedaje hospedaje) {
		repository.save(hospedaje);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Hospedaje hospedaje) {
		repository.saveAndFlush(hospedaje);
	}
	
	@Override
	public void AsignaTuristaAHotel() {
		
		List<TuristaDTO> listado = client.listarTuristas();
		HospedajeTurista fk= null;
		HospedajeDetalle detalle=null;
		
		for (TuristaDTO turista: listado) {
			fk= new HospedajeTurista();
			fk.setIdTurista(turista.getCodTurista());
			fk.setIdHospedaje(1);
			
			detalle = new HospedajeDetalle();
			detalle.setFk(fk);
			Detallerepository.save(detalle);
			
		}
	   
	}
}
