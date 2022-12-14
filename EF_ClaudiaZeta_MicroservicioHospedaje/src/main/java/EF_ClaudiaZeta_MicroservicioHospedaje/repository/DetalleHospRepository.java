package EF_ClaudiaZeta_MicroservicioHospedaje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EF_ClaudiaZeta_MicroservicioHospedaje.model.HospedajeDetalle;

@Repository
public interface DetalleHospRepository extends JpaRepository<HospedajeDetalle, Integer>{

}
