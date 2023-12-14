package ivazrez.servicios;
/**
 * Clase implementacion del menu
 */
public class ImplMenu implements InterfazMenu {

	@Override
	public void mostrarMenu() {
		System.out.println("\n\t\t----Menú----");
		System.out.println("\n\t\t1. Alta elemento");
		System.out.println("\n\t\t2. Eliminar elemento");
		System.out.println("\n\t\t3. Modificar cantidad elemento");
		System.out.println("\n\t\t4. Mostrar stock");
		System.out.println("\n\t\t5. Crear reserva");
		System.out.println("\n\t\t0. Cerrar app");

	}

}
