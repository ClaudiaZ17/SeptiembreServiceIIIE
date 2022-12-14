package EF_ClaudiaZeta_MicroservicioTurista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EF_ClaudiaZeta_MicroservicioTurista.model.Turista;


@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{
	

}
