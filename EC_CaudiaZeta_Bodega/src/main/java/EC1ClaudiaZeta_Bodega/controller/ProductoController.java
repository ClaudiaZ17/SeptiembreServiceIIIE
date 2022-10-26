package EC1ClaudiaZeta_Bodega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import EC1ClaudiaZeta_Bodega.model.Producto;
import EC1ClaudiaZeta_Bodega.service.ProductoServicio;


//examen2 

@RestController
@RequestMapping("/producto/v1")
public class ProductoController {
	
	@Autowired
	private ProductoServicio service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Producto>> listar(){
		return new ResponseEntity<List<Producto>>(service.listar(), HttpStatus.OK) ;
	}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Producto producto ){
		service.guardar(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Producto> obtenerPorId(@PathVariable Integer id){
		
		Producto producto = service.obtener(id);
		
		if( producto != null) {
			return new ResponseEntity<Producto>(producto, HttpStatus.OK);
		}else {
			return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Producto producto){
		
		Producto p = service.obtener(producto.getidproducto());
		
		if( p != null) {
			service.actualizar(producto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void>eliminar(@PathVariable Integer id){
		
		Producto producto = service.obtener(id);

		if(producto != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}


}
