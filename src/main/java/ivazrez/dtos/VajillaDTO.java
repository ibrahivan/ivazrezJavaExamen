package ivazrez.dtos;
/**
 * Clase VajillaDTO para manejar datos
 */

public class VajillaDTO {

    private Long idElemento;
    private String nombreElemento= "aaaaa";
	private String descripcionElemento= "aaaaa";
    private int cantidadElemento=0;
    private String codigoElemento= "aaa";
    
    //get y set
	public Long getIdElemento() {
		return idElemento;
	}
	public void setIdElemento(Long idElemento) {
		this.idElemento = idElemento;
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
	public String getCodigoElemento() {
		return codigoElemento;
	}
	public void setCodigoElemento(String codigoElemento) {
		this.codigoElemento = codigoElemento;
	}
	
	
	//Constructores
	public VajillaDTO() {
		super();
	}
	
	public VajillaDTO(Long idElemento, String nombreElemento, String descripcionElemento, int cantidadElemento,
			String codigoElemento) {
		super();
		this.idElemento = idElemento;
		this.nombreElemento = nombreElemento;
		this.descripcionElemento = descripcionElemento;
		this.cantidadElemento = cantidadElemento;
		this.codigoElemento = codigoElemento;
	}
	
	//tostring
	@Override
	public String toString() {
		return "VajillaDTO [idElemento=" + idElemento + ", nombreElemento=" + nombreElemento + ", descripcionElemento="
				+ descripcionElemento + ", cantidadElemento=" + cantidadElemento + ", codigoElemento=" + codigoElemento
				+ "]";
	}
	
	
	
	
    
    
}
