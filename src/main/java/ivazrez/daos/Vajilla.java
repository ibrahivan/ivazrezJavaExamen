package ivazrez.daos;

/**
 * Clase VajillaDAO donde estan las relaciones de tablas
 */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="Vajilla", schema="esqExaDos")
public class Vajilla {
	
	@Column(name="idElemento", nullable=false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idElemento;
	
	@Column(name="codigoElemento", nullable=false)
    private String codigoElemento;
	
	@Column(name="nombreElemento")
    private String nombreElemento;
	
	@Column(name="descripcionElemento")
    private String descripcionElemento;
	
	@Column(name="cantidadElemento")
    private int cantidadElemento;
	
	@ManyToOne  							
	@JoinColumn(name="idReserva")			
	private Prestamo prestamo;

	
	//Get y set
	public Long getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(Long idElemento) {
		this.idElemento = idElemento;
	}

	public String getCodigoElemento() {
		return codigoElemento;
	}

	public void setCodigoElemento(String codigoElemento) {
		this.codigoElemento =codigoElemento;
	}

	public String getNombreElemento() {
		return nombreElemento;
	}

	public void setNombreElemento(String nombreElemento) {
		this.nombreElemento = nombreElemento;
	}

	public String getDescripcionElemento() {
		return descripcionElemento;
	}

	public void setDescripcionElemento(String descripcionElemento) {
		this.descripcionElemento = descripcionElemento;
	}

	public int getCantidadElemento() {
		return cantidadElemento;
	}

	public void setCantidadElemento(int cantidadElemento) {
		this.cantidadElemento = cantidadElemento;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	
	//Constructores

	public Vajilla() {
		super();
	}

	public Vajilla(Long idElemento, String codigoElemento, String nombreElemento, String descripcionElemento,
			int cantidadElemento) {
		super();
		this.idElemento = idElemento;
		this.codigoElemento = codigoElemento;
		this.nombreElemento = nombreElemento;
		this.descripcionElemento = descripcionElemento;
		this.cantidadElemento = cantidadElemento;
	
	}
	//Tostring
	@Override
	public String toString() {
		return "Vajilla [idElemento=" + idElemento + ", codigoElemento=" + codigoElemento + ", nombreElemento="
				+ nombreElemento + ", descripcionElemento=" + descripcionElemento + ", cantidadElemento="
				+ cantidadElemento + "]";
	}	
	
	
	
	
}
