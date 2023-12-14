package ivazrez.servicios;

import java.util.List;

import ivazrez.daos.Vajilla;
import ivazrez.dtos.PrestamoDTO;
import ivazrez.dtos.VajillaDTO;
import jakarta.persistence.EntityManager;
/**
 * Interfaz de los servicios
 */
public interface InterfazServicios {

	public void DarAltaElemento(VajillaDTO vajDTO , EntityManager em);
	public void EliminarElemento(VajillaDTO vajDTO , EntityManager em);
	public void ModificarElemento(VajillaDTO vajDTO , EntityManager em);
	public void MostrarStock(EntityManager em);
	public void CrearReserva(PrestamoDTO presDTO , EntityManager em);
	
}
