package EF_ClaudiaZeta_MicroservicioHospedaje.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class HospedajeTurista implements Serializable{
	
	private static final long serialVersionUID = -1748297129868193790L;
	
	@Column(name = "id_Hospedaje", nullable= false)
	private Integer idHospedaje;
	
	@Column(name = "id_Turista", nullable= false)
	private Integer idTurista;

	public Integer getIdHospedaje() {
		return idHospedaje;
	}

	public void setIdHospedaje(Integer idHospedaje) {
		this.idHospedaje = idHospedaje;
	}

	public Integer getIdTurista() {
		return idTurista;
	}

	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}

		

}
