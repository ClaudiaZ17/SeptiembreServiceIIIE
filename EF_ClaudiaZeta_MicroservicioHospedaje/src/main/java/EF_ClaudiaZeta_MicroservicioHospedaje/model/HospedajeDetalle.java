package EF_ClaudiaZeta_MicroservicioHospedaje.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "detalle_aula")
public class HospedajeDetalle {
	
	@Id
	private HospedajeTurista fk= new HospedajeTurista();

	public HospedajeTurista getFk() {
		return fk;
	}

	public void setFk(HospedajeTurista fk) {
		this.fk = fk;
	}
	
	

}
