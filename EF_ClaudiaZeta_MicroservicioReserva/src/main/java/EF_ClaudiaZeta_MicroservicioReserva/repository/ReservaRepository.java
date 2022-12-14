package EF_ClaudiaZeta_MicroservicioReserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EF_ClaudiaZeta_MicroservicioReserva.model.Reserva;



@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
