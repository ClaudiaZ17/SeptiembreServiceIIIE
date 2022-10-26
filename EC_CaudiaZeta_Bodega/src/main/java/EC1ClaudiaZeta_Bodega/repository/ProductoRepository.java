package EC1ClaudiaZeta_Bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC1ClaudiaZeta_Bodega.model.Producto;



@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
