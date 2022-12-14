package EF_ClaudiaZeta_MicroservicioTurista.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "turistas")
public class Turista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer idTurista;
	public String nombreturista;
	public String celular;
	public String direccion;
	
	public Integer getIdTurista() {
		return idTurista;
	}
	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}
	public String getNombreturista() {
		return nombreturista;
	}
	public void setNombreturista(String nombreturista) {
		this.nombreturista = nombreturista;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
