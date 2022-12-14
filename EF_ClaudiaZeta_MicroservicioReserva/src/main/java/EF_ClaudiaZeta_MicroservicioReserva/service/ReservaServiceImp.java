package EF_ClaudiaZeta_MicroservicioReserva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import EF_ClaudiaZeta_MicroservicioReserva.dto.ReservaDTO;
import EF_ClaudiaZeta_MicroservicioReserva.model.Reserva;
import EF_ClaudiaZeta_MicroservicioReserva.repository.ReservaRepository;



@Service
public class ReservaServiceImp implements ReservaService{


	@Autowired
	private ReservaRepository repository;
	
	@Override
	public List<ReservaDTO> listar() {
		// TODO Auto-generated method stub
		
		List<ReservaDTO> listado = new ArrayList<>();
		ReservaDTO dto = null;
				
		for (Reserva reserva : repository.findAll()) {
			dto = new ReservaDTO();
			dto.setCodReserva(reserva.getIdReserva());
			dto.setCosto(reserva.getCosto());
			listado.add(dto);
		}
		
	
		return listado;

	}

	@Override
	public ReservaDTO obtenerxId(Integer id) {
		
		Reserva reserva = repository.findById(id).orElse(null);
		
		ReservaDTO dto = new ReservaDTO();
		dto.setCodReserva(reserva.getIdReserva());
		dto.setCosto(reserva.getCosto());
		
		return dto;
	}

	@Override
	public void guardar(ReservaDTO reservaDTO) {
		
		Reserva reserva = new Reserva();
		reserva.setIdReserva(reservaDTO.getCodReserva());
		reserva.setCosto(reservaDTO.getCosto());
		repository.save(reserva);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
	
	@Override
	public void actualizar(ReservaDTO reservaDTO) {
		
		Reserva reserva = new Reserva();
		reserva.setIdReserva(reservaDTO.getCodReserva());
		reserva.setCosto(reservaDTO.getCosto());
		
		repository.saveAndFlush(reserva);
	}
}
