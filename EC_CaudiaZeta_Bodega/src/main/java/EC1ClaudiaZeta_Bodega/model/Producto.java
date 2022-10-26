package EC1ClaudiaZeta_Bodega.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name="productos")
public class Producto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idproducto;
	private String producto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	
	
	//relaciones
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name="producto_bodega",
			joinColumns = @JoinColumn(
					name="id_producto",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_producto) references productos(id_producto)")
			),
			inverseJoinColumns = @JoinColumn(
					name="id_cliente",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references clientes(id_cliente)")
			)
	)
	private List<Cliente> clientes = new ArrayList<>();



	@OneToMany(mappedBy = "producto")
	private List<Bodega> bodegas =new ArrayList<>();

	
	
	
	public Integer getidproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public String getPoroducto() {
		return producto;
	}
	public void setPoroducto(String poroducto) {
		this.producto = poroducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	} 
	

}
