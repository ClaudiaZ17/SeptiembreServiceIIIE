package EC3_ClaudiaZeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import EC3_ClaudiaZeta.model.UsuarioCliente;



public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer>{

	UsuarioCliente findByUsuarioCliente(String usuario);




}

	
 

