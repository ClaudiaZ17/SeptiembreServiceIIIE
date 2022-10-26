package EC1ClaudiaZeta_Bodega.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcliente;
	private String nombrecliente;
	private String direccioncliente;
	private String dni;
	
	//relación

	@ManyToMany(mappedBy = "clientes", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Producto> productos = new ArrayList<>();
	
	
	
	
	public Integer getidcliente() {
		return idcliente;
	}
	public void setidcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getDireccioncliente() {
		return direccioncliente;
	}
	public void setDireccioncliente(String direccioncliente) {
		this.direccioncliente = direccioncliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
