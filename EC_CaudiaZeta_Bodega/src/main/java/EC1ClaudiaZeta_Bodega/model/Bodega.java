package EC1ClaudiaZeta_Bodega.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bodegas")
public class Bodega {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idbodega;
	private String nombrebodega;
	private String direccion;
	//private Integer idproducto;
	
	

	
	@ManyToOne
	@JoinColumn(
			name="idproducto",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (idproducto) references productos(idproducto)")
	)
	
	
	
	
	public Integer getIdbodega() {
		return idbodega;
	}
	public void setIdbodega(Integer idbodega) {
		this.idbodega = idbodega;
	}
	public String getNombrebodega() {
		return nombrebodega;
	}
	public void setNombrebodega(String nombrebodega) {
		this.nombrebodega = nombrebodega;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//public Integer getIdproducto() {
		//return idproducto;
	//
	//public void setIdproducto(Integer idproducto) {
		//this.idproducto = idproducto;
	}





