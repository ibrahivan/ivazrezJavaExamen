package ivazrez.daos;
/**
 * Clase PrestamoDAO donde esta las relaciones con las tablas
 */
import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Prestamo", schema="esqExaDos")
public class Prestamo {

	@Column(name="idReserva", nullable=false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReserva;
	
	@Column(name="fchReserva")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchReserva;
	
	 @OneToMany(mappedBy="prestamo") 
	 private List<Vajilla> listVajillPres;
	 
//Get y set
	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public Calendar getFchReserva() {
		return fchReserva;
	}

	public void setFchReserva(Calendar fchReserva) {
		this.fchReserva = fchReserva;
	}

	public List<Vajilla> getListVajillPres() {
		return listVajillPres;
	}

	public void setListVajillPres(List<Vajilla> listVajillPres) {
		this.listVajillPres = listVajillPres;
	}
	
//Constructores
	
	public Prestamo() {
		super();
	}

	public Prestamo(Long idReserva, Calendar fchReserva) {
		super();
		this.idReserva = idReserva;
		this.fchReserva = fchReserva;
		
	}
	
//ToString
	@Override
	public String toString() {
		return "Prestamo [idReserva=" + idReserva + ", fchReserva=" + fchReserva + "]";
	}

	
	 
	 
}
