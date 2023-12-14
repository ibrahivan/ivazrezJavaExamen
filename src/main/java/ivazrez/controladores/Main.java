package ivazrez.controladores;

import java.util.Scanner;

import ivazrez.dtos.VajillaDTO;
import ivazrez.servicios.ImplMenu;
import ivazrez.servicios.ImplServicios;
import ivazrez.servicios.InterfazMenu;
import ivazrez.servicios.InterfazServicios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
/**
 * Clase principal donde llamamos al menu y su logica con los metodos
 * author:ivanVazquez
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancio los entity
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		InterfazMenu intM = new ImplMenu();
		InterfazServicios intS= new ImplServicios();
		VajillaDTO vajDTO = new VajillaDTO();
		Scanner sc = new Scanner(System.in);
		boolean cerrarMenu=false;
		int opcion;
		do {
			intM.mostrarMenu(); // mostramos menu
			opcion = sc.nextLine().charAt(0) - '0';
			// control de errores
			while (opcion < 0 || opcion > 5) {
				System.out.println("\n\t\t\t**ERROR**");
				System.out.print("\t\tIntroduce una opcion: ");
				opcion = sc.nextLine().charAt(0) - '0';
			}
			System.out.flush();
			switch (opcion) {

			case 1:

				System.out.println("\n\t\t----Alta elemento----");
				Scanner sc1 = new Scanner(System.in);
				
				System.out.print("\n\t\t Introduzca el nombre del elemento: ");
				vajDTO.setNombreElemento(sc1.next());
				System.out.print("\n\t\t Introduzca la descripcion del elemento:");
				vajDTO.setDescripcionElemento(sc1.next());
				System.out.print("\n\t\t Introduzca la cantidad del elemento: ");
				vajDTO.setCantidadElemento(sc1.nextInt());
				
				intS.DarAltaElemento(vajDTO, em);
				
				break;
			case 2:
				System.out.println("\n\t\t----Eliminar elemento----");
				Scanner sc2 = new Scanner(System.in);
				
				System.out.print("\n\t\t Introduzca el codigo del elemento a eliminar: ");
				vajDTO.setCodigoElemento(sc2.next());
				intS.EliminarElemento(vajDTO, em);
				break;

			case 3:
				System.out.println("\n\t\t----Modificar cantidad elemento----");
				intS.ModificarElemento(vajDTO, em);
				break;
			case 4:
				System.out.println("\n\t----Mostrar stock----");
				intS.MostrarStock(em);
				break;

			case 5:
				System.out.println("\n\t\t----Crear reserva----");
		
				break;
			case 0:
				cerrarMenu=true;
				break;
        }
				System.out.println("Pulse una tecla para volver al menu");
				sc.nextLine();

    } while (!cerrarMenu);

		System.out.println("\n\tSaliendo de la aplicacion  \n\tPulse cualquier tecla para cerrar el programa");
		sc.nextLine();
	}
		
}


