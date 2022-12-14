package EF_ClaudiaZeta_MicroservicioTurista.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EF_ClaudiaZeta_MicroservicioTurista.dto.TuristaDTO;
import EF_ClaudiaZeta_MicroservicioTurista.model.Turista;
import EF_ClaudiaZeta_MicroservicioTurista.repository.TuristaRepository;




@Service
public class TuristaServiceImp implements TuristaService {

	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<TuristaDTO> listar() {
		// TODO Auto-generated method stub
		
		List<TuristaDTO> listado = new ArrayList<>();
		TuristaDTO dto = null;
				
		for (Turista turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setCodTurista(turista.getIdTurista());
			dto.setNombreturista(turista.getNombreturista());
			dto.setDireccion(turista.getDireccion());
			dto.setCelular(turista.getCelular());
			
			listado.add(dto);
		}
		
	
		return listado;

	}

	@Override
	public TuristaDTO obtenerxId(Integer id) {
		
		Turista turista = repository.findById(id).orElse(null);
		
		TuristaDTO dto = new TuristaDTO();
		dto.setCodTurista(turista.getIdTurista());
		dto.setNombreturista(turista.getNombreturista());
		dto.setDireccion(turista.getDireccion());
		dto.setCelular(turista.getCelular());
		
		return dto;
	}

	@Override
	public void guardar(TuristaDTO turistaDTO) {
		
		Turista turista = new Turista();
		turista.setIdTurista(turistaDTO.getCodTurista());
		turista.setNombreturista(turistaDTO.getNombreturista());
		turista.setDireccion(turistaDTO.getDireccion());
		turista.setCelular(turistaDTO.getCelular());
		repository.save(turista);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
	
	@Override
	public void actualizar(TuristaDTO turistaDTO) {
		
		Turista turista = new Turista();
		turista.setIdTurista(turistaDTO.getCodTurista());
		turista.setNombreturista(turistaDTO.getNombreturista());
		turista.setDireccion(turistaDTO.getDireccion());
		turista.setCelular(turistaDTO.getCelular());
		
		repository.saveAndFlush(turista);
	}

	
}
