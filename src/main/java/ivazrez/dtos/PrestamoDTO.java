package ivazrez.dtos;
/**
 * Clase PrestamoDTO para manejar datos
 */
import java.util.Calendar;


public class PrestamoDTO {


    private Long idReserva;
	private Calendar fchReserva=null;
	
	//get y set
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
	
	//constructores
	public PrestamoDTO() {
		super();
	}
	public PrestamoDTO(Long idReserva, Calendar fchReserva) {
		super();
		this.idReserva = idReserva;
		this.fchReserva = fchReserva;
	}
	
	//Tostring
	@Override
	public String toString() {
		return "PrestamoDTO [idReserva=" + idReserva + ", fchReserva=" + fchReserva + "]";
	}
	
	
}
