package ivazrez.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ivazrez.daos.Vajilla;
import ivazrez.dtos.PrestamoDTO;
import ivazrez.dtos.VajillaDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
/**
 * Clase de implementacion de los metodos crud
 */
public class ImplServicios implements InterfazServicios {
/**
 * Metodo para dar de alta un elemento 
 * param entrada: VajillaDTO y EntityManager
 * 
 */
	@Override
	public void DarAltaElemento(VajillaDTO vajDTO, EntityManager em) {
		// TODO Auto-generated method stub		
		
		try {
			
			Vajilla vajillaDao= new Vajilla();
			vajillaDao.setNombreElemento(vajDTO.getNombreElemento());
			vajillaDao.setDescripcionElemento(vajDTO.getDescripcionElemento());
			vajillaDao.setCantidadElemento(vajDTO.getCantidadElemento());
			vajillaDao.setCodigoElemento(vajDTO.getNombreElemento()+vajDTO.getDescripcionElemento());
			
			em.getTransaction().begin();

			em.persist(vajillaDao);

			em.getTransaction().commit();
			
			System.out.println("\n\tElemento registrado correctamente");
		}catch(Exception e) {

			System.out.println("\n\tElemento no se ha registrado");
			e.printStackTrace();

		}
	}
	/**
	 * Metodo para dar eliminar buscando por su descripcion
	 * param entrada: VajillaDTO y EntityManager
	 * 
	 */
	@Override
	public void EliminarElemento(VajillaDTO vajDTO, EntityManager em) {
		// TODO Auto-generated method stub

		try {
			Vajilla vajillaDao= new Vajilla();
			String descripcionElemento= vajDTO.getDescripcionElemento();
			em.getTransaction().begin();
			
			Query query=em.createQuery("SELECT v FROM Vajilla v WHERE v.descripcionElemento LIKE :descripcionElemento", Vajilla.class);
			
			vajillaDao=(Vajilla)query.getResultList();

			em.remove(vajillaDao);

			em.getTransaction().commit();
			
			System.out.println("\n\tElemento eliminado correctamente");

		} catch (Exception e) {

			System.out.println("\n\tElemento no eliminado");
			e.printStackTrace();

		}
	}
	/**
	 * Metodo para modificiar un elemento buscando por su descriptcion
	 * param entrada: VajillaDTO y EntityManager
	 * 
	 */
	@Override
	public void ModificarElemento(VajillaDTO vajDTO, EntityManager em) {
		// TODO Auto-generated method stub
		try {
			Vajilla vajillaDao= new Vajilla();
			Scanner sc = new Scanner(System.in);
			String descripcionElemento= vajDTO.getDescripcionElemento();

			em.getTransaction().begin();
			Query query=em.createQuery("SELECT v FROM Vajilla v WHERE v.descripcionElemento LIKE :descripcionElemento", Vajilla.class);
			
			vajillaDao=(Vajilla)query.getResultList();
			
			System.out.print("\tCantidad a disminuir: ");
			if(vajillaDao.getCantidadElemento()-sc.nextInt()>=0) {
			vajillaDao.setCantidadElemento(vajDTO.getCantidadElemento()-sc.nextInt());
			em.merge(vajillaDao);
			em.getTransaction().commit();
			}
			else
				System.out.println("La cantidad final no puede ser negativa");

		}catch(Exception e) {

			e.printStackTrace();

		}

	}
	/**
	 * Metodo paramostrar el stock
	 * param entrada: VajillaDTO y EntityManager
	 * 
	 */
	@Override
	public void MostrarStock(EntityManager em) {
		// TODO Auto-generated method stub
		List<Vajilla> listVaj = new ArrayList<Vajilla>();

		try {

			Query query=em.createQuery("SELECT a FROM Vajilla a", Vajilla.class);

			listVaj=query.getResultList();
                //Mostramos por pantalla
                System.out.println();
		for (Vajilla aux : listVaj) {
			System.out.println("\t"+aux.getCodigoElemento()+"--"+aux.getNombreElemento()+"--"+aux.getCantidadElemento()+"\n");
		}

		}catch(Exception e) {

			e.printStackTrace();

		}

	}
	/**
	 * Metodo para crear una reserva
	 * param entrada: PrestamoDTO y EntityManager
	 * 
	 */
	@Override
	public void CrearReserva(PrestamoDTO presDTO, EntityManager em) {
		// TODO Auto-generated method stub

	}

}
