package EC1ClaudiaZeta_Bodega.service;

import java.util.List;

import EC1ClaudiaZeta_Bodega.model.Producto;



public interface ProductoServicio {

	
	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);
	
	
}
