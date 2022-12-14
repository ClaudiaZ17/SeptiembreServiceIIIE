package EF_ClaudiaZeta_MicroservicioTurista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import EF_ClaudiaZeta_MicroservicioTurista.dto.TuristaDTO;
import EF_ClaudiaZeta_MicroservicioTurista.service.TuristaService;


@Controller
@RequestMapping("/api/turista/v1")
public class TuristaController {
	
	@Autowired
	private TuristaService service;
	
	@GetMapping("/hola")
	public @ResponseBody String hola(){
		return "hola querido turista";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<TuristaDTO> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody TuristaDTO obtenerId(@PathVariable Integer id) {
		return service.obtenerxId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody TuristaDTO dto) {
		service.guardar(dto);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody TuristaDTO dto) {
		service.actualizar(dto);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}

}
