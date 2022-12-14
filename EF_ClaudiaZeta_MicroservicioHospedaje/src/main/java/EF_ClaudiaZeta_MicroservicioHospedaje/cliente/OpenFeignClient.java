package EF_ClaudiaZeta_MicroservicioHospedaje.cliente;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import EF_ClaudiaZeta_MicroservicioHospedaje.dto.TuristaDTO;

@FeignClient (name = "turista-microservicio", url= "localhost:8080")
public interface OpenFeignClient {
	
	
	@GetMapping("//api//turista/v1/listar")
	public List<TuristaDTO>listarTuristas();
	

}
